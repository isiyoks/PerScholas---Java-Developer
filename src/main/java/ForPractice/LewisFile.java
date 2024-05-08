package ForPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LewisFile {
    String location = "resources/courses.txt";

    public void readFile(){

        try{
            File file = new File(location);
            Scanner scan = new Scanner(file);
            String data ="";

            while (scan.hasNext()){
                data = scan.nextLine();
                System.out.println(data);
            }
            System.out.println("file.isAbsolute() = " + file.isAbsolute());
            System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        }catch(FileNotFoundException e){
            System.out.println("file is not accessible or not found ");
            e.printStackTrace();
        }
    }

    public void createFile (){
        File file = new File("resources/newFile.txt");
        try{
            if (file.createNewFile()){
                System.out.println("a new file created");
            }else{
                System.out.println("The file already exists!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        File file = new File("resources/newFile.txt");
        file.delete();

    }

    public static void main(String[] args) {
//        LewisFile obj = new LewisFile();
//        obj.readFile();

        LewisFile obj2 = new LewisFile();
        obj2.createFile();

    }

}
