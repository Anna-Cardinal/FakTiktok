import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
       // String add = "A";
       // String subtract = "S";
       // String multiply = "M";
       // String devide = "D";




            Scanner myScanner = new Scanner(System.in);
            System.out.println("First Number: ");
            Float firstNum = myScanner.nextFloat();
            System.out.println("Second Number: ");
            Float secondNum = myScanner.nextFloat();
            System.out.println("What would you like to do?");
            String math = myScanner.next();
            float total;
            if (math.equals("+")) {
                total = firstNum + secondNum;
                System.out.println("Your total is " + total);
            } else if (math.equals("/")) {
                total = firstNum / secondNum;
                System.out.println("Your total is " + total);
            } else if (math.equals("-")) {
                total = firstNum - secondNum;
                System.out.println("Your total is " + total);
            } else if (math.equals("*")) {
                total = firstNum * secondNum;
                System.out.println("Your answer is " + total);
            }




        }

}
