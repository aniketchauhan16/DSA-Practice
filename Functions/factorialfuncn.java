package Functions;

public class factorialfuncn {
    public static int factorial(int n) {
        int factorial = 1;
        for(int i = 1;i<=n;i++) {
            factorial = factorial* i;
            
        }
    return factorial;
    }

    public static void main(String[] args) {
         int answer = factorial(4);
         System.out.println(answer);
    }

    
}
