package HeadFirst.DotCom;

import java.util.ArrayList;

public class DotComTestDrive {

    public static void main(String[] args) {

        DotComTestDrive test = new DotComTestDrive();
        int numErrors = test.error();
        if (numErrors > 0) {
            System.out.println("Test failed");
        }

    }



public int error () {

    int errors = 0;

    DotCom testGame = new DotCom();
    testGame.setName("TestShip");

    ArrayList<String> locations = new ArrayList<>();
    locations.add("A1");
    locations.add("A2");
    locations.add("A3");

    testGame.setLocationCells(locations);

    String guess = "A4";
    String result = "";


    result = testGame.checkYourself(guess);
    if (!result.equals("miss")) {
        System.out.println("HitDetectionException: Excpected: " + " miss \nActual: " + result);
        errors++;
    }
    guess = "A1";
    if (!result.equals("hit")) {
        System.out.println("HitDetectionException: Excpected: " + " hit \nActual: " + result);
        errors++;
    }
    guess = "A2";
    if (!result.equals("hit")) {
        System.out.println("HitDetectionException: Excpected: " + " hit \nActual: " + result);
        errors++;
    }
    guess = "A3";
    if (!result.equals("kill")) {
        System.out.println("HitDetectionException: Excpected: " + " kill \nActual: " + result);
        errors++;
    }

    if (errors > 0) {
        System.out.println("Du har " + errors + " feil ved hitdetection");
    } else {
        System.out.println("Alle tester godkjent");
    }
    return errors;
}
}
