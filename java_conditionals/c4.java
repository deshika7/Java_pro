package java_conditionals;

import java.util.Scanner;

public class c4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0) 
            System.out.println("The number is divisible by 3");
        else
            System.out.println("The number is not divisible by 3 and gives a remainder "+a%3);
        sc.close();
    }
}
