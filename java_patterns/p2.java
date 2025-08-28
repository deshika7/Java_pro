package java_patterns;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c,r;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }

    
}


/*
 

****
****
****
****


 */
