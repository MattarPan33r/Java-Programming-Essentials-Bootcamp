import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, sum = 0, digit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of digits of the number is: " + sum);
    }
}
