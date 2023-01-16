package n2exercici3.Java;

import n2exercici3.Interfaces.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String op = "";
        float n1, n2;
        String operand;
        Scanner sc = new Scanner(System.in);

        Calculator calculator = (num1, num2, oper) -> {
            float result = switch (oper) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default -> 0;
            };
            return result;
        };

        System.out.println("Enter a number");
        n1 = sc.nextFloat();
        System.out.println("Enter another one");
        n2 = sc.nextFloat();
        sc.nextLine();
        System.out.println("What operation you want to do? + - * /");
        operand = sc.nextLine();

        System.out.println("The calculator result of " + n1 + " " + operand + " " + n2 + " is: " + calculator.operacio(n1, n2, operand));

    }

}
