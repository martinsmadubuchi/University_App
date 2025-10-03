import university.undergraduateStudent;
import university.graduateStudent;
import university.student;
import university.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== System Menu =====");
            System.out.println("1. Add undergraduate student");
            System.out.println("2. Add graduate student");
            System.out.println("3. View all students");
            System.out.println("4. View only eligible students for graduation");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addUndergraduateStudent(sc, students);
                    break;
                case 2:
                    addGraduateStudent(sc, students);
                    break;
                case 3:
                    viewAllStudents(students);
                    break;
                case 4:
                    viewEligibleStudents(students);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
        sc.close();
    }

    private static void addUndergraduateStudent(Scanner sc, ArrayList<student> students) {
        System.out.println("\n--- Add Undergraduate Student ---");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter year of entry: ");
        int yearOfEntry = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter address details:");
        System.out.print("Street: ");
        String street = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("Postal code: ");
        String postalCode = sc.nextLine();
        System.out.print("Province: ");
        String province = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();

        Address address = new Address(street, city, postalCode, province, country);
        double[] marks = readMarks(sc);
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        students.add(new undergraduateStudent(subject, yearOfEntry, id, name, lastName, marks, address));
        System.out.println("✅ Undergraduate student added successfully!");
    }

    private static void addGraduateStudent(Scanner sc, ArrayList<student> students) {
        System.out.println("\n--- Add Graduate Student ---");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter year of entry: ");
        int yearOfEntry = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter thesis topic: ");
        String thesis = sc.nextLine();

        System.out.println("Enter address details:");
        System.out.print("Street: ");
        String street = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("Postal code: ");
        String postalCode = sc.nextLine();
        System.out.print("Province: ");
        String province = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();

        Address address = new Address(street, city, postalCode, province, country);
        double[] marks = readMarks(sc);
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        students.add(new graduateStudent(subject, yearOfEntry, thesis, id, name, lastName, marks, address));
        System.out.println("✅ Graduate student added successfully!");
    }

    private static double[] readMarks(Scanner sc) {
        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        double[] marks = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }
        sc.nextLine();
        return marks;
    }

    private static void viewAllStudents(ArrayList<student> students) {
        System.out.println("\n--- All Students ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (student s : students) {
            System.out.println(s);
        }
    }

    private static void viewEligibleStudents(ArrayList<student> students) {
        System.out.println("\n--- Eligible Students for Graduation ---");
        boolean found = false;
        for (student s : students) {
            if (s.graduate()) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No eligible students found.");
        }
    }
}
