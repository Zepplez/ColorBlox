package com.zepplez.colorblox;

/**
 * Created by AndrewZ on 27/03/15.
 */
public class randomNumber {
    static public int gen(){
        int mRandomNumber = (int)(Math.random()*(9-1)+1);

        return mRandomNumber;
    }
}
