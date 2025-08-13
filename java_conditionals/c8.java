package java_conditionals;

import java.util.Scanner;

public class c8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String d=sc.next();
        String[] dd=d.split("/");
        int da,mo,y;
        da=Integer.parseInt(dd[0]);
        mo=Integer.parseInt(dd[1]);
        y=Integer.parseInt(dd[2]);
        if(y>=1900&&y<=9999){
            if(mo>0 && mo<=12){
                if((mo==1 || mo==3 || mo==5 || mo==7 || mo==8 || mo==10 || mo==12)&& (da>0 && da<=31))
                    System.out.println("Valid");
                else if((mo==4 || mo==6 || mo==9 || mo==11) && (da>0 && da<=30))
                    System.out.println("Valid");
                else if (y%4==0 && y%100!=0 || y%400==0){
                    if((mo==2)&&(da>=29)) 
                        System.out.println("Valid");
                }
                else System.out.println("Invalid");
                    
                }
            else System.out.println("Invalid");
            }
        else System.out.println("Invalid");
        sc.close();
    }
}
