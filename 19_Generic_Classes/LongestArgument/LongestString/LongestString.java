// Contains a method to find the position of longest string in an array.
public class LongestString {
    // Find the longest string in the given array.
    // Return a Pair containing it and its position.
    // Throw IllegalArgumentException if array is null or empty.
    public static Pair findLongestString(String[] array) throws IllegalArgumentException {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Arrya must exist and be non-empty");
        
        String longestString = array[0];
        int longestIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (longestString.length() < array[index].length()){
                longestString = array[index];
                longestIndex = index;
            } // if
        }
        return new Pair(longestString, new Integer(longestIndex));
    } // findLongestString
} // class LongestString