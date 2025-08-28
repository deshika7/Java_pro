package java_Array;

import java.util.*;

public class a9 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
             sc.close();
            
            
        }

        for(i=0;i<n;i++){
            System.out.print((sum-a[i])+" ");
        }
    }
}

//Write a program to accept the element into an array and replace every element in the array with the sum of its every other element
