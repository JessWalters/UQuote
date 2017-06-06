package jesswalters.quotebot;

import android.graphics.Color;

import java.util.Random;

/*
  Created by Jess Walters on 10/18/2014.
 */
public class ColorChange {
    public String[] mColors = {
            "#03a9f4", // light blue
            "#1565c0", // dark blue
            "#c25975", // mauve
            "#F44336", // red
            "#9c27b0", //Purple
            "#FF9800", // orange
            "#838cc7", // lavender
            "#009688", // aqua
            "#00c853", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#e91e63", // pink
            "#808080", // black
            "#304ffe" // darker blue
    };
    public int getColor() {


        String color = "";
        //Randomly select a color from the list
        Random randomGenerator = new Random (); //construct a new rand number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
