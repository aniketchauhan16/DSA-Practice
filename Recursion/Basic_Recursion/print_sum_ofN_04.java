package Recursion.Basic_Recursion;
import java.util.*;
public class print_sum_ofN_04 {

    public static int sumCalculator(int n){
        if (n==0) {
            return 0;
        }
        return(n + sumCalculator(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no for sum till");
        int n = sc.nextInt();
        System.out.println(sumCalculator(n));
        sc.close();
    }
    
}
