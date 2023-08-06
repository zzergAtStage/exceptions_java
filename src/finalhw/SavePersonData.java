package finalhw;

import java.io.IOException;
import java.util.ArrayList;

public interface SavePersonData {
    public boolean savePersonToFile(ArrayList<Person> staff) throws IOException;
}
