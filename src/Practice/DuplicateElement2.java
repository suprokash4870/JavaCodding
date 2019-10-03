package Practice;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement2 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Selenium");
        arrayList.add("Python");
        arrayList.add("Java");

        Set<String> hashSet = new HashSet<>();

        for(String y : arrayList){
            if(hashSet.add(y)== false){
                System.out.println("Duplicate element is: "+y);
            }
        }
    }
}
