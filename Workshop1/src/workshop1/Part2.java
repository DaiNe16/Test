package workshop1;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number 1: ");
        num1 = scanner.nextFloat();
        System.out.println("Input the number 2: ");
        num2 = scanner.nextFloat();
        System.out.println("Input the operator(+-*/): ");
        op = scanner.next();
        switch (op) {
            case "+":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println("the result of "+num1 +op+num2+" = "+(num1/num2));
                break;
        }
    }

}
