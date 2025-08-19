package java_nc;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,n,ld,sum=0,power=1;
        n=sc.nextInt();
        int copy=n;
        while(n>0){
            c++;
            n=n/10;
        }
        n=copy;
        while(n>0){
            ld=n%10;
            n=n/10;
            power=1;
        for(int i=0;i<c;i++){
            power=power*ld;
        }
        sum=sum+power;
        }
    if(copy==sum)
        System.out.println("Armstrong number");
    else
        System.out.println("Not an Armstrong number");
    sc.close();
    }
}
