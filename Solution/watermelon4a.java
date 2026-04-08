package Solution;
import java.util.*;

public class watermelon4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n==2){
            System.out.println("NO");
        }
        else{
            if(n%2==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}