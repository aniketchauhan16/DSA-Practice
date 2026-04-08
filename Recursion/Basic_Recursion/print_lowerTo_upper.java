package Recursion.Basic_Recursion;

public class print_lowerTo_upper {
        public static void main(String[] args) {
            String s = "HelLo";
            int index = s.length() - 1;
            String result = lowerToUpper(s, index);
            System.out.println(result);
        }
        public static String lowerToUpper(String s, int index) {
            if (index == -1) return "";
            char c = s.charAt(index);
            if (c >= 'a' && c <= 'z') {
                c = (char)('A' + c - 'a');
            }
            return lowerToUpper(s, index - 1) + c;
        }
}
