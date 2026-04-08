
package Loops;
import java.util.Scanner;

public class continue_quesn {
    public static void main(String[] args) {
        // continue or skip the multiple of 10's in the code
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Your Number: ");
            int n = sc.nextInt();
            if (n%10==0) {
                continue;
            }System.out.println(n);
            sc.close(); 
    } 
            while (true);
        }
    }

