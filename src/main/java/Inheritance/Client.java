package Inheritance;

public class Client {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.name = "Umang Agrawal";
//        user1.userName = "umang_1";
//        user1.email = "umang_1@scaler.com";
//        user1.age = 25;
//
//        user1.login();

        /*
        It's always better to create children of
        specific class as per needed.
         */
        Instructor ins1 = new Instructor();

        System.out.println();
        ins1.userName = "umang_1";
        ins1.setName("Umang Agrawal");
        ins1.email = "umang_1@scaler.com";
        ins1.age = 40;

        ins1.avgRating = 4.87;
        ins1.roleType = "Remote Instructor";

        //ins1.login();
        //ins1.scheduleClass();
        //ins1.startSession();
        //Instructor - User

        D d = new D(10, "Umang"); //only 1 object is created
    }
}
