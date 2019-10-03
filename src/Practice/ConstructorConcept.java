package Practice;

public class ConstructorConcept {


    public  ConstructorConcept(){

        System.out.println("Default constructor");
    }
    public  ConstructorConcept(int i) {
        System.out.println("Value of i: "+i);
    }

    public  ConstructorConcept(String x){
        System.out.println("Value of x: "+x);
    }

    public static void main(String [] args){
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(5);
        ConstructorConcept obj2 = new ConstructorConcept("Java");





    }
}
