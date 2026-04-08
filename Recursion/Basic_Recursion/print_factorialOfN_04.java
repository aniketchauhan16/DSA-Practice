package Recursion.Basic_Recursion;
import java.util.*;
public class print_factorialOfN_04 {

    public static int printFactorial(int n){
        if (n==0) {
            return 1;
        }
        return(n*printFactorial(n-1));

    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to find factorial of:");
            int n = sc.nextInt();
            System.out.println(printFactorial(n));
            sc.close();
    }
}
