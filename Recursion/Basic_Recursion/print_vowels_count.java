package Recursion.Basic_Recursion;

public class print_vowels_count {
    
    public static void main(String[] args) {
        String s = "abrakadabra";
        int index = s.length()-1;
        int x = countVowels(s,index);
        System.out.println(x);
    }

    public static int countVowels(String s,int index){

        if (index ==-1) {
            return 0;
        }

        if (s.charAt(index) == 'a'||s.charAt(index) == 'e' ||s.charAt(index) == 'i'
        || s.charAt(index) == 'o'||s.charAt(index) == 'u') {
            return 1 + countVowels(s, index-1);
        }
       return countVowels(s, index-1);
    }
}
