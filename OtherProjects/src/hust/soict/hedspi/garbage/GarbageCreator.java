package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\84963\\Programming_Java\\Week2\\OtherProjects\\test.txt");
            long start = System.currentTimeMillis();
            Scanner scanner = new Scanner(inputFile);
            String str = "";
            while(scanner.hasNextLine()) {
                str += scanner.nextLine() + "\n";
            }
            System.out.println("Processing time:"+ (System.currentTimeMillis() - start));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
