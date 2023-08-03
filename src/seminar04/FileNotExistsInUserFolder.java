package seminar04;

public class FileNotExistsInUserFolder extends Exception {
    public FileNotExistsInUserFolder() {
        super("Выбраный файл не найден в папке пользователя %s");
    }
}
