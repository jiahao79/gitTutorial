/**
 * Created by ethan on 2017-02-07.
 */
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    String major;
    List<Course> courseList;
    boolean fulltime;
    public Student(String name, String emailAddress, String major,boolean fulltime) {
        super(name, emailAddress);
        this.major = major;
        this.fulltime=fulltime;
    }
    public void addCourse(Course c){
        if (this.courseList == null)
            this.courseList = new ArrayList<Course>();
        this.courseList.add(c);
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s\nFulltime: %b", this.name, this.major, this.emailAddress, this.fulltime);
    }
}
