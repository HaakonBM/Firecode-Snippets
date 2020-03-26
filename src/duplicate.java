import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class duplicate {

    public static String duplicate (int[] numbers) {
        HashMap<Integer, Integer> duplicateValues = new HashMap<>();
        int startValue = 1;
        for (int i : numbers) {
            if (!duplicateValues.containsKey(i)) {
                duplicateValues.put(i, startValue);
            } else {
                Integer increment = duplicateValues.get(i);
                increment++;
                duplicateValues.put(i, increment);
            }
        }
        ArrayList<Integer> dValues = new ArrayList<>();
        for (int i : numbers) {
            if (duplicateValues.get(i) > 1) {
                dValues.add(duplicateValues.get(i));
            }
        }
        Collections.sort(dValues);
        String ut = "[";
        for (int i = 0; i < dValues.size(); i++) {
            ut += dValues.get(i) + ", ";
        }
        ut += "]";
        return ut;
    }
}
