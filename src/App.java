import java.util.ArrayList;

public class App {
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
     * Если длина массива меньше некоторого заданного минимума,
     * метод возвращает -1 в качестве кода ошибки, иначе - длину массива.
     * @param args
     */
    public static void main(String[] args) {
       Integer[] arr = {1,2,-3,4};

       int lengthValues = 3; //граница массива (предельный размер)
       int value = -3; //искомое значение
       System.out.println(decodeErrors(checkValue(arr,lengthValues, value)));


    }
    private static String decodeErrors(int errCode) {
        if (errCode > 0 ) {
            return  "Результат поиска (индекс элемента): " +  Integer.toString(errCode) ;
        } else if (errCode == -2){
            return "Искомый элемент не найден";
        } else if (errCode == -1) {
            return "Размер массива меньше границы";
        } else if (errCode == -3) {
            return "We got a nullable array!";
        }
        return "Ошибка обработки ошибки!";
    }
    private static int checkArray(Integer[] values, int checkLength){
        if (values.length < checkLength) {
            return -1;
        } else {
            return values.length;
        }

    }
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
     * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
     * если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
     * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     * если вместо массива пришел null, метод вернет -3
     * придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
     * Напишите метод, в котором реализуете взаимодействие с пользователем.
     * То есть, этот метод запросит искомое число у пользователя, вызовет первый метод,
     * обработает возвращенное значение и покажет читаемый результат пользователю.
     * Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */
    private static int checkValue(Integer[] values, int checkLength, int someValue){
        //-1,-3 size of array
        //-2 not found
        if (values == null ) {
            return -3;
        } else if (values.length < checkLength || values.length == 0) {
            return -1;
        } else {
            for(int idx = 0; idx < values.length; idx ++)
                if (values[idx] == someValue) {
                    return idx;
                }
        }
        return -2;
    }
}
