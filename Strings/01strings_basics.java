package Strings;
class Strings_basics {
        public static void printLetters(String str) {
            for (int i=0;i<str.length();i++) {
                System.out.print(str.charAt(i) + " ");
            }System.out.println();
        }

    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("abcd@#256");
        // // String Are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println("Your Name is : " + name);

        // String Firstname = "Aniket";
        // String Lastname = "Chauhan";
        // String Fullname = Firstname + " " + Lastname;
        // System.out.println(Fullname);
        // System.out.println(Fullname.charAt(1));

        // printLetters(Fullname);

        String str = "racecar";
        System.out.println(isPalindrome(str));


    }
    
    public static Boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
        }
        return true;
    }
}