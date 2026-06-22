import java.util.Scanner;

public class IT26100058Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1, x2;

        System.out.print("Enter a value: ");
        a = input.nextDouble();

        System.out.print("Enter b value: ");
        b = input.nextDouble();

        System.out.print("Enter c value: ");
        c = input.nextDouble();

        x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        input.close();
    }
}
