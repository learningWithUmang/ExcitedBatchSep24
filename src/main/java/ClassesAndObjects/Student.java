package ClassesAndObjects;

public class Student {
    String name;
    int rollNo;
    int batch_id;
    double psp;

    void attend_Class(){
        System.out.println("Student is attending class");
    }

    void solveAssignments() {
        System.out.println("Solving assignments");
    }

    void printStudent(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(batch_id);
        System.out.println(psp);
    }
}


/*
Class is going to help me hold attributes and baheviour of idea together
 */
