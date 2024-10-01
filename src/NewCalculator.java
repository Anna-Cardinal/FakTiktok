import java.util.Scanner;

public class NewCalculator {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1;
        float num2;
        System.out.println("First number: ");
        num1 = myScanner.nextFloat();
        System.out.println("Second number: ");
        num2 = myScanner.nextFloat();
        System.out.println("Do you want to add, sub, mult, or div?");
        String math = myScanner.nextLine();
        if (math.equals()) {
        }



    }

    public static float add(float num1, float num2) {
        float sum = num1 + num2;
        return sum;
    }

    public static float sub(float num1, float num2) {
        float sum = num1 - num2;
        return sum;
    }

    public static float mult(float num1, float num2) {
        float sum = num1 * num2;
        return sum;
    }

    public static float div(float num1, float num2) {
        float sum = num1 / num2;
        return sum;
    }
}
