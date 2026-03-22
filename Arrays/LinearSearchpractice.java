
public class LinearSearchpractice { 
    public static int linearsearch(String menu[], String item) {
        for( int i = 0; i <menu.length;i++ ) {
            if (item == menu[i]) {
                return i;
                }
        } 
        return -1;

    }
    public static void main(String[] args) {
        String menu[] = { "pizza" , "burger" , "samosa" ,"pasta ", "fried rice","fries"} ;
        String item = "samosa";
        int index = linearsearch(menu, item);
        
        if (index == -1) {
            System.out.println("NOT In MENU !!!");
        }
        else  {
            System.out.println(index);
        }
    }
    
}
