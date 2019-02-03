import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();

          // System.out.println("You have entered " + number);
        } else {
            System.out.println("It is not a number! Please, enter a number.");
        }

        System.out.println("Enter second number:");
        if (sc.hasNextInt()) {
            int b = sc.nextInt();

          //  System.out.println("You have entered " + number);
        } else {
            System.out.println("It is not a number! Please, enter a number.");
        }

        sc.close();
    }
}