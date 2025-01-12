package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
      String[] s = sentence.split(" ");

        return s;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] s = sentence.split(" ");

        return s[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] s = sentence.split(" ");

        StringBuilder newStr = new StringBuilder(s[0]);
        newStr.reverse();


        return newStr.toString();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] s = sentence.split(" ");

        StringBuilder newStr = new StringBuilder(s[0]);
        String reversStr = newStr.reverse().toString();

        reversStr = reversStr.substring(0,1).toUpperCase() + reversStr.substring(1);



        return reversStr;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        String[] originalString = str.split("");
        String[] newStrArr = new String[str.length() -1];
        int count = 0;

        for(int i = 0; i < newStrArr.length; i++){

            if(originalString[i] != originalString[index]){
                newStrArr[count] += originalString[i] ;
            }
        }

        return Arrays.toString(newStrArr);

    }



}
