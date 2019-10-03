package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class PracticeAll {
    public static void main(String[] args) {

       ArrayList <String> arrayList = new ArrayList <String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("D");

       String str [] = arrayList.toArray(new String[arrayList.size()]);
       for(String  x :str){
           System.out.println(x);
       }

        HashSet <String> hs = new HashSet <String>();

       for(String y : arrayList){
           if(hs.add(y)==false){
               System.out.println("Duplicate element is: "+y);

               hs.addAll(arrayList);
               arrayList.clear();
               arrayList.addAll(hs);
               System.out.println(arrayList);
           }
       }
    }
}
