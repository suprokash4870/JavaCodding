package Practice.ArrayConcept;

import java.util.ArrayList;

public class ExceptionHandling2 {
    public static void main(String [] args) {

        ArrayList arr = new ArrayList();
        arr.add("Selenium") ;
        arr.add(10);
        arr.add(10.5);

        System.out.println(arr.size());

        try{

            for (int i = 0; i <= arr.size(); i++) {
                System.out.println(arr.get(i));
        }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Show message : "+e.getMessage());
        }
        System.out.println("Hash code is: "+ arr.hashCode());
    }
}
