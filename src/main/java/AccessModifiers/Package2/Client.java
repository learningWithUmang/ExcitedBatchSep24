package AccessModifiers.Package2;

import AccessModifiers.Package1.Student;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.id = 2;
        //st1.psp = 12; //can't access default attribute
        //st1.address = "";
        //st1.rollNo = 12;//can't access private
    }
}
