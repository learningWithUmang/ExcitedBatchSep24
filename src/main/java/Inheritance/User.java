package Inheritance;

public class User {
    private String name;
    int age;
    String userName;
    String email;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void login() {
        System.out.println("User is logging in");
    }

    User(){
        System.out.println("User's constructor is called");
    }
}
