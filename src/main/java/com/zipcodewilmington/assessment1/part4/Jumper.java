package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        if(k - j == 2){
            return 3;
        }
        else if(k - j == 1){
            return 2;
        }
        else if(k - j == 0){
            return 1;
        }
        return -1;
    }
}
