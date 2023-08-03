package seminar03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_01 {
    public static void main(String[] args) {
        System.out.println("Num is: " + getNumber("Input float number: "));
    }

    public static float getNumber(String prompt){
        float num = 0;
        Scanner sc = new Scanner(System.in);

        boolean process = true;
        while (process) {
           try {
                System.out.print(prompt + " ");
                num = Float.parseFloat(sc.nextLine());
                process = false;

           } catch (NumberFormatException e) {
                System.out.print("1. Irregular input (" + e.getMessage() +" ). Go along input again: ");
           }
        }
        sc.close();
        return num;
    }
}
