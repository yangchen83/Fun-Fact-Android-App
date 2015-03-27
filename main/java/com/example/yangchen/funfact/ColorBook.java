package com.example.yangchen.funfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by yangchen on 3/26/15.
 */
public class ColorBook {
    public int getColor() {
        String color = "Color.WHITE";

        String[] mColors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray
        };


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];

        return Color.parseColor(color);
    }
}
