package module303.Glab303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {
try{
        File file = new File("resources/CourseData.csv");
        Scanner scan = new Scanner(file);
        ArrayList <Course > data = new ArrayList<Course>();

        while (scan.hasNext()){
            String [] eachLine =scan.nextLine().split(",");

            // course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
            Course course = new Course();
            course.setCourseCode(eachLine[0]);
            course.setCourseName(eachLine[1]);
            course.setInstructorName(eachLine[2]);

            data.add(course);
        }

        for(Course eachCourse:data) {
            System.out.println(eachCourse.getCourseCode()
                    + " | " + eachCourse.getCourseName()
                    + " | " + eachCourse.getInstructorName());
            System.out.println("===========================");
        }




    }catch(FileNotFoundException e){
        System.out.println("File Not Found! ");
        e.printStackTrace();
    }

    }
}
