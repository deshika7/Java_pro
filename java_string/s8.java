package java_string;

import java.util.Scanner;

public class s8 {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int f=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(Character.isDigit(c)){
                System.out.print(c);
                f=1;
            }

        }
        if(f==0)
            System.out.print(0);
        sc.close();
    }
    
}
/*
 Write a program to convert the digits of the string into a single number

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the number in the string

Sample Input 0

hi12hello13
Sample Output 0

1213
Sample Input 1

heaven
Sample Output 1

0
 */
