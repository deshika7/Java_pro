package java_operator;

import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nn=sc.nextInt();
        int i=2,flag=0;
        int a=0;
       
        while(i <= n && i <= nn){
            
            if(n%i==0 && nn%i==0){
               flag=1;
               a=i;
            }
            i++;
        }
        if(flag==1) 
            System.out.println("GCD of two number is "+a);
        else
            System.out.println(1);
        sc.close();
    }
    
}
//Find a GCD of given two numbers.
