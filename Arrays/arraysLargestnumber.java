package Arrays;
class arraysLargestnumber {

    public static int getLargest(int numbers[]) {
int Largest = Integer.MIN_VALUE;
int Smallest = Integer.MAX_VALUE;
        for (int i =0; i <numbers.length;i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            } 
            {
                if (numbers[i] < Smallest) {
                    Smallest = numbers[i];
                }
            }
        }
        System.out.println("Smallest element is : " + Smallest);
            return Largest;   
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5} ;
       System.out.println("Largest Element in Array is : " + getLargest(numbers));
    }
}