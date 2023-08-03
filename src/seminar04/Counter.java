package seminar04;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements AutoCloseable{
//    Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//    значение внутренней int переменной на 1.
//    Сделайте так, чтобы с объектом такого типа можно было работать в
//    блоке try-with-resources.
//    Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном
//    try и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
//    лучше всего.
    int counter;

    boolean isClosed;

    public boolean isClosed() {
        return isClosed;
    }
    public Counter(){
        this.isClosed = false;
    }
    public void add() throws IOException {
        if (this.isClosed) {
            throw new IOException("Counter is closed (my be connection lost)");
        }else {
            this.counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void close() throws Exception {
        this.isClosed = true;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }
}
