package finalhw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileFactory implements SavePersonData{
   private FileStorage fileStorage;
    public FileFactory(){
        this.fileStorage = new FileStorage();
    }
    /** Saves the user data to file
     * Each unique Surname gives a file name
     * @param staff
     * @return
     * @throws IOException
     */
    @Override
    public boolean savePersonToFile(ArrayList<Person> staff) throws IOException {
        return false;
    }

    public boolean savePersonToFile(Person person) throws IOException {
        String filename = this.fileStorage.getPathBySurname(person.getSurname());
        String path = "resource/";
        File folder = new File(path);
        if (!folder.exists()) {
            createFolder(folder);
        }
        boolean result = false;
        try (FileWriter writer = new FileWriter(path + filename, true)) {
            writer.write(person.getDataAsString() + "\n");
            System.out.println("Person data written to file: " + filename);
            result = true;
        } catch (IOException e) {
            throw new IOException("Error writing data to file: " + filename + "\n"
                    + Arrays.toString(e.getStackTrace()));
        }
        return result;
    }

    private static void createFolder(File folder) throws IOException {
        if (!folder.mkdir()) {
            throw new IOException("Failed to create the 'resource' folder.");
        }
    }
}
