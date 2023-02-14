import java.util.Scanner;

public class AmazingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");

        while (true) {
            System.out.println();
            System.out.print("Enter a request: ");

            long input = scanner.nextLong();
            if (input < 1 && input != 0) {
                System.out.println("The first parameter should be a natural number or zero.");
            }

            switch ((int) input) {
                case 0:
                    return;
                default:
                    showParity(input);
                    isBuzzNumber(input);
                    isDuckNumber(input);
                    isPalindromicNumber(input);
            }
        }
    }

    public static void showParity(long input) {
        if (input % 2 == 0) {
            System.out.println("Properties of " + input);
            System.out.println("even : true");
            System.out.println("odd : false");
        } else {
            System.out.println("Properties of " + input);
            System.out.println("odd : true");
            System.out.println("even : false");
        }
    }

    public static void isBuzzNumber(long input) {
        boolean isDivisible = input % 7 == 0;
        String inputAsString = String.valueOf(input);
        boolean endsWith7 = inputAsString.endsWith("7");
        if (!isDivisible && !endsWith7) {
            System.out.println("buzz : false");
            // System.out.println("Explanation:%n");
            // System.out.printf("%d is neither divisible by 7 nor does it end with 7.", input);
        } else if (isDivisible && !endsWith7) {
            System.out.println("buzz : true");
            // System.out.println("Explanation:%n");
            // System.out.printf("%d is divisible by 7.", input);
        } else if (!isDivisible && endsWith7) {
            System.out.println("buzz : true");
            // System.out.println("Explanation:%n");
            // System.out.printf("%d ends with 7.", input);
        } else {
            System.out.println("buzz : true");
            // System.out.println("Explanation:%n");
            // System.out.printf("%d is divisible by 7 and ends with 7.", input);
        }
    }

    public static void isDuckNumber(long input) {
        String str = String.valueOf(input);
        if (str.substring(1).contains("0")) {
            System.out.println("duck : true");
        } else {
            System.out.println("duck : false");
        }
    }

    public static void isPalindromicNumber(long input) {
        boolean isPalindromic = true;
        String str = String.valueOf(input);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindromic = false;
            }
        }
        System.out.println("palindromic : " + isPalindromic);
    }
}

