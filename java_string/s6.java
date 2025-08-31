package java_string;

import java.util.Scanner;

public class s6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        int l=a.length();
        int n=k%l;
        String ch=a.substring(n)+a.substring(0,n);
        System.out.println(ch);
        sc.close();
    }
}

/*
 Write a program to accept the string and rotate the string n times

Input Format

Accept the n value and string as an input

Constraints

NIL

Output Format

Print the rotated string

Sample Input 0

6
apple
Sample Output 0

pplea
 */
