package java_operator;

import java.util.Scanner;

public class o8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int l = 0; 
        while (n > 1) {
            if (n % i == 0) {
                l = i;  
                n = n / i;
            }
            else
                i++;
            
        }

        System.out.println(l);
        sc.close();
    }
    
}

//Find the greatest prime factor of given number.
