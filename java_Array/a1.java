package java_Array;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}
//Write a c program to accept the array from the user and print the array from left to right
