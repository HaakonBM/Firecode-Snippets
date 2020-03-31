package HeadFirst;

public class SimpleDotCom {

    private int numberOfHits;
    private int[] locationCells;

    public String checkYourself (String guess) {
        String result = "miss";
        int numGuess = Integer.parseInt(guess);
        for (int cell: locationCells) {
            if (numGuess == cell) {
                numberOfHits++;
                result = "hit";
                break;
            }
        }
        if (numberOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    public void setLocationCells (int[] locationCells) {
        this.locationCells = locationCells;
    }

}
