package HeadFirst.DotCom;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame () {

        Scanner reader = new Scanner(System.in);
        int startCell = (int) Math.random() *5;

        DotCom fregatt = new DotCom();
        fregatt.setName("Pets.com");

        DotCom skonnert = new DotCom();
        skonnert.setName("Go2.com");

        DotCom hangar = new DotCom();
        hangar.setName("Mittens.com");

        dotComList.add(fregatt);
        dotComList.add(skonnert);
        dotComList.add(hangar);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, Go2.com, Mittens.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying () {
        while(!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess (String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame () {
        System.out.println("All Dotcoms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();;
    }

}
