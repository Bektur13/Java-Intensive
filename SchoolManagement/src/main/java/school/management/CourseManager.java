package school.management;

public class CourseManager {
    private Student[] students;
    private int studentCount;

    public CourseManager() {
        this.students = new Student[10];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student; // Add student to the array
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public void displayAllStudents() {
        System.out.println("All students: ");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayPerson();
            System.out.println();
        }
    }
}
