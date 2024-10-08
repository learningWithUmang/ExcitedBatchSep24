package Generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) {
        Pair p = new Pair(); //passing the data types to the class is optional

        p.first = "Umang";
        p.second = 90.231;

        HashMap hm = new HashMap();
        //Java 5 introduced hashmap<k,v>
        //To support backward compatability java didn't remove raw types
        //(key, value)
        hm.put("18", "Umang");
        hm.put(90.121, "Adfhgjhe");

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("Umang",12);
        hm2.put("India", 160000000);

        HashMap<Integer, Long> hm3 = new HashMap</*optional*/Integer,Long>();

        Pair<Integer, String> p1 = new Pair<>();
        Pair<String, Integer> p2 = new Pair<>();

        Integer i2 = p1.doSomethingNonStatic(14, 12);


        //Read about difference between int and Integer
        p1.first = 12;
        p1.second = "Umang";

        String x = p1.getSecond();
        Integer i = p2.getSecond();
        //Is it putting a CT check?

        p1.setFirst(12);
        p2.setFirst("Umang");

        Pair.doSomethingStatic(12, 15);
        Pair.doSomethingStatic("Umang", "Agrwal");
        Pair.<String,Integer>doSomethingStatic("Umang", 12);


        //Pair<Integer,String> p2 = new Pair<Integer,String>();


        //Raw types

        Utils.simpleDoSomething(new Animal());
        Utils.simpleDoSomething(new Dog());
        Utils.simpleDoSomething(new Cat());

        List<Animal> animals = new ArrayList<>();
        Utils.doSomething(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        Utils.doSomething(dogs);

        List<Cat> cats = new ArrayList<>();

        Utils.doSomething(cats);

        List<Dog> dogs1 = Utils.doSomething2(dogs);

        /*
        We cannot store List of dogs in List of Animals
        We will have to explicitly define generic for that
         */

    }
}
