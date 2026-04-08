package Functions;

import java.util.Scanner;

public class binomialCoeff  {
    public static int factorial(int n) {
        int factorial = 1;
        for(int i = 1;i<=n;i++) {
            factorial = factorial* i;
            
        }
    return factorial;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       System.out.println("enter valur for n:");
            int n = sc.nextInt();
                int nfact = factorial(n);
        System.out.println("enter valur for r:");
            int r = sc.nextInt();
                int rfact = factorial(r);
                     sc.close();
            int nrfact = factorial(n - r);

            System.out.println(nfact/(nrfact*rfact));
    }

    
}

    

