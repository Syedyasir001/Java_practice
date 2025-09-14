import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File myFile = new File("sample.txt");

        System.out.println("Attempting to read from file: " + myFile.getName());
        System.out.println("------------------------");

        try {
            Scanner fileReader = new Scanner(myFile);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line); // print each line properly
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("----------------------------");
        System.out.println("File reading finished");
    }
}
