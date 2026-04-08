package ArrayList;
import java.util.*;

public class operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(3);
        System.out.println(list);

        list.add(1,9);
        System.out.println(list);
 
        list.set(1,2 );
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);
        
        list2.add("null");
        list3.add(true);
        System.out.println(list2);
        System.out.println(list3);
         
        System.out.println(list.size());


        //printing list in reverse
            for (int i = list.size()-1; i >=0; i--) {
                System.out.print(list.get(i) + " ");
            }System.out.println();

        //finding largest no. in a list 
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > max) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element is : " +  max);

    }
}