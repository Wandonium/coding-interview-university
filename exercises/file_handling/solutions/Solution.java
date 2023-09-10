import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            File newFile = new File("numbersResult.txt");
            boolean createdNewFileSuccessfully = false;
            if(newFile.createNewFile()) {
                createdNewFileSuccessfully = true;
            }
            Scanner reader = new Scanner(file);
            FileWriter writer = new FileWriter("numbersResult.txt");
            int lineNumber = 0;
            while(reader.hasNextLine()) {
                int num = reader.nextInt();
                System.out.println(num);
                lineNumber++;
                int newNum = num * lineNumber;
                if(createdNewFileSuccessfully) {
                    writer.write(String.valueOf(newNum) + "\n");
                }
            }
            reader.close();
            writer.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error finding file numbers.txt: ");
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("Error creating new file numbersResult.txt: ");
            e.printStackTrace();
        }
    }
}