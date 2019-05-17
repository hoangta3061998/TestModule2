import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        do {
            System.out.println("/******************************/");
            System.out.println("1.Add student");
            System.out.println("2.Edit student");
            System.out.println("3.Delete student");
            System.out.println("4.Sort student by gpa");
            System.out.println("5.Show student");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            System.out.println("/******************************/");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id of student:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name of student:");
                    String name = scanner.nextLine();
                    System.out.println("Enter age of student:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter address of student:");
                    String address = scanner.nextLine();
                    System.out.println("Enter gpa of student:");
                    double gpa = scanner.nextDouble();
                    Student student = new Student(id, name, address, age, gpa);
                    manager.AddStudent(student);
                    break;
                case 2:
                    System.out.println("Enter id of student you want to edit:");
                    int editId = scanner.nextInt();
                    System.out.println("New id of student:");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("New name of student:");
                    String newName = scanner.nextLine();
                    System.out.println("New age of student:");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("New address of student:");
                    String newAddress = scanner.nextLine();
                    System.out.println("New gpa of student:");
                    double newGpa = scanner.nextDouble();
                    Student studentEdit = new Student(newId, newName, newAddress, newAge, newGpa);
                    manager.EditStudent(studentEdit, editId);
                    break;
                case 3:
                    System.out.println("Enter id of student:");
                    int deleteId = scanner.nextInt();
                    manager.DeleteStudent(deleteId);
                    break;
                case 4:
                    manager.SortStudent();
                    break;
                case 5:
                    System.out.println("Students List:");
                    System.out.println("Id \t Name \t Age \t Address \t GPA");
                    manager.ShowStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");


            }
        } while (choice != 0);
    }
}

