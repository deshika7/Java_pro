package java_patterns;

import java.util.Scanner;

public class p6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,c;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==1||r==n||c==1||c==n){
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

*****
*   *
*   *
*   *
*****


*/