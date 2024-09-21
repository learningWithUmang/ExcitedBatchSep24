package AccessModifiers.Package2;

import AccessModifiers.Package1.Student;

public class StudentChild extends Student {
    void solveAssignments(){
        id = 12;
        //psp = 12;
        address = "Gkp";
        //protected can be accessed from child in diff package but default cannot be
        //rollNo = 12;
    }
}

/*
Public - can be accessed by anybody
default - can be only accessed from same package
protected - default + child from diff package can also access
private - only within the class accessible
 */