package java_Array;

import java.util.Scanner;

public class a10 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0)
                c++;
                sc.close();
        }
        System.out.println("zc = "+c);
        System.out.println("oc = "+(n-c));
     }
    
}

//Write a program to count the number of zeros and ones in an array
