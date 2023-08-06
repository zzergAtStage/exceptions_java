package finalhw;

public class FileSavingException extends Exception {
    public FileSavingException(String message){
        super((message.isEmpty()) ? "File saving error!": message);
    }
}
