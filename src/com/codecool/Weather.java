package com.codecool;
import java.util.Random;

public class Weather {
    static boolean isRaining = true;

    static void setRaining() {
        Random rand = new Random();
        int weatherChance = rand.nextInt(101) + 1;
        if (weatherChance < 30){
            isRaining = true;
        } else {
            isRaining = false;
        }
    }


}
