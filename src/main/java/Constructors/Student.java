package Constructors;

public class Student {
    String name;
    int rollNo;
    double psp;
    int batch_id = 2;


    Student(String name, int rollNo){
        System.out.println();
        //this keyword is used to refer attribute of the object
        this.name = name;
        this.rollNo = rollNo;
    }
    /*
    whenever you call a manual constructor : -
    1. it calls the default constructor
    2. it executes the code inside the manual constructor
     */

    Student(String name, double psp){
        this.name = name;
        this.psp = psp;
    }

    Student(int batch_id){
        this.batch_id = batch_id;
    }

    Student(Student st){ //copy constructor
        this.name = st.name;
        this.rollNo = st.rollNo;
        this.psp = st.psp;
        this.batch_id = st.batch_id;
    }

}
