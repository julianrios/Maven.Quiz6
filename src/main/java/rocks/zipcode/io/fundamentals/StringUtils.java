package rocks.zipcode.io.fundamentals;


import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        int length = string.length();
        // get range of length
        int range = length - 1;
        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set
        Collection<String> collection = new LinkedList<>();

        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
             collection.add(capitalizeNthCharacter(string, i));
        }
        System.out.println(Arrays.toString(collection.toArray()));
        return collection;
    }

    private static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String afterCapped = "";

        char [] letters = str.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            if(i == indexToCapitalize) {
                afterCapped += Character.toUpperCase(letters[i]);
            } else {
                afterCapped += letters[i];
            }
        }
        return afterCapped;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < indices.length; i++) {
            stringBuilder.setCharAt(indices[i], Character.toUpperCase(stringBuilder.charAt(indices[i])));
        }
        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.insert(index, valueToBeInserted);
        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.setCharAt(index, replacementValue);
        return stringBuilder.toString();
    }
}