package Recursion.Basic_Recursion;

public class print_reverse_string {
    public static void reverseString(char[] s) {
        int start = 0; int end = s.length - 1;
        reversetheString(s, start, end);
        System.out.println(new String(s));
    }

    public static void reversetheString(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char x = s[start];
        s[start] = s[end];
        s[end] = x;
        reversetheString(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString( s);
    }
    
}
