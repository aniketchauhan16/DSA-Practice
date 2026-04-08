package Functions;

public class MultiplyFunction { 
    public static int multiply(int a, int b) {
       int multiply= a*b;
       return multiply;
    } 
    
    public static void main(String[] args) {
       int n = multiply(5, 20);
       System.out.println("a * b = " +  n);
       n = multiply(10, 5);
       System.out.println("a * b = "+ n);
    }
    
}
