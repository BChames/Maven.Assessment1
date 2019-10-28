package com.zipcodewilmington.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

    String cap = str.substring(0,1).toUpperCase() + str.substring(1);
    return cap;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
            StringBuilder newStr = new StringBuilder(str);


        return newStr.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder newStr = new StringBuilder(str);
        String reversStr = newStr.reverse().toString();

        reversStr = reversStr.substring(0,1).toUpperCase() + reversStr.substring(1);



        return reversStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = str.substring(1, str.length() - 1);
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] newArr = str.toCharArray();

        for(int i = 0; i < newArr.length; i++){
            char letter = newArr[i];
            if(Character.isUpperCase(letter)){
                newArr[i] = Character.toLowerCase(letter);
            }
            else if(Character.isLowerCase(letter)){
                newArr[i] = Character.toUpperCase(letter);
            }
        }


        return new String(newArr);
    }
}
