package Generics;

import java.util.List;

public class Utils {
    public static void simpleDoSomething(Animal animal){

    }

    public static void doSomething(List<? extends Animal> animals){
        //animals.add(new Cat());
        //animals.add(new Cat());
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }

    public static <T extends Animal>List<T> doSomething2(List<T> animals){
        return  animals;
    }
    /*
    ?
     */

    /*
    Dog is an animal
    List<Dog> is not List<Animal>

     */
}
