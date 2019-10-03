package Practice;

import java.util.*;

public class JavaPractice2 {

public static void main(String [] args){

        Hashtable <Integer,String> h1 = new  Hashtable <Integer,String>();

        h1.put(1,"java");
        h1.put(2,"selenium");
        h1.put(3,"python");
        h1.put(4,"ruby");

        for(Map.Entry x : h1.entrySet()){
            System.out.println(x.getKey()+ " " +x.getValue());
            System.out.println("Hash code number for h1 is : "+h1.hashCode());
        }

        Hashtable <Integer,String> h2 = new  Hashtable <Integer,String>();

        h2 = (Hashtable) h1.clone();
        System.out.println("Value of h1 are: "+h1);
        System.out.println("Value of h2 are: "+h2);



    }

}








