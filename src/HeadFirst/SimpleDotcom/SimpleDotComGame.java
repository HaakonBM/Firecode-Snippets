package HeadFirst.SimpleDotcom;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main (String[] args) {
        /*
        int numberOfGuesses = 0;
        String result = "";
        String guess = "";

        SimpleDotCom game = new SimpleDotCom();
        Scanner reader = new Scanner(System.in);

        Random ran = new Random();
        int startingCell = ran.nextInt(4-0 +1);
        int[] shipCells = {startingCell, startingCell+1, startingCell+2};
        game.setLocationCells(shipCells);

        while(!result.equals("kill")) {
            System.out.println("Enter a number: " + numberOfGuesses);
            guess = reader.nextLine();
            result = game.checkYourself(guess);
        }
        */
        int numOfGuesses = 0;
        Scanner reader = new Scanner(System.in);

        SimpleDotCom game = new SimpleDotCom();
        int startCell = (int) Math.random() *5;

        //int[] locations = {startCell, startCell+1, startCell+2};
        //game.setLocationCells(locations);

        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(startCell);
        locations.add(startCell+1);
        locations.add(startCell+2);

        DotCom newGame = new DotCom();
        newGame.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive) {
            System.out.print("Guess a number: ");
            String guess = reader.nextLine();
            String result = newGame.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }

        /*
        boolean isAlive = true;

        while(isAlive) {
            System.out.print("Guess a number: ");
            String guess = reader.nextLine();
            String result = game.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }
        */

    }

}
