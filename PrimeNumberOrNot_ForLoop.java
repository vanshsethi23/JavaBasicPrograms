import java.util.Scanner;

public class PrimeNumberOrNot_ForLoop {
    public static void main(String[] args) {
        // Write a Program to find whether the number is prime or not using for loop.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
