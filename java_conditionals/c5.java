package java_conditionals;

import java.util.Scanner;

public class c5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%3==0) System.out.print("Hi");
        if(a%5==0) System.out.print("Hello");
        sc.close();
    }
    
}
