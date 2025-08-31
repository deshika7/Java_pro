package java_string;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='A' && c<='Z'){
                count++;
            }
            sc.close();
        }
        System.out.println(count);
    }
    
}
/*
 Write a program to count the number of upper-case characters in a given string

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the count of Uppercase characters

Sample Input 0

BeauTIfull Life
Sample Output 0

4
 */