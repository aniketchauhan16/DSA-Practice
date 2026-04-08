package Recursion.Basic_Recursion;
import java.util.Scanner;
public class print_names_01 {
    public static void namePrinter(int N,String name){
        if (N==0){
            return;
        }
        else {
            System.out.print(name + " ");
            N--;
            namePrinter(N, name);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String name = "ankit";
            System.out.println("Enter no. of times to print name");
            int N = scan.nextInt();
            namePrinter(N,name);
            scan.close();
    }


}
