package school.management;

import school.Person;

public class Student  extends Person {
    private int studentId;
    private String[] enrolledCourses;
    private double tuition;

    public Student(String personName, int personAge, int studentId) {
        super(personName, personAge);
        this.studentId = studentId;
        this.enrolledCourses = new String[10];
    }

    public void enrollCourse(String[] courses) {
        int i = 0;
        for(String course : courses) {
            if(i < enrolledCourses.length ) {
                enrolledCourses[i++] = course;
            }else {
                System.out.println("You reached limit of course for this quarter");
                break;
            }
        }
    }

    public void enrollCourse(String course) {
        for(int i = 0; i < enrolledCourses.length; i++) {
            if(enrolledCourses[i] == null) {
                enrolledCourses[i] = course;
                return;
            }
        }
        System.out.println("Cannot enroll in more course. Limit is reached!");
    }

    public void getTuition() {
        int courseCount = 0;
        for(String course: enrolledCourses) {
            if (course != null) {
                courseCount++;
            }
        }
        this.tuition = courseCount * 500;
    }

    public void displayDetails() {
        super.displayPerson();
        System.out.println("Student ID: " + studentId);
        System.out.print("Enrolled Courses: ");
        for (String course : enrolledCourses) {
            if (course != null) {
                System.out.print(course + " ");
            }
        }
        System.out.println("\nTuition: $" + tuition);
    }
}
