package Exceptions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    /*
    Exceptions - Unexpected or unwanted behaviour during the
    execution of your program.

    Any exception which is not handled simply stops the execution
    of the entire program there.

    1.
    2.
    3. throwing an exception
    4.
    5.
     */

    public static void main(String[] args) throws SQLException {
        Student st1 = new Student();

        st1.doShit(1);
        try {
            int x = st1.findStudentByRollNumber(1);
            System.out.println(x);
        } catch (SQLException ex){
            System.out.println("SQL exception has come, let me try again");
            //throw new SQLException();
            //st1.findStudentByRollNumber(12);
            //Business logic
        } catch (EvenNumberException ex2){
            System.out.println("Even no exception has come");
            throw new SQLException();
        } catch (OddNumberException ex3){
            System.out.println("Odd no exception");
        } finally {
            //close the db connections
            //also helpful for debugging
            //go the final state
            System.out.println("I will execute anyways");
        }

        System.out.println("Outside finally");

        /*
        1.
        2.
        3. Student st = db(rollNo), fails
        stop.......fix and continue, throw an exception
        4. st.age
        5. st.address
         */

        //st1.doSomething();

        List ls = new ArrayList();
        //System.out.println(ls.get(0));
    }
}
/*
Types of exceptions
A,B,C,D
A(root) --- B ---- C --- D
catch(D) - catch(C) --- B --- A
 */