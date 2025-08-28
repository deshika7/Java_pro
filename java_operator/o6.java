package java_operator;

import java.util.Scanner;

public class o6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.sqrt(n);
        if(a*a==n){
            System.out.println("Perfect Square");
        
        }
        else 
            System.out.println("Not");
        sc.close();
    }

}

//Check whether given number is perfect square or not.
