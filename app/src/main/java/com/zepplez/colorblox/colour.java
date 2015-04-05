package com.zepplez.colorblox;

import android.graphics.Color;

/**
 * Created by AndrewZ on 26/03/15.
 */
public class colour {
    
    static public int colour(int randomNumber){
        int mRandomColour;
        if (randomNumber == 1){
            mRandomColour = Color.parseColor("#e51c23"); //Red
        } else if (randomNumber == 2){
            mRandomColour = Color.parseColor("#e91e63"); //Pink
        } else if (randomNumber == 3){
            mRandomColour = Color.parseColor("#9c27b0"); //Purple
        } else if (randomNumber == 4){
            mRandomColour = Color.parseColor("#5677fc"); //Blue
        } else if (randomNumber == 5){
            mRandomColour = Color.parseColor("#00bcd4"); //Cyan
        } else if (randomNumber == 6){
            mRandomColour = Color.parseColor("#259b24"); //Green
        } else if (randomNumber == 7){
            mRandomColour = Color.parseColor("#ff9800"); //Orange
        } else if (randomNumber == 8){
            mRandomColour = Color.parseColor("#ffeb3b"); //Yellow
        } else if (randomNumber == 9){
            mRandomColour = Color.parseColor("#795548"); //Brown
        } else {
            mRandomColour = Color.parseColor("#607d8b"); //Blue Grey
        }
        randomNumber = 0;
        return mRandomColour;
    }


}
