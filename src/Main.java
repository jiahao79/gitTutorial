/**
 * Created by ethan on 2017-02-07.
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Student("Bob", "bob@uwo.ca", "Restaurant Management");
        Person p2 = new Instructor("Alice", "aline@uwo.ca", "Assistant Professor");

        System.out.println(p1);
        System.out.println(p2);
    }
}
