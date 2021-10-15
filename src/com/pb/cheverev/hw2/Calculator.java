import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        char sign;
        System.out.println("First number");
        operand1 = scan.nextInt();
        System.out.println("Second number");
        operand2 = scan.nextInt();
        System.out.println("Enter sign");
        sign = scan.next().trim().charAt(0);
        switch (sign) {
            case '+':
                System.out.println("" + operand1 + sign + operand2 + "=" + (operand1+operand2));
                break;
            case '-':
                System.out.println("" + operand1 + sign + operand2 + "=" + (operand1-operand2));
                break;
            case '/':
                System.out.println("" + operand1 + sign + operand2 + "=" + (operand1/operand2));
                break;
            case '*':
                System.out.println("" + operand1 + sign + operand2 + "=" + (operand1*operand2));
                break;
            default:
                System.out.println("Wrong operation");
                break;

        }
    }
}
