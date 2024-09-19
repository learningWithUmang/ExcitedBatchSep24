package ClassesAndObjects;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student(); //st1 is a real object/instance

        st1.name = "Swathi";
        st1.batch_id = 1;
        st1.psp = 60;
        st1.rollNo = 20;

        Student st2 = new Student();

        st2.name = "Faisal";
        st2.batch_id = 2;
        st2.psp = 100;
        st2.rollNo = 21;

        st1.attend_Class();
        st1.printStudent();

        st2.solveAssignments();
        st2.printStudent();

        System.out.println("Done");
    }
}
