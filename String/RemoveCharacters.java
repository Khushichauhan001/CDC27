package String;

public class RemoveCharacters {
     public String removeNonAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Check if character is alphabet
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
