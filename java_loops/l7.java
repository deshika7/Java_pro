package java_loops;

import java.util.Scanner;

public class l7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i=2;
        a=sc.nextInt();
        b=sc.nextInt();
        while(true){
            if(i%a==0&&i%b==0){
                
                break;
                
                
            }
            i++;
        }
        System.out.println(i);
        sc.close();
    }

}
