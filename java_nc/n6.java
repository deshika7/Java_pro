package java_nc;

import java.util.Scanner;

public class n6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,rev=0,ld;
        n=sc.nextLong();
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        System.out.print(rev);
        sc.close();
    }
    
}


/* Sample Input 0

123
Sample Output 0

321 */