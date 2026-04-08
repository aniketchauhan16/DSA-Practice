package Functions;

import java.util.Scanner;

public class calculateSum {

    public static int calculatesum(int num1,int num2) {
        int sum = num1+num2;
        return sum;
    } 
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
       System.out.println("enter second number: ");
        int b = sc.nextInt();
       int sum = calculatesum(a,b);
        System.out.println("The Sum Of Given Number Is: " + sum);
        sc.close();   
    }
}
    