package Loops;
public class reverse_an_number {
    public static void main(String[] args) {
        int n = 54261;

        while (n>0) {
            int LastDigit =n%10;
            n=n/10;
            System.out.print(LastDigit);
        }
    }
    
}
