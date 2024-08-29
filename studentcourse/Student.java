import java.util.List;
import java.util.ArrayList;

public class Student{
    String studentID;
    String stuName;
    List<Course> registeredCourses;


    public Student(String studentID,String stuName ){
        this.studentID=studentID;
        this.stuName=stuName;
        this.registeredCourses=new ArrayList<Course>();
    }
    public String getStudentID(){
        return studentID;
    }
    public String getStuName(){
        return stuName;
    }
    public void addCourse(Course course){
        registeredCourses.add(course);
    }
    public void removeCourse(Course course){
        registeredCourses.remove(course);
    }
    public List<Course> getRegisteredCourses(){
        return registeredCourses;
    }

    public boolean isRegisteredForCourse(Course course) {
        return registeredCourses.contains(course);
    }

    @Override
    public String toString(){
        return "StudentID: "+studentID+" StudentName: "+stuName+
        " RegisteredCourses: "+registeredCourses;
    }
}