package Loops;

import java.util.*;

public class check_for_prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

         if (n==2) {
            System.out.println("n is Prime");
         }
         else {
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++ )  {
                if (n%i ==0 ) {
                    isPrime = false;
                    }
            }
            if ( isPrime == true) {
                System.out.println("given no is Prime");
            }
            else {
                System.out.println("given no is not Prime");
            }
        }
    }
}
