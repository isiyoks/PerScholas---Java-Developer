package module303.Glab303_13_1;
/*
Let’s make our code more professional using the concept of “Encapsulation.”
Another way of handling a delimited file is by creating something called a Model, Pojo, or Entity.
A Model is simply a class containing variables with getter() methods and setter() methods,
corresponding to each column of the delimited file and containing everything a normal class can contain.

Assume that you have ‘course’ information in the form of a CSV file.
As a developer, it is your responsibility to extract data from a file,
and then display the data in a console.
Finally, you import data into the database.
This process is called ETL (Extract Transformation Load).
Let’s see first how we can extract/read data from a CSV file in a professional way.

 */
public class Course {
    private String courseCode;
    private String courseName;
    private String instructorName;

    public Course(){
    }
    public Course (String code, String name, String instructor) {
        this.courseCode = code;
        this.courseName = name;
        this.instructorName = instructor;
    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
