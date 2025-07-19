import java.util.Scanner;

public class Numbers {

    // Positive or Negative Number
    static String positiveOrNegative(int num) {
        if (num > 0) {
            return "Positive Number";
        } else if (num == 0) {
            return "Zero Number";
        } else {
            return "Negative Number";
        }
    }

    // Even or odd Number
    static String evenOrOdd(int num) {
        boolean isEven = num % 2 == 0;
        if (isEven) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

    // Sum of first n natural number
    static int sumOfFirstNnaturalNumber(Scanner sc) {
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Sum of first n natural number recursive
    static int sumOfFirstNnaturalNumberRes(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirstNnaturalNumberRes(n - 1);
    }

    // Find the Sum of the Numbers in a Given Range in Java
    static int sumOfNRange(Scanner sc) {
        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        return sum;
    }

    // Find the Greatest of the Two Numbers in Java

    static void greatestOfYwo(int n1, int n2) {

        if (n1 == n2) {
            System.out.println("Both are equals");
        } else {
            int temp = n1 > n2 ? n1 : n2;
            System.out.println(temp + " is larget number");
        }
    }

    // Sum of digit of a number
    static int sumOfDigiTofNumber(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }

    // Reverse a Number
    static int reverseANumber(int num) {
        int rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    static String checkPalindrom(int num) {
        int origNum = num;
        int rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == origNum ? "It's Palindrom" : "It's not palindrom";
    }

    // Check Palindrom String
    static String checkPalindromString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equalsIgnoreCase(rev) ? "It's palindrom" : "It's not palindrom";
    }

    // check arm strong number
    static String checkArmStrongNum(int num) {
        int origNum = num;
        int result = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            result = result + rem * rem * rem;
            num = num / 10;
        }
        return origNum == result ? "Armstrong" : "Not Armstrong";
    }

    // Fibonacci Series upto nth term
    static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            System.out.println("");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    // factorial of n
    static int factorial(int num) {
        int res = 1;
        while (num > 1) {
            res = res * num;
            num--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Positive or Negative Number
        System.out.println(positiveOrNegative(12));
        // Even or odd Number
        System.out.println(evenOrOdd(13));
        // Sum of first n natural number
        System.out.println(sumOfFirstNnaturalNumber(sc));
        // Sum of first n natural number recursive
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        // Find the Sum of the Numbers in a Given Range in Java Recursive
        int sum = sumOfFirstNnaturalNumberRes(n);
        System.out.println(sum);
        // Find the Sum of the Numbers in a Given Range in Java
        int sumOfNrange = sumOfNRange(sc);
        System.out.println(sumOfNrange);
        // Find the Greatest of the Two Numbers in Java
        greatestOfYwo(9, 6);
        // sun of digit of a number
        System.out.println(sumOfDigiTofNumber(12345));
        // Reverse of a number
        System.out.println(reverseANumber(12345));
        // Check Palindrom Number
        System.out.println(checkPalindrom(5678765));
        // Check Palindrom String
        System.out.println(checkPalindromString("Hitesh"));
        // Arm Strong Number
        System.out.println(checkArmStrongNum(153));
        // Fibonacci Series upto nth term
        fibonacci(5);
        // Factorial of a number
        System.out.println("factorial of 5 is : " + factorial(5));

        sc.close();
    }
}