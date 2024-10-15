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






            // Declare the variables
           /* String firstname;
            float hoursWorked;
            float payrate;
            float grosspay;
            Scanner scanner = new Scanner(System.in);

// Asking for input
           /* System.out.println("What is your firstname?");
            firstname = scanner.nextLine();

            System.out.println("What is your payrate?");
            payrate = scanner.nextFloat();

            System.out.println("How many hours did you worked");
            hoursWorked = scanner.nextFloat();

// Doing the calculation (algoritme)
            grosspay = hoursWorked * payrate;

// Displaying the output
            System.out.println(firstname + " earned $" + grosspay);*/



        }

}
