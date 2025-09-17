package java_conditionals;

import java.util.*;

public class c11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        
        int a = sc.nextInt();

        
        int b = sc.nextInt();

        int c = sc.nextInt();

       
        int greatest = (a > b) ? ((a > c) ? a : c) 
                               : ((b > c) ? b : c);

        System.out.println("Greatest number is: " + greatest);

        sc.close();
    }
}

