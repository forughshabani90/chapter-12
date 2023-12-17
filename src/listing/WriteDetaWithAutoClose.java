package listing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDetaWithAutoClose {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("source.txt");
        if(file.exists()){
            System.out.println("file already exists");
            System.exit(0);
        }
        try ( PrintWriter output=new PrintWriter(file)){
            output.print("john t smit");
            output.println(90);
            output.println("Eric k jones");
            output.println(85);

        }
    }
}
