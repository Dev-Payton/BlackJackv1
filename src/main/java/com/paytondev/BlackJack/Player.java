package com.paytondev.BlackJack;

import java.util.Scanner;

public class Player {


    private boolean isBusted = false;

    Scanner scanner = new Scanner(System.in);
    PlayerHand playerHand = new PlayerHand();

    public String name;

    public Player() {
    }



public String getName(){
        return name;
}


    public void receiveCard(Card card){
    }

    public String playTurn(){
        return null;
    }

    public boolean returnIsBusted(){
        return isBusted;
    }

    public void setBusted(boolean bust){
        isBusted = bust;
    }



/* This method returns an integer purely because it can be used when displaying a players
     hand during their turn or when other players need to see the other hands
*/



}


