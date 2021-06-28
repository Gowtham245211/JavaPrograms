interface  Bank {
    void interest();
}
public class Testinterface {

    public static void main(String [] args){

        Bank obj = () -> {
            System.out.println(" Interface working ");
        };
        obj.interest();
    }

}
