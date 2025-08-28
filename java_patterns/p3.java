package java_patterns;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,c;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if((r+c)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
        sc.close();
    }

    
}
/*
 
10101
01010
10101
01010
10101

 */