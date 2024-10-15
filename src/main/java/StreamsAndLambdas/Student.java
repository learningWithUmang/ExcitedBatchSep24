package StreamsAndLambdas;

public class Student implements Comparable<Student>{
    String name;
    double psp;
    String universityName;

    Student(String name,
            double psp,
            String universityName){
        this.psp = psp;
        this.name = name;
        this.universityName = universityName;
    }

    /*
    Natural ordering
    as per psp
    if psp is same for 2 students, as per name
     */
    @Override
    public int compareTo(Student st) {
        //some object will be calling this method
        //obj1.compareTo(obj2)
        //(obj1, obj2)
       if(this.psp < st.psp){
           return -1;
       }else if(this.psp > st.psp){
           return 1;
       }else{
           //this.name and st.name
           //a.compareTo(b)
           //if a < b , return negative, else positive
           return this.name.compareTo(st.name);
       }
    }
}
