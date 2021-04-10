import java.util.Scanner;

public class Palindrome {
    private static int number;
    private static boolean cycle = true;

    public static void main(String[] args) {
        System.out.println("""
                Palindrome
                Enter only natural number!
                For finish the program write "stop"!
                Enter number:\s""");
        while (cycle) {
            validationNumber();
            if (number == reversNumber(number) && number >= 0)
                System.out.println(number + " - palindrome");
            else if (number > 0)
                System.out.println(number + " - not palindrome");
        }
    }

    private static int reversNumber(int number) {
        int reversNumber = 0;
        while (number != 0) {
            reversNumber = reversNumber * 10 + number % 10;
            number /= 10;
        }
        return reversNumber;
    }

    private static void validationNumber() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("stop")) {
            cycle = false;
        } else {
            try {
                number = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Enter only natural numbers:");
                number = -1;
            }
        }
    }
}
