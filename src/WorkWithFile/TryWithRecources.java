package WorkWithFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRecources {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader fileReader = null;
        try{
             fileReader = new FileReader("/Users/nadagrinko/Desktop/java/java_core/src/text");
             throw new RuntimeException("Error");
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("finally");
            fileReader.close();
        }
        try( FileReader fileReader2 = new FileReader("/Users/nadagrinko/Desktop/java/java_core/src/text")){

        }


    }
}
