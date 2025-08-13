package java_conditionals;

import java.util.Scanner;

public class c7 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        String[] tt=t.split(":");
        int h,m,s;
        h=Integer.parseInt(tt[0]);
        m=Integer.parseInt(tt[1]);
        s=Integer.parseInt(tt[0]);
        if(h>=0&&h<24&&m>=0&&m<60&&s>=0&&s<60) System.out.println("Valid") ;
        else System.out.println("Not Valid");
        sc.close();
    }
    
}
