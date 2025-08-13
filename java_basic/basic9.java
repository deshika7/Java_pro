package java_basic;

import java.util.Scanner;

public class basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%05d%n", num1);
        System.out.printf("%5d%n", num2);
        sc.close();

    


    }
}