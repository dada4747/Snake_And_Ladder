package com.bridgelabz;
import java.lang.*;

public class snakeAndLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args){
        int position = 0;
        int reach = 0;
        int roll = 0;
        int start = 0;

        while(reach < WINNING_POSITION) {
            reach++;

            int dieValue = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println("Die value is :" + dieValue);

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Option is :" + option);

            switch (option) {
                case NO_PLAY:
                    roll = 0;
                    break;
                case LADDER:
                    roll = +dieValue;
                    break;
                case SNAKE:
                    roll = -dieValue;
                    break;
            }

            position = (position + roll);
            if((position < start) && (option == 0)){
                System.out.println("Current Position: " + start);
                reach = start;
                System.out.println("Reached: " + reach);
            }else if ((position > WINNING_POSITION) && (option == 1)){
                System.out.println("Current Position: " + position);
                reach = WINNING_POSITION;
                System.out.println("Reached: " + reach);
                break;
            }else if(position < 0){
                System.out.println("Current Position: " + start);
                reach = start;
                System.out.println("Reached: " + reach);
            }else {
                System.out.println("Current Position: " + position);
                reach = position;
                System.out.println("Reached: " + reach);
            }
        }
        System.out.println("Win:" +reach);
    }
}
