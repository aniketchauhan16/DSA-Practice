
import java.util.*;

public class arraysCC {

    public static void main(String[] args) {
        int marks[] = new int[49];

        Scanner sc = new Scanner(System.in);

        marks[01] = sc.nextInt()  ;        //#phy
        marks[02]= sc.nextInt();           //#chem
        marks[03]= sc.nextInt();           //#maths
    sc.close();

    System.out.println("Marks for PHY:" + marks[01]);
    System.out.println("Marks for CHEM:" + marks[02]);
    System.out.println("Marks for MATHS:" + marks[03]);
    
     marks[02] = marks[02] +1;
        int Percentage = (marks[01] + marks[02] + marks[03]) / 3;

    System.out.println("Percentage of your marks = " + Percentage + " %");
    }
}