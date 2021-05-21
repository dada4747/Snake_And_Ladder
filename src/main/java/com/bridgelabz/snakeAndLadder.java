package com.bridgelabz;
import java.lang.*;

public class snakeAndLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args){
        int start = 0;
        int roll = 0;
        int dieValue = (int) Math.floor(Math.random() * 6) + 1 ;
        System.out.println("Die value is :" + dieValue);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("Option is :" + option);

        switch (option){
            case NO_PLAY:
                roll = roll;
                break;
            case LADDER:
                roll =+ dieValue;
                break;
            case SNAKE:
                roll -= dieValue;
                if (roll < 0){
                    roll = 0;
                }
                break;
        }
        int position = (start + roll);
        System.out.println("Current Position:" + position);
    }
}
