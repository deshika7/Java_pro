package java_loops;

import java.util.Scanner;

public class l5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        a=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+" * "+a+" = "+i*a);
        }
        sc.close();
    }
}
