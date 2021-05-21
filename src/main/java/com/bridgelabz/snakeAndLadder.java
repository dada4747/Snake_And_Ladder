package com.bridgelabz;

public class snakeAndLadder {
    final static int NO_OF_PLAYER = 1;
    final static int START_POSITION = 0;
    public static void main(String[] args){
        int position = 0;
        int dieValue = (int) Math.floor(Math.random() * 6) + 1 ;

        System.out.println("Welcome to Snake and Ladder Game");
        System.out.println("Number of player is:" + NO_OF_PLAYER);
        System.out.println("Player start position : " + position);
        System.out.println("Player rolls the die and get :" + dieValue);
    }
}
