package Practice.ArrayConcept;

public class ReturnTypeData {

    public static void main(String[] args) {

        ReturnTypeData obj = new  ReturnTypeData();

        int z = obj.sum();
       System.out.println(z);

        String x = obj.x();
        System.out.println(x);
    }

    public int sum() {
        int x = 10;
        int y = 20;
        int z = x+y;
        return z;
    }

    public String x(){
        String x = "Java";
        return x;
    }



}

