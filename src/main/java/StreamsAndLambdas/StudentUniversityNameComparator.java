package StreamsAndLambdas;

import java.util.Comparator;

public class StudentUniversityNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student f, Student s) {
        return f.universityName.compareTo(s.universityName);
    }
}
/*
I have more custom sorting
Create a comparator class and pass it's object in the function of sort
 */
