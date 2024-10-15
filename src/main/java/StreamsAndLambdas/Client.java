package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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


    }
}
