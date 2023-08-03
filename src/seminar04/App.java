package seminar04;

import seminar04.fourxfour.Model4x4;
import seminar04.fourxfour.MyArrayDataException;
import seminar04.fourxfour.MyArraySizeException;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
       // task4_02();
        task4_03();
    }

    private static void task4_03() throws MyArraySizeException, MyArrayDataException {
        String[][] arr = {{"1", "2", "2", "4"}
                , {"3", null, "2", "4"}
                , {"a", "6", "2", "4"}
        };
        String[][] arr1_1 = {{"1", "2", "2", "4"} //9
                            , {"3", "1", "2", "4"} //10
                            , {"3", "6", "2", "4"} //15
                            , {"5", "6", "2", "4"} //17
        };


        try {
            Model4x4 arr2 = new Model4x4(arr);
            Model4x4 arr3 = new Model4x4(arr1_1);
        } catch (MyArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            Model4x4 arr3 = new Model4x4(arr1_1);

            System.out.println("Sum = " + arr3.calcArraySum(arr3.getArray()));
        }
        //продолжаем



    }

    private static void task4_02() throws Exception {
        try (Counter cnt = new Counter();
        ) {
            cnt.add();
            cnt.add();
            System.out.println(cnt);

        } catch (IOException e) {
            System.out.println("System message: " + e.getMessage());
        }
        try {
            Counter cnt1 = new Counter();

            cnt1.add();
            cnt1.add();
            System.out.println("cnt1: " + cnt1);
            cnt1.close();
            cnt1.add();
            System.out.println("cnt1: " + cnt1);

        } catch (FileNotExistsInUserFolder e) {
            System.out.println("System message: " + e.getMessage());
        }
    }
}
