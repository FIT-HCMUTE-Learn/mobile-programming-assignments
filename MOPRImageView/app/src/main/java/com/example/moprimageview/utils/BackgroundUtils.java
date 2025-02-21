package com.example.moprimageview.utils;

import com.example.moprimageview.R;
import java.util.Random;

public class BackgroundUtils {
    // Array of drawable image resources
    private static final int[] IMAGE_RESOURCES = {
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5
    };

    // Function to get a random background image
    public static int getRandomBackground() {
        Random random = new Random();
        int index = random.nextInt(IMAGE_RESOURCES.length);
        return IMAGE_RESOURCES[index];
    }
}
