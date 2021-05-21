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
        while(reach < WINNING_POSITION) {
            reach++;
            int dieValue = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println("Die value is :" + dieValue);

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Option is :" + option);

            switch (option) {
                case NO_PLAY:
                    position += 0;
                    break;
                case LADDER:
                    if((position + dieValue) < 100){
                    position += dieValue;
                    reach = position;
                    }
                    else
                        position += dieValue;
                        reach = position;

                    break;
                case SNAKE:
                    if(position > 0){
                        position -= dieValue;
                        reach = position;
                    }
                    else
                        position = 0;
                        reach = position;

                    break;
            }
            System.out.println("Reached:" + reach);
        }
        System.out.println("Win:" +reach);
    }
}
