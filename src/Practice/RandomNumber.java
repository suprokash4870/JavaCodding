package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomNumber {

    String name;
    int age;

    public RandomNumber(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String [] args) {

        RandomNumber rn = new RandomNumber("Suprokash Sanyal",38);

        System.out.println(rn.name);
        System.out.println(rn.age);


    }

}


