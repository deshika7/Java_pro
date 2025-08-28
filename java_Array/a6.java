package java_Array;

import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[0]*arr[1]+" ");
        for(int i=1;i<n-1;i++){
            System.out.print(arr[i-1]*arr[i+1]+" ");
        }
        System.out.print(arr[n-1]*arr[n-2]);
        sc.close();
    }
}


//Write a program in C to update every array element with multiplication of previous and next numbers in array.