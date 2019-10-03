package Practice.ArrayConcept.Practice2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("A");

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));


        String str[] = arrayList.toArray(new String[arrayList.size()]);
        for (String x : str) {
            System.out.println(x);
        }

        HashSet<String> hs = new HashSet<String>();

        for (String y : arrayList) {
            if (hs.add(y) == false) {
                System.out.println("Duplicate Element is : " + y);

                hs.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(hs);
                System.out.println(arrayList);
            }
        }


            ArrayList<Integer> arr = new ArrayList<Integer>();

            Random random = new Random();

            for (int i = 1; i <= 10; i++) {
                int x = random.nextInt(100);
                arr.add(x);
                System.out.println(x + "");

            }


        }
    }






