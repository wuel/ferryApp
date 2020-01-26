package pl.exercise.ferry.basket;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Writer {

    String id;
    final String path = "D:\\projekty\\java\\ferryApp\\files\\";

    public Writer() throws IOException {
    }

    public File createFile() {
        id = String.valueOf(new Date().getTime());
        String newPath = path + id + ".txt";
        return new File(newPath);
    }

    public String getId(){
        return id;
    }


}
