import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command: ");

        Calculator calculator = new Calculator();

        while (true) {
            Scanner in = new Scanner(System.in);

            String s = in.next();

            if (s.equals("add")) {
                int left = in.nextInt();
                int right = in.nextInt();

                System.out.println(calculator.add(left, right));
            } else if (s.equals("subtract")) {
                int left = in.nextInt();
                int right = in.nextInt();

                System.out.println(calculator.subtract(left, right));
            } else if (s.equals("multiply")) {
                int left = in.nextInt();
                int right = in.nextInt();

                System.out.println(calculator.multiply(left, right));
            } else if (s.equals("divide")) {
                int left = in.nextInt();
                int right = in.nextInt();

                System.out.println(calculator.divide(left, right));
            } else if (s.equals("fibonacci")) {
                int number = in.nextInt();

                System.out.println(calculator.fibonacciNumberFinder(number));
            } else if (s.equals("binary")) {
                int number = in.nextInt();

                System.out.println(calculator.intToBinaryNumber(number));
            }
        }
    }
}
