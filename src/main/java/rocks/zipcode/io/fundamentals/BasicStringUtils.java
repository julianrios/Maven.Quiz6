package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    private static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o' ,'u'};

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String concatenated = "";
        for (int i = 0; i < chars.length; i++) {
            concatenated += chars[i];
        }
        return concatenated;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : chars) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : string.toCharArray()) {
            if(!(isVowel(character))) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        String regexPattern = getRegex(charactersToRemove);
        return string.replaceAll(regexPattern, "");
    }

    private static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }

    private static Boolean hasVowels(String word) {
        char[] letters = word.toCharArray();
        for(Character letter : letters) {
            for(Character vowel : VOWELS)
                if(letter.equals(vowel)) {
                    return true;
                }
        }
        return false;
    }

    private static String getRegex(String charactersToRemove) {
        StringBuilder regex = new StringBuilder();
        regex.append("[");
        regex.append(charactersToRemove);
        regex.append("]");
        return regex.toString();
    }
}
