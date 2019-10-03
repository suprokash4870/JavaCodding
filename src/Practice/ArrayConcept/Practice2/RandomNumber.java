package Practice.ArrayConcept.Practice2;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    public static void main(String [] args){

        ArrayList <Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for(int i =1; i<=5;i++){
        int x =  random.nextInt(10);
        arrayList.add(x);
        System.out.println(x);
    }



       }

}

