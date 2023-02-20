import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println(args[0]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer value in the format 'p s d'");
        int pounds1 = scanner.nextInt();
        int shillings1 = scanner.nextInt();
        int pence1 = scanner.nextInt();
        Operation value1 = new Operation(pounds1, shillings1, pence1);

        System.out.println("Enter the operation you want to perform (+, -, *, /):");
        String operator = scanner.next();

        Operation result;
        switch (operator) {
            case "+":
                System.out.println("Enter the second integer value in the format 'p s d'");
                int pounds2 = scanner.nextInt();
                int shillings2 = scanner.nextInt();
                int pence2 = scanner.nextInt();
                Operation value2 = new Operation(pounds2, shillings2, pence2);
                result = value1.add(value2);
                System.out.println(value1.toString() + " + " + value2.toString() + " = " + result.toString());
                break;
            case "-":
                System.out.println("Enter the second value in the format 'p s d'");
                int pounds3 = scanner.nextInt();
                int shillings3 = scanner.nextInt();
                int pence3 = scanner.nextInt();
                Operation value3 = new Operation(pounds3, shillings3, pence3);
                result = value1.sub(value3);
                System.out.println(value1.toString() + " - " + value3.toString() + " = " + result.toString());
                break;
            case "*":
                System.out.print("Enter the integer value to multiply the value by\n");
                int multiplier = scanner.nextInt();
                result = value1.mul(multiplier);
                System.out.println(value1.toString() + " * " + multiplier + " = " + result.toString());
                break;
            case "/":
                System.out.print("Enter the integer value to divide the value by\n");
                int divisor = scanner.nextInt();
                result = value1.div(divisor);
                System.out.println(value1.toString() + " / " + divisor + " = " + result.toString());
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                break;
        }
    }
}