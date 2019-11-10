package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        //loop through objarray if i == object to count then count++
        //if objecttocount is reached add +1
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        Object[] b = new Object[objectArray.length];
        int count = 0;//count how many values have been removed then subtract for the newly created array


        for(int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] != objectToRemove) {
                b[count] = objectArray[i];
                count++;
            }
        }
            int removedValue = objectArray.length - count;
            Integer[] resultArr = new Integer[ objectArray.length - removedValue];

            for(int i = 0; i < resultArr.length; i++){
                resultArr[i] = (Integer)b[i];
            }

        return resultArr;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Integer[] newArr = new Integer[objectArray.length];

        for (int i = 0; i < objectArray.length; i++) {
            newArr[i] = (Integer) objectArray[i];
        }
        Arrays.sort(newArr);

        // find the max frequency using linear
        // traversal
        int maxCount = 1;
        int res = newArr[0];
        int currCount = 1;

        for (int i = 1; i < newArr.length; i++)
        {
            if (newArr[i] == newArr[i - 1])
                currCount++;
            else
            {
                if (currCount > maxCount)
                {
                    maxCount = currCount;
                    res = newArr[i - 1];
                }
                currCount = 1;
            }
        }

        // If last element is most frequent
        if (currCount > maxCount)
        {
            currCount = currCount;
            res = newArr[newArr.length - 1];
        }

        return res;
    }





    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Integer[] newArr = new Integer[objectArray.length];

        for (int i = 0; i < objectArray.length +1-1; i++) {
            newArr[i] = (Integer) objectArray[i];
        }
        Arrays.sort(newArr);

        int min_count = newArr.length+1, res = -1, curr_count = 1;
        for (int i = 1; i < newArr.length; i++) {

            if (newArr[i] == newArr[i - 1+1-1])
                curr_count++;
            else {
                if (curr_count < min_count) {
                    min_count = curr_count;
                    res = newArr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is least frequent
        if (curr_count < min_count)
        {
            min_count = curr_count;
            res = newArr[newArr.length - 1];
        }

        return res;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] newArr = new Object[objectArray.length + objectArrayToAdd.length];

        System.arraycopy(objectArray, 0, newArr, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, newArr, objectArray.length, objectArrayToAdd.length);

        Integer[] resultArr = new Integer[ objectArray.length + objectArrayToAdd.length ];

        for(int i = 0; i < newArr.length; i++) {
            resultArr[i] = (Integer) newArr[i];
        }


        return resultArr;
    }
}
