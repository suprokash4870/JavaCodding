package Practice.ArrayConcept.Practice2;

public class Apple extends Orange {
    public void Teast(){
        System.out.println("Apple ia also a healthy fruit");
    }

    public static void main(String[] args) {
       Orange or =  new Orange();
       or.Teast();
       Apple ap = new Apple();
       ap.Teast();
       Orange or1 =  new Apple();
       or1.Teast();
    }
}
