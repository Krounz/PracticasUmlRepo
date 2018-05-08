package com.company.Game;
import java.util.Random;

public class Coin {
    private String coinOption;

    public Coin(){
        getCoinOption();
    }

    public String getCoinOption(){
        Random rand = new Random();
        if(rand.nextInt()%2 == 1)
            coinOption = "head";

        else
            coinOption = "tails";
        return  coinOption;
    }
}
