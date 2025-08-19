package java_nc;

import java.util.Scanner;

public class n5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,ld;
        n=sc.nextLong();
        while(n>0){
            ld=n%10;
            n=n/10;
            System.out.print(ld+" ");
        }
        sc.close();
    }
}

/*
 *Sample Input 0

1234
Sample Output 0

4 3 2 1 
 */
