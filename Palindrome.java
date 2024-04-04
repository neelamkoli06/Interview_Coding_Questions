//---------------------- code1 -----------------------------------------------
public class Palindrome {
    public static void main(String[] args) {

        String str = "aba";
        String reverse = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } 
        else {
            System.out.println("Not Palindrome");
        }
    }
}

//----------------------------- code2 -------------------------------------

class Main {
    public static void main(String[] args) {

        String str = "Radar", reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}