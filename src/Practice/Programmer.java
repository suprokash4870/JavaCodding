package Practice;

public class Programmer extends Employee {

    int Bonus;

     public Programmer(){
        this.Bonus = 10000;

    }
    public static void main(String[]args){

       Programmer p = new Programmer();
       int salary = 100000;
       int bonus = 10000;
       int x = salary+bonus;
       System.out.println("Programmer salary is: "+p.Salary);
       System.out.println("Programmer bonus is: "+p.Bonus);
       System.out.println("Programmer salary+bonus is: "+x);

    }

    }








