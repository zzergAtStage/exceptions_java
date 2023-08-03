package seminar04;

import java.io.IOException;

public class SomeExceptionClass{


//    Создайте метод doSomething(), который может быть источником одного из
//    типов checked exceptions (тело самогометода прописывать не обязательно).
//    Вызовите этот метод из main и обработайте в нем исключение, которое
//    вызвал метод doSomething().
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(" Изловили собственно сгененрированное исключение: " + e.getMessage());
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException("Some exception");
    }
}
