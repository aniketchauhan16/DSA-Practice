package Recursion.Recursion;
public class tiling_problem {
    
    public int numberOfWays(int n) {
       if(n==0|| n==1) return 1;
       int fnm1 = numberOfWays(n-1);
       int fnm2 = numberOfWays(n-2);
       
       int totalWays = fnm1 + fnm2;
       return totalWays;
        
}
}
