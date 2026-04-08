package Loops;
import java.util.*;

public class sum_first_to_n_numbers {
    public static void main(String[] args) {
        System.out.println("enter a number you want sum till:");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n) {
            sum = sum + i;
            i++;            
        }
        System.out.println(sum);
        sc.close();
    }
    
}
