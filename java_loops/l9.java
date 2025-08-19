package java_loops;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++){
            sum=sum+a;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
