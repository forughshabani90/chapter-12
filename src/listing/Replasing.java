package listing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Replasing {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length!=4){
            System.out.println("usage: java Replacetext source file " + "doesent exist");
            System.exit(1);
        }
        File sourcefile=new File(args[0]);
        if(!sourcefile.exists()){
            System.out.println(" sourcefile " +args[0] + "does not exist");
            System.exit(2);
        }
        File targetFile=new File(args[1]);
        if(targetFile.exists()){
            System.out.println(" target file " + args[1] + " already exists");
            System.exit(3);
        }
        try (
            Scanner input=new Scanner(sourcefile);
            PrintWriter output=new PrintWriter(targetFile);
        )
        {
            while (input.hasNext()){
                String s1=input.next();
                String s2=s1.replaceAll(args[2],args[3]);
                output.println(s2);

            }
        }

    }
}
