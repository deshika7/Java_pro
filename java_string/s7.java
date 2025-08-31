package java_string;

import java.util.Scanner;

public class s7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        
        String b=a.replaceAll(".","*");
        System.out.println(b);
        sc.close();
    }
}

/*
 Write a program to accept the string from the user and display the string in the password format without making any change in the input array

Input Format

Accept the string as input

Constraints

NIL

Output Format

Print string in password format

Sample Input 0

Password
Sample Output 0

********
 */
