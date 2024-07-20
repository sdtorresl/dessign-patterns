package co.edu.unisabana.solid.data;

import java.util.ArrayList;
import java.util.List;

public class FIleDB implements IFIleDB {
    private static FIleDB instance;
    private final List<String> names = new ArrayList<>();


    private FIleDB() {}

    public static FIleDB getInstance() {
        if(instance == null) {
            instance = new FIleDB();
        }
        return instance;
    }

    @Override
    public void saveToFile(String name) {
        names.add(name);
    }

    private List<String> getNames() {
        return names;
    }
}
