package java_patterns;

import java.util.Scanner;

public class p10 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,c;
        n=sc.nextInt();
        n=n*2-1;
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==c||r+c==n+1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                
            }
            System.out.println();
        }
        sc.close();

    }
    
}




/*
 
*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *

 */