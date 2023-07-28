public class Task02 {
    static int rows = 4;
    static int cols = 4;
    public static void main(String[] args) {

        int[][] arr = fillArray(rows,cols);
        prinf2D(arr);

        System.out.println("Сумма массива: " + sumOfArray(arr));
    }
    private static int[][] fillArray(int rows, int cols){
        int[][] array = new int[rows][cols];
        for (int idx = 0; idx < rows; idx++){
            for (int ydx = 0; ydx < cols; ydx++){
                array[idx][ydx] =  5;//(idx % 2 == 0) ? 1 : 0;
            }
        }
        return array;
    }
    private static void prinf2D(int[][] array) {
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sumOfArray (int[][] array) {
        int arraySum = 0;
        for (int[] bracket : array
             ) {
            if (array.length != bracket.length){
                throw new RuntimeException("This array is not square");
            }
        }
        for(int idx = 0; idx < array.length; idx++ ){
            for (int y = 0; y < array[0].length; y++) {
                if (array[idx][y] != 1 && array[idx][y] != 0) {
                    throw new RuntimeException("Это не двоичный массив");
                }
                arraySum += array[idx][y];
            }
        }
        return arraySum;
    }
}
