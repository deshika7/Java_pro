package java_string;

import java.util.Scanner;

public class s10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] aa = a.toCharArray();

        int i = 0, j = aa.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(aa[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(aa[j])) {
                j--;
            } else {
                char temp = aa[i];
                aa[i] = aa[j];
                aa[j] = temp;
                i++;
                j--;
            }
        }
        sc.close();

        System.out.println(new String(aa));
    }
    
}
/*
 Write a program to reverse a string except the special characters

Input Format

Accept the string as input

Constraints

NIL

Output Format

Print the reverse of the string

Sample Input 0

t$%heory H%andled$#
Sample Output 0

d$%eldna H%yroeht$#
 */
