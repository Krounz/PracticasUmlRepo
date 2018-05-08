package com.company.Game;
import java.util.Random;
import java.security.PublicKey;

public class Player {

    private String name;
    private String coinOption;

    public Player(String name){
        this.name = name;
    }

    public void getRandCoinOption() {
        Random rand = new Random();
        if(rand.nextInt()%2 == 1)
            this.coinOption = "head";
        else
            this.coinOption = "tails";
    }
    public void setCoinOption(String opponentFlipp){
        if(opponentFlipp == "tails")
            this.coinOption = "head";
        else
            this.coinOption = "tails";
    }

    public String getCoinOption() {
        return coinOption;
    }

    public void didPlayerWin(String winningFLip){
        if(coinOption == winningFLip)
            System.out.println("Jugador "+ name + " gano!!!");
    }
}
