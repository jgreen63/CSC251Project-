import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        // scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // asking user for the department
        System.out.print("Please enter the courseNumber: ");
        String dept = scanner.nextLine();

        // asking for the id
        System.out.print("Please enter id: ");
        int id = scanner.nextInt();

        // asking for the credits
        System.out.print("Enter credits: ");
        double credits = scanner.nextDouble();

        // lab course
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};

        // flag to know whether the user entered course is a lab course or not
        boolean isLabCourse = false;

        // iterating the array
        for (String labCourse: labCourses) {
            // if lab course matches with user entered lab course set the flag to true and break
            if (labCourse.equals(dept)) {
                isLabCourse = true;
                break;
            }
        }

        // if is a lab course then create the lab course object and display the information, else create the college course object and display it
        if (isLabCourse) {
            LabCourse labCourse = new LabCourse(dept, id, credits);
            labCourse.display();
        } else {
            CollegeCourse collegeCourse = new CollegeCourse(dept, id, credits);
            collegeCourse.display();
        }
    }
}