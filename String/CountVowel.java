package String;

public class CountVowel {
    public void solve(String str) {
        int vowels = 0, consonants = 0, whitespaces = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            // Check for consonants
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
            // Check for white spaces
            else if (ch == ' ')
                whitespaces++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White Spaces: " + whitespaces);
    }
}
