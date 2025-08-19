package java_loops;

import java.util.Scanner;

public class l2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
    
}
