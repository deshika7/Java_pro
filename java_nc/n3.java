package java_nc;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,ld,p=1;
        n=sc.nextInt();
        while(n>0){
            ld=n%10;
            p=p*ld;
            n=n/10;
        }
        System.out.println(p);
        sc.close();
    }
}

//find the product of the digits in a given number
