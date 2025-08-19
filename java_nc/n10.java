package java_nc;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ld,copy=n,c=1,sum=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            c=1;
            for(int i=1;i<=ld;i++){
                c=c*i;
            }
            sum=sum+c;
            
            
        }
        if(sum==copy){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
            }
        sc.close();
    }
    
}
