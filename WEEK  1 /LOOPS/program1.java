// Print numbers from 1 to N using a loop.

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
