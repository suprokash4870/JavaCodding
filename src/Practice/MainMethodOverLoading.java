package Practice;

public class MainMethodOverLoading {
    public static void main(String []args) {
        System.out.println("Main method------1");
        main("Java");
        main(5);
    }

    public static void main(String args) {
        System.out.println("Main method------2");

    }

    public static void main(int x) {
        System.out.println("Main method------3");

    }
}
