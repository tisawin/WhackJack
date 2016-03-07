package com.example.tisa.whack;

/**
 * Created by Tisa on 3/6/2016.
 */
import java.util.Random;

public class GameService {
    public int RandomJack () {
        int i=0;
        Random random = new Random();
        int generatedValue = random.nextInt(100);

        if (isBetween(generatedValue, 1, 11)){
            i=1;
        }
        if (isBetween(generatedValue, 12, 22)){
            i=2;
        }
        if (isBetween(generatedValue, 23, 33)){
            i=3;
        }
        if (isBetween(generatedValue, 34, 44)){
            i=4;
        }
        if (isBetween(generatedValue, 45, 55)){
            i=5;
        }
        if (isBetween(generatedValue, 56, 66)){
            i=6;
        }
        if (isBetween(generatedValue, 67, 77)){
            i=7;
        }
        if (isBetween(generatedValue, 78, 88)){
            i=8;
        }
        if (isBetween(generatedValue, 89, 99)){
            i=9;
        }

        return i;
    }


    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
