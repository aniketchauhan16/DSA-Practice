package Recursion.Recursion;

public class string_to_int_Atoi {

    public int myAtoi(String str){
        int index =0, total=0, sign=1;

        if (str.length() == 0) return 0;
        while (index < str.length() && str.charAt(index) ==' ')  index++;
        if (str.length() == index) return 0;
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;                               //all methods above are for just before 
            index++;}                                                               // the beginning of characters 

        while (index<str.length()) {
            int digit = str.charAt(index) - '0'; // converts string into int by ascii value subtracn
            if (digit <0 || digit > 9 ) break;
            if (Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE == total && Integer.MAX_VALUE%10 < total ) {
                return sign ==1 ? Integer.MAX_VALUE :Integer.MIN_VALUE ;}
                total = total * 10 + digit;
                index++;
        }    
        return total * sign;
    }
    
}
