package java_nc;

import java.util.Scanner;

public class n4 {public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,ld,rev=0,a;
        n=sc.nextLong();
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        while(rev>0){
            a=rev%10;
            //rev=rev/10;
            if(a==2||a==3||a==5||a==7){
                
                System.out.print(a+" ");
            }
            rev=rev/10;
             
        
        
        }
        sc.close();
    }

}

/*Sample Input 0

12345
Sample Output 0

2 3 5 */