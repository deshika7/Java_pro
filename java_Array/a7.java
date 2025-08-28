package java_Array;

import java.util.Scanner;

public class a7 {
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
            sum=sum-a[i];
            System.out.print(sum+" ");
        }
    }
}

//Write a program to accept the elements into an array and replace every element in the array with the sum of its right side elements
   


//Write a program to accept the elements into an array and replace every element in the array with the sum of its right side elements
