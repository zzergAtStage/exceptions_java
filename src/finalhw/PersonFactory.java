package finalhw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonFactory implements UserInputHandler {
    @Override
    public Person createPerson() throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the person's data (Name Surname PhoneNumber(only digits) DateOfBirth(dd-MM-yyyy)): ");
            String input = scanner.nextLine();

            String[] data = input.split(" ");
            if (data.length != 5) {
                throw new IllegalArgumentException("Invalid input format. Please provide Name, Surname, PhoneNumber, and DateOfBirth separated by whitespaces.");
            }

            String name = data[0];
            String surname = data[1];
            int phoneNumber = Integer.parseInt(data[3]);

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dateOfBirth = dateFormat.parse(data[4]);

            return new Person(name, surname, phoneNumber, dateOfBirth);
        } catch (ParseException e) {
            throw new Exception("Invalid DateOfBirth format. Please use dd-MM-yyyy format.");
        } catch (NumberFormatException e) {
            throw new Exception("Invalid PhoneNumber format. Please provide only digits for the PhoneNumber.");
        } finally {
            scanner.close();
        }
    }
}
