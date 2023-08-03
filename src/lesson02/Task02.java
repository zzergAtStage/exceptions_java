package lesson02;

public class Task02 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2"}, {"3", null}, {"a", "6"}};
        System.out.println("Summ of arr: " + sum2(arr));
    }

    public static int sum2(String[][] arr) {
        /**
         * 1 1 1 < [0]
         ^ ^ ^   [0].length
         * 2 2 2 2 <
         * ^ ^ ^ ^
         */
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                val = convertStringToInt(j, arr[i]);
                sum += val;
            }
        }
        return sum;
    }

    private static int convertStringToInt(int j, String[] arr) {
        int val;
        try {
            val = Integer.parseInt(arr[j]);
        } catch (NumberFormatException e) {
            System.out.println("Got some error: ");
            val = 0;
        }
        return val;
    }
}
