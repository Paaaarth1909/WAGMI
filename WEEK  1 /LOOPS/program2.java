// Calculate the sum of first N natural numbers using a loop.

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
