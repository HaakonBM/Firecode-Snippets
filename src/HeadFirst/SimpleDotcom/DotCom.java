package HeadFirst.SimpleDotcom;

import java.util.ArrayList;

public class DotCom {

    private int numberOfHits;
    private ArrayList<Integer> locationCells;

    public String checkYourself (String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }
    public void setLocationCells (ArrayList<Integer> locationCells) {
        this.locationCells = locationCells;
    }
}
