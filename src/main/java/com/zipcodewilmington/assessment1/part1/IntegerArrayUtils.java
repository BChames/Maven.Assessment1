package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int count =0;

        for(int i = 0; i < intArray.length; i++){
            count+=intArray[i];
        }
        return count;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        int count = 1;

        for(int i = 0; i < intArray.length; i++){
            count*=intArray[i];
        }
        return count;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        int count=0;
        double result = count;
        for(int i = 0; i < intArray.length; i++){
            count+=intArray[i];

        }
        result = count /= intArray.length;
        return result;
    }
}
