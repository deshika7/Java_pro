package java_conditionals;

import java.util.Scanner;

public class c2 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        sc.close();
    }
    
}
