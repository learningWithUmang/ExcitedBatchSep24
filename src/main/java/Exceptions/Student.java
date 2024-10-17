package Exceptions;

import java.sql.SQLException;
import java.util.List;

public class Student {
    public int findStudentByRollNumber(int rollNumber) throws SQLException, EvenNumberException{
        /*
        called method,
        either called method has to handle the exception
        or throw it further to the caller
        db.executeQuery(query) - network issue
         */
        if(rollNumber < 20){
            /*
            db.execute()
             */
            //throw new SQLException();
            System.out.println("Wow");
        }else if(rollNumber % 2 == 0){
            throw new EvenNumberException();
        }else if(rollNumber % 2 == 1){
            throw new OddNumberException();
        }
        return 1;
    }

    public void doSomething(int x){
        int a = 1 ,b= 1;
        if(b != 0){
            int c = a/b;
        }
        //int c = a/b;
        /*
        List<Integer>
        size of this is list is N
        if(i >= 0 && i < N){
           ls.get(i);
        }


         */
        if(x < 20){
            throw new IndexOutOfBoundsException();
        }
    }


    public void doShit(int x){
        doShit(x);
    }
    /*
    Errors are the most unexpected exceptions
    Your code should not handle errors.
    Rather, you code should not have errors.
    Errors are unacceptable.
    NPE
     */


}
/*
Types of exceptions
1. Runtime exceptions / unchecked exceptions
Ex of RTE - Arithmetic, IndexOutOfBounds
2. Checked exceptions - You need to handle the checked exceptions, compiler enforces to handle it
Ex of Checked - SQLException, ClassNotFoundException


You should not even have run time exceptions in your program.

 */