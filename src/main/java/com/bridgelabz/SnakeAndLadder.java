package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
        public static final int START_POSITION = 0;
        public static final int END_POSITION = 100;
        public static final int NO_PLAY = 0;
        public static final int LADDER = 1;
        public static final int SNAKE = 2;
        static String POSITION;

        // method to get the value of dice between 1 to 6
        public static int diceRoll(){
            Random random = new Random();
            int diceValue = random.nextInt(6)+1;
            return diceValue;
        }

        // method to get the value of moves
        public static int play(){
            Random random = new Random();
            int moveValue = random.nextInt(3);
            return moveValue;
        }


        public static int gamePlay(int currentPosition, int diceCount) {
            if(currentPosition < END_POSITION) {
                int diceNumber = diceRoll();
                int playerMove = play();

                switch (playerMove) {
                    case NO_PLAY:
                        currentPosition = currentPosition;
                        POSITION = "noPlay";
                        break;
                    case LADDER:
                        if(currentPosition + diceNumber <= END_POSITION)
                        {
                            currentPosition = currentPosition + diceNumber;
                            POSITION = "Ladder";
                        }
                        break;
                    case SNAKE:
                        if(currentPosition - diceNumber >= START_POSITION)
                        {
                            currentPosition = currentPosition - diceNumber;
                            POSITION = "Snake";
                        }
                        break;
                }
                System.out.println("Dice : "+ diceNumber +" for "+ POSITION +" and Current Position : "+ currentPosition+"");
            }
            if(POSITION.equals("Ladder") && currentPosition != END_POSITION)
            {
                diceCount = dice_Player(diceCount);
                gamePlay(currentPosition, diceCount);
            }
            return currentPosition;
        }


        // Dice count increment after every dice roll
        public static int dice_Player(int diceCount)
        {
            diceCount++;
            return diceCount;
        }


        // Game played by two players
        public static void twoPlayers() {
            int player1 = START_POSITION ;
            int player2 = START_POSITION ;
            int dice_count = 0 ;
            System.out.println("Game Started by two player");

            while( player1 < END_POSITION && player2 < END_POSITION ) {
                System.out.println("Player 1 :-  ");
                player1 = gamePlay( player1, dice_count );
                dice_count = dice_Player(dice_count);
                System.out.println("-------------------------------------------------------------------------------------------------- ");
                if(player1 == END_POSITION)
                {
                    break;
                }
                System.out.println("Player 2 :-  ");
                player2 = gamePlay( player2, dice_count );
                dice_count = dice_Player( dice_count );
                System.out.println("---------------------------------------------------------------------------------------------------");
            }
            if( player1 == END_POSITION )
            {
                System.out.println();
                System.out.println("Player 1 Won The Match ");
            }
            else if( player2 == END_POSITION )
            {
                System.out.println();
                System.out.println("Player 2 Won The Match ");
            }
            System.out.println("Total Dice Count of both Players "+dice_count);
        }

    }
