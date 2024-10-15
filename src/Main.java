import java.util.Objects;
import java.util.Scanner;


    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName = "Anna";
        String passWord = "1234";
        String email = "Flying.Frisby12@yahoo.com";
        String birthday = "12/14/1990";
        int followers = 123456;
        boolean isLoggedin;


        System.out.println("Welcome to Tiktok would you like to log in?");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your user name:" );
        String userNames = myScanner.nextLine();
        System.out.println("Please enter your password:");
        String Passwords = myScanner.nextLine();
        System.out.println("Welcome back " + userNames + "!");
        if (Passwords.equals(passWord) && userNames.equals(userName)) {
            System.out.println("Logged in!");
                isLoggedin = true;}
        else {
            System.out.println("Password Incorrect.");
                isLoggedin = false;
        }

        LikeTheVideo("Spiderman");
    }






public static void LikeTheVideo(String videoTitle){
    System.out.println("The person liked the movie " + videoTitle);
}











