package Practice.ArrayConcept.Practice2;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String [] args){

        ArrayList arr = new ArrayList();
        arr.add("Java");
        arr.add(10);
        arr.add(10.5);
        arr.add("Java");

        System.out.println(arr.size());

        try {

            for (int i = 0; i <= arr.size(); i++) {
                System.out.println(arr.get(i));
            }

        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Show message: "+e.getMessage());
        }
            System.out.println(arr.hashCode());

    }

}
