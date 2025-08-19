package java_nc;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        long n=sc.nextLong();

            while(n>0){
            count++;
            n=n/10;
            
        }
        System.out.println(count);
        sc.close();
    }
    
}
 //Count the number of digits in a given number