public class findMissingNumber {

    public static int findMissingNumber (int[] arr) {
        int[] allNumbers = {0,1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            allNumbers[arr[i]] = 0;
        }
        int returnNumber = 0;
        for (int i = 1; i < allNumbers.length; i++) {
            if (allNumbers[i] > 0) {
                returnNumber = allNumbers[i];
            }
        }
        return returnNumber;
    }

}
