package Practice.ArrayConcept.Practice2;

public class BankOfAmerica extends Abstraction {

    @Override
    public void Loan() {
        System.out.println("Abstraction----Loan");
    }

    public void CarLoan(){

        System.out.println("BOA-----CarLoan");
    }

    public static void main(String[] args) {

       BankOfAmerica boa =new BankOfAmerica();
        boa.Loan();
        boa.credit();
        boa.CarLoan();

        Abstraction abs = new BankOfAmerica();
        abs.Loan();
        }
    }

