import java.util.Scanner;

public class TwoDaRRAYS {

    public static void search(int matrix[][] ,int key){
         int n = matrix.length, m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++) {
               if( key == matrix[i][j]) {
                System.out.println("Key found at:(" + i + ", " + j + ")" );
              }
              else{
                System.out.println("Element not found");
              }
            }
        } 
    }


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter elements");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
System.out.println("Printing Elements");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
   sc.close(); }
}

