
public class arraysAsFunction  {
    
    public static void update(int marks[], int nonChangeable) {
        for( int i=0;i<marks.length;i++) {
            marks[i] = marks[i] +1;
        }
        nonChangeable = nonChangeable + 5;

    }

    public static void main(String[] args) {
        
        int marks[] = {97,98,99};
        int nonChangeable = 5;
        update(marks,nonChangeable);
       for (int i =0;i<marks.length;i++) {
        System.out.println(marks[i] + " ");
       }
       System.out.println();
       System.out.println(nonChangeable); // output should ve been  5+5 =10 but we will get 5 as its non changeable out side main because it uses call by value 
    }

}
