package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return n+10;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
            return n*24;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {


                int reversed = 0;
                for(;val != 0; val /= 10) {
                    int digit = val % 10;
                    reversed = reversed * 10 + digit;
                }
               return reversed;
            }



    }

