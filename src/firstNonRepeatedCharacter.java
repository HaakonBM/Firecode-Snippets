import java.util.HashMap;

public class firstNonRepeatedCharacter {

    public static Character firstNonRepeatedCharacter (String str){

        HashMap<Character,  Integer> timesCharacter = new HashMap<Character, Integer>();
        int times = 1;

        for (int i = 0; i < str.length(); i++) {
            Character letter = str.charAt(i);
            if (!timesCharacter.containsKey(letter)) {
                timesCharacter.put(letter, times);
            } else {
                int increment = timesCharacter.get(letter);
                increment++;
                timesCharacter.put(letter, increment);
            }
        }
        Character returnChar = null;

        for (int i = 0; i < str.length(); i++) {
            Character letter = str.charAt(i);
            if (timesCharacter.get(letter).equals(1)) {
                returnChar = letter;
                break;
            }
        }

        return returnChar;
    }
}
