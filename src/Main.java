import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner are defined.
        Scanner aK= new Scanner(System.in);
        // Data types of values are defined.
        int x;
        double y;

        // Get values from user.
        System.out.print("Please enter integer = ");
        x=aK.nextInt();

        System.out.print("Please enter Decimal number = ");
        y= aK.nextDouble();

        // Changed double to integer.
        int x1 = (int) y;

        //Changed integer to double.
        double y1= x;

        System.out.println("Double to integer = " + x1);
        System.out.println("İnteger to double = " + y1);

    }
}