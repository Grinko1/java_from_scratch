package WorkWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String menu = "Bread - 40 rubles";
        String fileName = "/Users/nadagrinko/Desktop/java/java_core/src/WorkWithFile/menu.txt";
        FileOutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(menu.getBytes(StandardCharsets.UTF_8));
        outputStream.close();

    }
}
