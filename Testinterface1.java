interface  Bank {
    void interest();
}

interface Loan {
    void amount();
}

class SBI implements Bank, Loan {

    @Override
    public void interest() {
        System.out.println(" interest method working ");
    }
    public void amount() {
        System.out.println(" amount method working ");
    }
}
public class Testinterface1 {

    public static void main(String [] args){

        Bank obj1 = new SBI();
        Loan obj2 = new SBI();

        obj1.interest();
        obj2.amount();
    }

}
