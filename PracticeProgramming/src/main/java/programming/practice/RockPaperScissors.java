package programming.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many round would you like to play?");
        int roundNo = inputReader.nextInt();
        int currentRoundNo = 0;
        System.out.println("You have chosen " + roundNo + " many rounds");

        int drawNo = 0;
        int winNo = 0;
        int lossNo = 0;
        while(currentRoundNo < roundNo) {
            System.out.println("Choose Rock(1), Paper(2), or Scissors(3)");
            int userChoice = inputReader.nextInt();


            Random rng = new Random();
            int enemyRPS = rng.nextInt(3) + 1;

            switch (userChoice) {
                case 1:
                    switch (enemyRPS) {
                        case 1:
                            drawNo++;
                            System.out.println("You drew");
                            break;
                        case 2:
                            lossNo++;

                            System.out.println("You lost");
                            break;
                        case 3:
                            winNo++;

                            System.out.println("You won");
                            break;
                    }
                    break;
                case 2:
                    switch (enemyRPS) {
                        case 1:
                            winNo++;

                            System.out.println("You won");
                            break;
                        case 2:
                            drawNo++;
                            System.out.println("You drew");
                            break;
                        case 3:
                            lossNo++;

                            System.out.println("You lost");
                            break;
                    }
                    break;
                case 3:
                    switch (enemyRPS) {
                        case 1:
                            lossNo++;

                            System.out.println("You lost");
                            break;
                        case 2:
                            winNo++;

                            System.out.println("You won");
                            break;
                        case 3:
                            drawNo++;
                            System.out.println("You drew");
                            break;
                    }
                    break;
            }
            currentRoundNo++;
        }

        System.out.println("draw is" + drawNo);

        System.out.println("loss is" + lossNo);

        System.out.println("win is" + winNo);

    }

    

}
