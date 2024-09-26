package LearningStatic;

public class Client {
    public static void main(String[] args) {
        AcademyStudent as1 = new AcademyStudent();

        AcademyStudent as2 = new AcademyStudent();

        AcademyStudent as3 = new AcademyStudent();

        /*
        You can directly acees the static methods and variab;es
        using the class name
         */

        AcademyStudent.curriculum = "xyz";
        //AcademyStudent.fees = 100000000;
        //AcademyStudent.universityName = "Scaler";

        as1.curriculum = "yuz";

        System.out.println(AcademyStudent.curriculum);
        System.out.println(as1.curriculum);
        System.out.println(as2.curriculum);
        System.out.println(as3.curriculum);

        AcademyStudent.curriculum = "sdf";
        System.out.println(AcademyStudent.curriculum);
        System.out.println(as1.curriculum);
        System.out.println(as2.curriculum);
        System.out.println(as3.curriculum);

        as1.doSomething();
        AcademyStudent.doSomething();
        System.out.println();
    }
}
