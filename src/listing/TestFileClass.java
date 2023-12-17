package listing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
//        File file=new File("D:\\java\\first.txt");
//        if (!file.exists()){
//            file.createNewFile();
//        }
        File file=new File("D:\\test");
        file.mkdir();
        File file1=new File(file+"\\first.txt");
        file1.createNewFile();
      Long a=  file1.lastModified();
        System.out.println(a);

        try(PrintWriter printWriter =new PrintWriter(file1)) {
            printWriter.println("aliiii");
            printWriter.println(40);
            printWriter.println("tehran");
//            printWriter.close();
        }

        Scanner input = new Scanner(file1);

       while (input.hasNext()){
           System.out.println( input.nextLine());
       }


    }
}
