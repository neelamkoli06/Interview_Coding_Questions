public class vowelsConsonant {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String str = "Australia";

        for (int k = 0; k < str.length(); k++) {
            char c = str.charAt(k);
            c = Character.toLowerCase(c); // Convert character to lowercase

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (!Character.isLetter(c)) {
                // Ignore non-letter characters (special characters)
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels count is " + vowels);
        System.out.println("Consonant count is " + consonants);
    }
}
