package Practice;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            int x = 10 / 0;
            System.out.println("Div result is:" + x);
        }
        catch (ArithmeticException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
        System.out.println("End");
    }
}
