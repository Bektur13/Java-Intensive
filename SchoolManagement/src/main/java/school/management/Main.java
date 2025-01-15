package school.management;

import school.Person;

public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Student student1 = new Student("Bektur", 20,202641794);
        Student student2 = new Student("Dastan", 22, 202781794);

        student1.enrollCourse(new String[] {"Math", "Science"});
        student2.enrollCourse("History");

        student1.getTuition();
        student2.getTuition();

        manager.addStudent(student1);
        manager.addStudent(student2);

        manager.displayAllStudents();
    }
}
