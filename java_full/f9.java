package java_full;

import java.util.Scanner;

public class f9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
        sc.close();
    }
    
}
/*
 Jeni and her brothers Joseph and John found themselves in Narnia, the land of magic during World War III. 
 Narnia was completely filled with gentle people and also it is where the trees sing, the fauns dance, and animals talk. 
 Being from England, Jeni wanted to teach the kids the English language. 
 She started teaching them the alphabet but then she remembered that she might have to go to London and felt sad. 
 John and Joseph discussed with each other and suggested an idea to Jeni to come up with a program so that the kids can learn on their own when she was not there. 
 Can you help Jeni to write a program to check whether the given character is a vowel or consonant or alphabet?

Input Format

The input consists of a character.

Constraints

NA

Output Format

The output should be any one of the below-given strings. 
Vowel or Consonant or Not an alphabet.

Sample Input 0

e
Sample Output 0

Vowel
Explanation 0

The input character e is a vowel and hence it prints Vowel.

Sample Input 1

Z
Sample Output 1

Consonant
Explanation 1

The input character Z is a consonant and hence it prints Consonant.
 */