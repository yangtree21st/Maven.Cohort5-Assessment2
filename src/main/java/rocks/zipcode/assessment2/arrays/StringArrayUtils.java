package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        String[] arr = Arrays.copyOfRange(arrayToBeSpliced,startingIndex,endingIndex);
        return arr;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] arr = getSubArray(arrayToBeSpliced,startingIndex,arrayToBeSpliced.length);
        return arr;
    }
}
