package Loops;

public class break_and_continue {
    public static void main(String[] args) { // continue is used to skip an itteration....
        for(int i =1;i<=5;i++) {
            if (i ==3) {
                continue;
            }
            System.out.println(i);
        }
        
    // for(int i =1;i<=5;i++) {
        //     if  (i==3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");
    }
    
}
