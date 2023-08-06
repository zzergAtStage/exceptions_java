package finalhw;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        try {
            UserInputHandler userInputHandler = new PersonFactory();
            Person person = userInputHandler.createPerson();
            FileFactory ff = new FileFactory();


            System.out.println("Person created successfully: " + person.toString());
            if (!ff.savePersonToFile(person)) {
                throw new FileSavingException("File salvaging error");
            }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }

}
