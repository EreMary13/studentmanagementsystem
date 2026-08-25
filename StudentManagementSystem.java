
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("\nEnter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Add Student ---");
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    students.add(name);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- View Students ---");

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (String student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Search Student ---");
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();

                    if (students.contains(searchName)) {
                        System.out.println("Student found!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Remove Student ---");
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();

                    if (students.remove(removeName)) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
