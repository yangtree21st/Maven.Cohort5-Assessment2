package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        int size = integerArray.length;
        Integer[] newArray;
        newArray = new Integer[size+1];
        for(int i =0;i<size;i++){
            newArray[i] = integerArray[i];
        }
        newArray[newArray.length-1] = valueToBeAdded;
        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        int size = integerArray.length;
        Integer[] newArray;
        newArray = new Integer[size];
        for(int i =0;i<size;i++){
            newArray[i] = integerArray[i];
        }
        newArray[indexToInsertAt] = valueToBeInserted;
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

           return  integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {


        for(int i = 0; i< integerArray.length; i++){
            if(integerArray[i] %2 != 0){

                integerArray[i]= integerArray[i]-1;
            } else if (integerArray[i] %2 == 0){
                integerArray[i]= integerArray[i]+1;
            }

        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for(int i = 0; i< integerArray.length; i++){
            if(integerArray[i] %2 == 0){

                integerArray[i]= integerArray[i]+1;
    }
            }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        for(int i = 0; i< input.length; i++){

         if (input[i] %2 != 0){
            input[i]= input[i]-1;
        }

    }
        return input;
    }
}
