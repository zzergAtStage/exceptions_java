package seminar04.fourxfour;

public class Model4x4 {
    public String[][] getArray() {
        return array;
    }

    String[][] array;
    public Model4x4 (String[][] array) throws MyArraySizeException {
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4 || array.length != 4) throw new MyArraySizeException();
        }
        System.out.println("Массив успешно создан");
        this.array = array;
    }

    public int calcArraySum(String[][] arr) throws MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr[i].length -1; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Кривичи положили данные в ячейку: " + i + ":" + j);
                }
            }
        }
        return sum;
    }
}
