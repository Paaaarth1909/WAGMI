// Take two numbers and an operator (+, -, *, /). Calculate the result. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        if(op == '+') System.out.println(a + b);
        if(op == '-') System.out.println(a - b);
        if(op == '*') System.out.println(a * b);
        if(op == '/') System.out.println(a / b);

        sc.close();
    }
}
