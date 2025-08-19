package java_nc;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*n;
        int ld,rev=0,s=0,ld1;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
            
        }
        
        int r=rev*rev;
    
        while(r>0){
            ld1=r%10;
            r=r/10;
            s=s*10+ld1;
        }
        
     
        if(a==s) {
            System.out.println("Adam Number");
        }
        else 
            System.out.println("Not a adam number");
        sc.close();
    }
}
    

