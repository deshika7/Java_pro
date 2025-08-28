package java_patterns;

import java.util.Scanner;

public class p9 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n,r,sp,st;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            for(sp=1;sp<=n-r;sp++){
                System.out.print(" ");
            }
            for(st=1;st<=2*r-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}



/*
 
  *
  ***
 *****
*******

 */
