package Recursion.Basic_Recursion;
import java.util.Scanner;
public class print_Nto1_03 {

    public static void reversePrinter(int N){
        if (N==0) {
            return;
        }
        else {
            System.out.print(N + " ");
            N--;
            reversePrinter(N);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter from which number to go down:");
            int N = sc.nextInt();
            reversePrinter(N);
            sc.close();
    }
}
