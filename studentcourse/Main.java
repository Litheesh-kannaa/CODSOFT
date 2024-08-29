import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        List<Course> availableCourses = new ArrayList<>();

        
        Student student = new Student("12345", "John Doe");

        
        Scanner scanner = new Scanner(System.in);

        
        Course course1 = new Course("MATH101", "Mathematics 101", "Introduction to Mathematics", 30, "2022-01-01", "2022-05-31", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM");
        Course course2 = new Course("CS202", "Data Structures and Algorithms", "Introduction to Data Structures and Algorithms", 25, "2022-01-01", "2022-05-31", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM");
        Course course3 = new Course("ENGL301", "Advanced Writing Techniques", "Advanced Writing Techniques", 20, "2022-01-01", "2022-05-31", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM");

        availableCourses.add(course1);
        availableCourses.add(course2);
        availableCourses.add(course3);

        
        while (true) {
            System.out.println("Welcome to the Course Registration System!");
            System.out.println("1. Register for a course");
            System.out.println("2. Drop a course");
            System.out.println("3. View registered courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   
                    System.out.println("Available Courses:");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        Course c = availableCourses.get(i);
                        System.out.println((i + 1) + ". " + c.getCourseCode() + " - " + c.getTitle() + " (Available slots: " + c.getCapacity() + ")");
                    }
                    System.out.print("Enter the number of the course you want to register for: ");
                    int courseNumber = scanner.nextInt();
                    Course selectedCourse = availableCourses.get(courseNumber - 1);
                    if (student.isRegisteredForCourse(selectedCourse)) {
                        System.out.println("You are already registered for this course.");
                    } else if (selectedCourse.getCapacity() > 0) {
                        student.addCourse(selectedCourse);
                        selectedCourse.setCapacity(selectedCourse.getCapacity() - 1);
                        System.out.println("Course registered successfully!");
                    } else {
                        System.out.println("Sorry, the course is full.");
                    }
                    break;
                case 2:
                    
                    System.out.println("Registered Courses:");
                    List<Course> registeredCourses = student.getRegisteredCourses();
                    for (int i = 0; i < registeredCourses.size(); i++) {
                        Course c = registeredCourses.get(i);
                        System.out.println((i + 1) + ". " + c.getCourseCode() + " - " + c.getTitle());
                    }
                    System.out.print("Enter the number of the course you want to drop: ");
                    int dropCourseNumber = scanner.nextInt();
                    Course dropCourse = registeredCourses.get(dropCourseNumber - 1);
                    student.removeCourse(dropCourse);
                    dropCourse.setCapacity(dropCourse.getCapacity() + 1);
                    System.out.println("Course dropped successfully!");
                    break;
                case 3:
                    
                    System.out.println("Registered Courses:");
                    registeredCourses = student.getRegisteredCourses();
                    for (Course c : registeredCourses) {
                        System.out.println("  " + c.getCourseCode() + " - " + c.getTitle());
                    }
                    break;
                case 4:
                    
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        scanner.close();
        }
    }
}