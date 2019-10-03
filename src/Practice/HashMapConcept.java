package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String [] args){

        // Stores value on the basis of key and value pair.
        // HashMap does not allow duplicate key but allows duplicate values
        // Allows only one null key but multiple null values.
        // HashMap is not synchronized.
        // Multiple threads can access into HashMap at a time.


        HashMap <Integer,String> hm = new  HashMap <Integer,String>();
            hm.put(1,"Java");
            hm.put(2,"Java");
            hm.put(null,"Python");
            hm.put(null,null);

        System.out.println(hm.get(1));

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}
