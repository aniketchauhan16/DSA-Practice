package Recursion.Basic_Recursion;
import java.util.Scanner;
public class print_1toN_02 {

    public static void countingPrinter(int N,int cnt){
    if (cnt == N+1) {
        return;
    }
    else{
        System.out.print(cnt + " ");
        cnt++;
        countingPrinter(N, cnt);
    }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("enter Till which number to print ");
            int N = scan.nextInt();
            int cnt = 1;
            countingPrinter(N, cnt);
            scan.close();
        }
}
