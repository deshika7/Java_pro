package java_nc;

import java.util.Scanner;

public class n7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,ld,rev=0;
        n=sc.nextLong();
        long copy=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        if(rev==copy){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
    
}
