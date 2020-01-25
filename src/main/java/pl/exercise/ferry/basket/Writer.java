package pl.exercise.ferry.basket;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Writer {

    final String path = "D:\\projekty\\java\\ferryApp\\files\\file";


    public Writer() throws IOException {
    }


    public File createFile() {
        String newPath = path + new Date().getTime() + ".txt";
        return new File(newPath);
    }


}
