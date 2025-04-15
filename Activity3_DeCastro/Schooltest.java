package Activity3_DeCastro;
import java.util.Scanner;

class Person {
        protected String name;
        protected int id;

    public Person (String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }

    public void displayInfo() { 

        System.out.println("Name: " + name); 
        System.out.println("ID: " + id);
         
    }
}
    public class Schooltest{    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Details:");
        System.out.println("Name:");
        String studentName = scan.nextLine();
        System.out.println("ID number:");
        int studentId = scan.nextInt();
        scan.nextLine();
        System.out.println("Grade Level:");
        String StudentgradeLevel = scan.nextLine();

        System.out.println("\nEnter Teacher Details:");
        System.out.println("Name:");
        String teacherName = scan.nextLine();
        System.out.println("ID number:");
        int teacherId = scan.nextInt();
        scan.nextLine();
        System.out.println("Subject:");
        String Teachersubject = scan.nextLine();

        System.out.println("\nEnter Staff Details:");
        System.out.println("Name:");
        String staffName = scan.nextLine();
        System.out.println("ID:");
        int staffId = scan.nextInt();
        scan.nextLine();
        System.out.println("Department:");
        String Staffdepartment = scan.nextLine();
       

        Person student = new Student(studentName, studentId, StudentgradeLevel);
        Person teacher = new Teacher(staffName, staffId, Teachersubject);
        Person staff = new Staff(staffName, staffId, Staffdepartment);

        System.out.println("\nStudent Details:");
        student.displayInfo();
        System.out.println("\nTeacher Details:");
        teacher.displayInfo();
        System.out.println("\nStaff Details:");
        staff.displayInfo();
        
        scan.close();
       

    }
}
