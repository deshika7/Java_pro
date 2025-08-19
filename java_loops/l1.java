package java_loops;

import java.util.Scanner;

public class l1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a & (a-1))==0){
            System.out.println("YES");
        }
         else{
             System.out.println("NO");
         }
        sc.close();
    }
    
}
