package java_operator;
import java.util.*;
public class o9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 2;
        int l = 0; 
        while (n > 1) {
            if (n % i == 0) {
                l = i;  
                //n = n / i;
                break;
            }
            else
                i++;
            
        }

        System.out.println(l);
        sc.close();
    }


}

//Find the least prime factor of a given number.