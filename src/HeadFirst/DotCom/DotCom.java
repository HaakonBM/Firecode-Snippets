package HeadFirst.DotCom;

import java.util.ArrayList;

public class DotCom {

    private String name;

    private ArrayList<String> locationCells;

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
        return result;
    }

    public void setLocationCells (ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName (String name) {
        this.name = name;
    }

}
