package StreamsAndLambdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    /*
    Lambdas
    Streams


    Lamdas :-
    1. Runnable
    2. Comparable
    3. Callable
    4. Comparator

    All the above interfaces are known as Functional interface.
    Functional interfaces - Those interfaces who demand only one method.

    Wherever you see a functional interface kind of thing, Lambdas should come to your mind.

    Lamdas expressions : () -> {}
    (input parameters) -> {output from the method}

     */

    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();

        ls.add(new Student("Umang", 90, "ABES"));
        ls.add(new Student("Prince", 84, "ABC"));
        ls.add(new Student("Karan", 86, "XYZ"));

        Collections.sort(ls); //sort as per the natural ordering defined inside the class

        Collections.sort(ls, new StudentUniversityNameComparator());

        //1st way
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.universityName.compareTo(t1.universityName);
            }
        });

        //2nd (dynamic way)

        Collections.sort(ls, (Student student, Student t1) -> {
            return student.universityName.compareTo(t1.universityName);
        });

        /*
        Lambda expressions are going to beautify your code.
        They are syntatical sugar.
         */

        /*
        I want to print Hello World using a thread.
         */

        HelloWorldPrint task = new HelloWorldPrint();
        Thread t = new Thread(task);
        t.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Hello World");
        });
        t2.start();

        Runnable r = () -> {
            System.out.println("Hello World");
        };
        Thread t3 = new Thread(r);
        t3.start();

        Thread t4 = new Thread(() -> System.out.println("Hello World"));
        t4.start();

        /*
        You can omit curly braces if you've only one line inside the output of method
         */

        /*
        I want to perform some mathematical operations
        Add, subtract, multiply, divide, complex operation on 2 variables
         */

        /*
        Add, a,b
        Subtract, c,d
         */
        ArithmeticOperation additionOperation = new Addition();
        System.out.println(additionOperation.operate(2,5));


        ArithmeticOperation additionOp = (int a, int b) -> {
            return a + b;
        };

        ArithmeticOperation subtractOp = (int a, int b) -> {
            return a - b;
        };

        ArithmeticOperation multiplyOp = (int a, int b) -> {
            return a*b;
        };

        ArithmeticOperation complexOp = (int a, int b) -> {
          if(a < b){
              return a + b;
          }else if(b > a){
              return a - b;
          }else{
              return a * b / a;
          }
        };

        System.out.println(additionOp.operate(2,5));
        System.out.println(subtractOp.operate(2,4));
        System.out.println(multiplyOp.operate(2,9));
        System.out.println(complexOp.operate(2,9));

        /*
        Lamdas are going to help wherever you are creating objects of classes who implement
        functional interfaces.
        This is all about lambdas.
        Break of 7 minutes
         */

        /*
        Streams - like a pipeline
        Pipeline attached a data source.

        Print 1000 rows
        for(int i = 1 ; i <= 1000 ; i++){
            if(i == 500th){
                ...
            }
         }

         Streams does affect the performance of the code on the positive side
         Streams are very smart and they use internal data structures to optimize things on their own.

         */

        List<Integer> ls2 = List.of(2,5,3,10,8,9,1);
        List<Integer> ls3 = List.of(1,5,7,9);

        Stream<Integer> s1 = ls2.stream();
        Stream<Integer> s2 = ls2.stream();
        Stream<Integer> s3 = ls2.stream();

        /*
        s1 is nothing but a pipeline attched to the list
        It's actually the stream reference
         */

        System.out.println(s1);
        /*
        There are methods using which you can read data from the stream.
        Intermediate - returns the stream reference
        Terminal - returns the data and after which the stream is closed. (the last method on a stream)
        Streams can be operated at max once.
         */

        //System.out.println(s1.limit(3).count());
        //System.out.println(s2.limit(2));
        //System.out.println(s3.count());
        /*
        You can have as many methods you want on top of stream
         */

//        for(int i = 0 ; i < ls2.size();  i++){
//            System.out.println(ls2.get(i));
//        }
        /*
        You can use lamda expressions inside stream
         */
        s1.forEach((elem) -> System.out.print(elem + " "));
//        System.out.println(s1.count()); You have operated already on s1


        /*
        map, filter, sort, reduce - They help you reduce lots of lines of code.
         */

        System.out.println();
        List<Integer> res = ls2.
                stream().
                filter((elem) -> elem % 2 == 0).
                collect(Collectors.toList());

        System.out.println(ls2);
        System.out.println(res);

        List<Integer> res2 = ls2.
                stream().
                filter((elem) -> elem % 2 == 0).
                map((elem) -> elem * elem).
                sorted((a, b) -> b - a ).
                collect(Collectors.toList());

        //res2.get(0);

        System.out.println(res2);
        /*
        Even I don't know the internal working of streams.
        findFirst
         */

        Optional<Integer> res4 = ls3.
                stream().
                filter((elem) -> elem % 2 == 0).
                map((elem) -> elem * elem).
                sorted((a, b) -> b - a).
                findFirst();

        if(res4.isEmpty()){
            System.out.println("All elements were odd");
        }else{
            System.out.println(res4.get());
        }

        /*
        reduce method

         */

        Integer sum = 0;
        for(int i = 0 ; i < ls3.size(); i++){
            sum = sum + ls3.get(i);
        }

        System.out.println(sum);


        Integer sum2 = ls3.
                stream().
                filter((elem ) -> (elem & 1) == 1). //1,3,7,9
                map((elem) -> elem*elem*elem). //1,27,343,729 = 1198
                reduce(0, (a, b) -> a + b);


        Integer ans2 = ls3.
                stream().
                filter((elem ) -> (elem & 1) == 1). //1,3,7,9
                        map((elem) -> elem*elem*elem). //1,27,343,729 = 1198
                        reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a,b));
        System.out.println(ans2);

        System.out.println(sum2);
        Integer ans = Integer.MAX_VALUE;

        System.out.println(ls3.stream().reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a,b)));

        /*
        (a,b)

         */
        /*
        List.Of()
         */

        List<Integer> ls6 = new ArrayList<>(List.of(1,4,5));
        //ls6.add(1);

// Sorting with proper comparisond 
        Collections.sort(ls6, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);  // Ascending order
            }
        });


        System.out.println(ls6);
    }
}
