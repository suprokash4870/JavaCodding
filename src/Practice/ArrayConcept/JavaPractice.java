package Practice.ArrayConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class JavaPractice {

    public static void main(String [] args){


    ArrayList <String> arr = new ArrayList <String>();
        arr.add("A");
        arr.add("B");
        arr.add("A");
        arr.add("C");

        HashSet <String> hs = new HashSet <String>();
        for(String y:arr){
            if(hs.add(y)==false){
                System.out.println("Duplicate element is : "+y);

                hs.addAll(arr);
                arr.clear();
                arr.addAll(hs);
                System.out.println(arr);

            }



        }



        }

    }




