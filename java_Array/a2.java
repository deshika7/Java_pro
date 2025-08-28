package java_Array;

import java.util.Scanner;

public class a2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                c++;
            }
            
        }
        System.out.println("Odd = "+c);
            System.out.println("Even = "+(n-c));
        sc.close();
    }
}
//Write a program to accept the array and count the number of odd and even numbers in the given array
