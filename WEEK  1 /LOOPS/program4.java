// Find the factorial of a number using a loop.

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();
    }
}
