package java_full;

import java.util.*;

public class f11 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < M; i++) {
            result *= N;
        }
        System.out.println(result);
        scanner.close();
    }
    
}
