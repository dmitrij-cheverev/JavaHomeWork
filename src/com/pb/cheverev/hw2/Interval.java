import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        System.out.println("Enter number");
        operand1 = scan.nextInt();

        if (operand1 >= 0 && operand1 <=14) {
            System.out.println("number in between [0-14]");
        } else if (operand1 >= 15 && operand1 <=35) {
            System.out.println("number in between [15-35]");
        } else if (operand1 >= 36 && operand1 <=50) {
            System.out.println("number in between [36-50]");
        } else if (operand1 >= 51 && operand1 <=100) {
            System.out.println("number in between [51-100]");
        } else {
            System.out.println("Wrong number");
        }
    }
}
