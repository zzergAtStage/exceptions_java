package seminar04;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        try (Counter cnt = new Counter();
        ){

            cnt.add();
            cnt.add();
            System.out.println(cnt);

        } catch (IOException e) {
            System.out.println("System message: " + e.getMessage());
        }
        try {
            Counter cnt1 = new Counter();

            cnt1.add();
            cnt1.add();
            System.out.println("cnt1: " +   cnt1);
            cnt1.close();
            cnt1.add();
            System.out.println("cnt1: " + cnt1);

        } catch (IOException e) {
            System.out.println("System message: " + e.getMessage());
        }
    }
}
