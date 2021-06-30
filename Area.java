import java.util.Arrays;
import java.util.Scanner;
abstract class Shape {

    public abstract void CircleArea();

}
public class Area extends Shape{

    private static Scanner sc = new Scanner(System.in);

    @Override
    public void CircleArea() {

        double [] circlearray = new double [3];

            System.out.println("Area of circle");
            System.out.println("Enter three values");

            for (int i = 0; i < circlearray.length; i++ ){

                circlearray[i] = sc.nextInt();
                sc.nextLine();

            }

            for (int i = 0; i < circlearray.length; i++ ){

                System.out.println("The area of circle " + (i+1) + " is : " + (3.14 * (circlearray[i] * circlearray[i])));

            }

    }

    public static void main(String [] args) {

        Area calculator = new Area();

        calculator.CircleArea();

    }

}
