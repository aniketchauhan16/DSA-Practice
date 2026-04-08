package Loops;

import java.util.*;
public class do_while_loop {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
do{
System.out.println("enter your number: ");
int n = sc.nextInt();
if(n % 10==0) {
    break;
}
System.out.println(n); }
while ( true);
sc.close();
}

    // int counter = 1;
    // do{
    //     System.out.println("hello world");
    //     counter++;
    // }
    // while (counter<=10);
}
