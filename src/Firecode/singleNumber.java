package Firecode;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {

    public static int singleNumber (int[] array) {

        HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        int numberOftimes = 1;

        for (int i : array) {
            if (!numberMap.containsKey(i)) {
                numberMap.put(i, numberOftimes);
            } else {
                int value = numberMap.get(i);
                value++;
                numberMap.put(i,value);
            }
        }
        return findSingle(array, numberMap);
    }

    private static int findSingle (int[] keys, Map map) {
        Integer singleNumber = 0;
        for (int i : keys) {
            if (map.get(i).equals(1)) {
                singleNumber = i;
                return singleNumber;
            }
        }
        return 0;
    }

}
