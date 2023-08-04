package seminar03;

import java.util.Scanner;

public class Task3_04 {

    public static void main(String[] args) {
        //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        try {
            getUserInput();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getUserInput() throws Exception{
        String val;
        System.out.print("Введите данные: ");
        try (
                Scanner sc = new Scanner(System.in)
            ) {
            val = sc.nextLine();
            val = val.replaceAll("\\s","");
            if (val.isEmpty()) throw new Exception("Не положено вводить пустые строки!");
        }
    }
}
