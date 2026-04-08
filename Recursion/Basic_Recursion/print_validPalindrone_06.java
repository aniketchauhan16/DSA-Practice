package Recursion.Basic_Recursion;
public class print_validPalindrone_06 {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length();
        while (i < n / 2) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
    //better palindrome code class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.replaceAll("\\p{Punct}","");           // removes punctuatuion from our code
//         s = s.replaceAll("\\s", "");                // removes white space
//         s = s.toLowerCase();                        // makes all letters in lowercase
//              int i = 0;
//               int n = s.length();
//         while (i < n / 2) {
//             if (s.charAt(i) != s.charAt(n - i - 1)) {
//                 return false;
//             }
//             i++;
//         }
//         return true;
//     }
// }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
