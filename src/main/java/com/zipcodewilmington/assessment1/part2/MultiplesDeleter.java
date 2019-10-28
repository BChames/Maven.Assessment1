package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        int[] b = new int[ints.length];
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                b[count] = ints[i];
                count++;
            }
        }
            int removedValue = ints.length - count;
            Integer[] resultArr = new Integer[ints.length - removedValue];


            for (int j = 0; j < resultArr.length; j++) {
                resultArr[j] = b[j];
            }
            return resultArr;
        }


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int[] b1 = new int[ints.length];
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                b1[count] = ints[i];
                count++;
            }
        }
        int removedValue1 = ints.length - count;
        Integer[] resultArr1 = new Integer[ints.length - removedValue1];


        for (int x = 0; x < resultArr1.length -1 + 1; x++) {
            resultArr1[x] = b1[x];
        }

        return resultArr1;
    }



    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int[] b2 = new int[ints.length];
        int counter = 0;

        for (int i = 1; i <= ints.length - 1; i++) {
            if (ints[i] % 3 != 0) {
                b2[counter] = ints[i];
                counter++;
            }
        }
        int removedValue1 = ints.length - counter;
        Integer[] resultArr1 = new Integer[ints.length - removedValue1];


        for (int x = 0; x < resultArr1.length -2 + 2; x++) {
            resultArr1[x] = b2[x];
        }

        return resultArr1;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        int[] b3 = new int[ints.length];
        int counter = 0;

        for (int i = 1; i <= ints.length - 1; i++) {
            if (ints[i] % multiple != 0) {
                b3[counter] = ints[i];
                counter++;
            }
        }
        int removedValue1 = ints.length - counter;
        Integer[] resultArr1 = new Integer[ints.length - removedValue1];


        for (int x = 0; x < resultArr1.length -3 + 3; x++) {
            resultArr1[x] = b3[x];
        }

        return resultArr1;
    }

}

