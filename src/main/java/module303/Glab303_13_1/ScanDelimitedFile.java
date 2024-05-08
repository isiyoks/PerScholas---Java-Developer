package module303.Glab303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//delimited file = csv file (items separated by , or | exc)
//the split method helps you extract individual data values from a CSV line
// by separating them based on the comma delimiter.
public class ScanDelimitedFile {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("resources/cars.csv");
            Scanner scan = new Scanner(file);

            ArrayList<String[]> lines = new ArrayList<>();
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(",");
                lines.add(line);
            }

            for (String[] each : lines) {
                System.out.println(Arrays.toString(each));
            }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found! ");
            e.printStackTrace();
        }


    }


}
