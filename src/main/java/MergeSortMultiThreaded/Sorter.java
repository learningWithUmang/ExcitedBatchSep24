package MergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort ;
    ExecutorService ex;

    Sorter(List<Integer> arrayToSort, ExecutorService ex){
        this.arrayToSort = arrayToSort;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Write the merge sort code here
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        //find the middle index
        int mid = arrayToSort.size() / 2;

        //divide the array into 2 parts
        //left - [0, mid - 1] , right - [mid, N - 1]

        List<Integer> leftHalf = new ArrayList<>();
        for(int i = 0 ; i < mid ; i++){
            leftHalf.add(arrayToSort.get(i));
        }

        List<Integer> rightHalf = new ArrayList<>();
        for(int i = mid ; i < arrayToSort.size() ; i++){
            rightHalf.add(arrayToSort.get(i));
        }

        Sorter taskForLeft = new Sorter(leftHalf, ex);
        Sorter taskForRight = new Sorter(rightHalf, ex);


        Future<List<Integer>> leftSortedFuture = ex.submit(taskForLeft);
        Future<List<Integer>> rightSortedFuture = ex.submit(taskForRight);

        leftHalf = leftSortedFuture.get();
        rightHalf = rightSortedFuture.get(); //waiting for the futures

        //merge both the sorted arrays
        List<Integer> finalSortedArray = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < leftHalf.size() && j < rightHalf.size()){
            if(leftHalf.get(i) < rightHalf.get(j)){
                finalSortedArray.add(leftHalf.get(i));
                i++;
            }else{
                finalSortedArray.add(rightHalf.get(j));
                j++;
            }
        }

        while(i < leftHalf.size()){
            finalSortedArray.add(leftHalf.get(i));
            i++;
        }

        while(j < rightHalf.size()){
            finalSortedArray.add(rightHalf.get(j));
            j++;
        }

        return finalSortedArray;
    }
}
