import java.util.Scanner;

import Data.Students;

public class StudentManagement {
    
    public static void main() {
        inputStudentAs();
    }
    public static void inputStudentAs() {
        String id, name;
        int yob;
        double gpa;
        Scanner src = new Scanner(System.in);

        System.out.printf("input your id: ");
        id = src.nextLine();

        System.out.printf("input your name: ");
        name = src.nextLine();

        System.out.printf("input your yob: ");
        yob = src.nextInt();

        System.out.printf("input your gpa: ");
        gpa = Double.parseDouble(src.nextLine());

        Students tDung = new Students(id, name, yob, gpa);

        int age = tDung.getAge();

        age += age;

        src.close();

        System.out.print(tDung.toString());
    }
}
