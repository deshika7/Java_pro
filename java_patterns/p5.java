package java_patterns;

import java.util.Scanner;

public class p5 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r,c,val;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            if(r%2==0)
                val=2;
            else val=1;
            
            for(c=1;c<=r;c++){
                System.out.print(val);
                val=val+2;
            }
            System.out.println();

         }
         sc.close();
    }
    
}





/*

   1
24
135
2468
13579 
 */
