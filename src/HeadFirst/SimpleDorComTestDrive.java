package HeadFirst;

public class SimpleDorComTestDrive {

    public static void main (String[] args) {
        SimpleDotCom game = new SimpleDotCom();

        int[] locations = {2,3,4};

        game.setLocationCells(locations);


        String guess = "1";
        String result = game.checkYourself(guess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.print("Should miss test: ");
        System.out.println(testResult);

        guess = "2";
        result = game.checkYourself(guess);
        testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.print("Should hit test: ");
        System.out.println(testResult);

        guess = "3";
        result = game.checkYourself(guess);
        testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.print("Should hit test: ");
        System.out.println(testResult);

        guess = "4";
        result = game.checkYourself(guess);
        testResult = "failed";
        if (result.equals("kill")) {
            testResult = "passed";
        }
        System.out.print("Should kill test: ");
        System.out.println(testResult);
    }

}
