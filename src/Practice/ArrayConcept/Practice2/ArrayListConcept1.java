package Practice.ArrayConcept.Practice2;

import java.util.ArrayList;

public class ArrayListConcept1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new  ArrayList <String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        for(int i = 0;i<=arrayList.size();i++){
            System.out.println(arrayList.get(i));

        }
    }
}
