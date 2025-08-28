package java_operator;

import java.util.Scanner;

public class o3 {
     public static void main(String[] args) { Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int v1=sc.nextInt();
        double s=(double)v/v1;
        int s1=v%v1;
        System.out.printf("%d / %d = %.6f\n",v,v1,s);
          System.out.println(v+" % "+v1+" = "+s1);
          sc.close();
    }
    
}

//Get two numbers from user and print the values of the quotient and the remainder when the two values are divided.
