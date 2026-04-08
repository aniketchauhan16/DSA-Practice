package Patterns;
public class nested_loop_star_pattern_01 {
    public static void main(String[] args) {
        for(int line=1;line<=10;line++ ){

            for(int stars = 1; stars<= line;stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

