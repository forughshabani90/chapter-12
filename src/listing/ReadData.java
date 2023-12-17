package listing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("scores.txt");
        Scanner input=new Scanner(file);
        while (input.hasNext()){
            String firstname=input.next();
            String mi=input.next();
           int score=input.nextInt();
            System.out.println(firstname +""+mi + ""+ score);
        }
        input.close();
    }
}
