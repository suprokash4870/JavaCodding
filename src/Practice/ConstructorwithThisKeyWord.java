package Practice;

public class ConstructorwithThisKeyWord {

    String name;
    int age;
    String dept;

    public ConstructorwithThisKeyWord(String name,int age,String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static  void main(String [] args){
        ConstructorwithThisKeyWord obj = new ConstructorwithThisKeyWord("Suprokash Sanyal",42,"Admin");

            System.out.println(obj.name);
            System.out.println(obj.age);
            System.out.println(obj.dept);
    }
}
