package finalhw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileStorage {
    private HashMap<String, String> storage;
    public FileStorage(){
        this.storage = new HashMap<>();
    }


    public String getPathBySurname(String surname){
        try {
            return this.storage.get(surname);
        } catch (NullPointerException e) {
            return returnDefaultPath(surname);
        } finally {
            return returnDefaultPath(surname);
        }
        
    }

    private static String returnDefaultPath(String surname) {
        return surname + ".txt";
    }


}
