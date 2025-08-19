package java_nc;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d,ld,count=0;
        int n = sc.nextInt();
        d=sc.nextInt();
        
        while(n>0){
            ld=n%10;
            if(ld==d){
                count++;
            }
            n=n/10;
            //System.out.println(count);
        }
        System.out.println(count);
        sc.close();
    }
}

//Count the number of occurrences of a digit in a given number
