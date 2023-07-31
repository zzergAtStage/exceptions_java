package Lesson02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03 {
    private static final String PATH_NAME = "resource/names.txt";


    public static void main(String[] args) {
        HashMap<String, String> names = readData(PATH_NAME);
        System.out.println("Result is: " + names.toString());

        //writing back
        System.out.println(flushDataNewFile(names, PATH_NAME));
    }
    public static HashMap<String, String> readData(String PATH_NAME) {
        HashMap<String, String> names = new HashMap<>();
        try {
            File file = new File(PATH_NAME);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] data = row.split("=");
                String val1, val2;
                val1 = data[0];
                if (data[1].equals("?")) {
                    //подсчет длины строки
                    val2 =  String.valueOf(data[0].length());
                } else {
                    try {
                        int val2_1 = Integer.parseInt(data[1]);
                        val2 = String.valueOf(val2_1);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный параметр переменной в файле для строки: " + data[0]);
                        continue;
                    }
                }
                names.put(val1, val2);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public static String flushDataNewFile(HashMap<String,String> names, String path) {
        try {
            File file = new File(PATH_NAME);
            FileWriter fw = new FileWriter(file);
            for (Map.Entry<String, String> element : names.entrySet()
            ) {
                String row = element.getKey() + "=" + element.getValue() +  "\n";
                fw.write(row);
            }
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File >" + path + "< not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "Writing was successfully";
    }
}