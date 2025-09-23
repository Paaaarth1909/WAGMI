// give the codes in simplest format and without any comments 

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double si = (p * t * r) / 100;
        System.out.println(si);
        sc.close();
    }
}
