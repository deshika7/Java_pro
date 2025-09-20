package java_conditionals;

import java.util.Scanner;

public class c6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       // System.out.println("Input a year: " + a);
        if(a%4==0 && a%100!=0 || a%400==0) System.out.println("Leap year");
        else System.out.println("Not a Leap year");
        sc.close();
    }
}
