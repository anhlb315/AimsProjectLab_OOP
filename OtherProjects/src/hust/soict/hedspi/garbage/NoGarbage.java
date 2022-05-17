package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        try {
            File inputFile = new File("C:\\Users\\84963\\Programming_Java\\Week2\\OtherProjects\\test.txt");
            long start = System.currentTimeMillis();
            Scanner scanner = new Scanner(inputFile);
            StringBuffer stringBuffer = new StringBuffer();
            while(scanner.hasNextLine()) {
                stringBuffer.append(scanner.nextLine() + "\n");
            }

            System.out.println("Processing time: "+(System.currentTimeMillis() - start) );
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
