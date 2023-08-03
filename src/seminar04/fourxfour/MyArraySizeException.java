package seminar04.fourxfour;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Невозможно создать массив не соответствующий размерности 4x4: ");
    }
}
