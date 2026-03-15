import java.util.Scanner;

import data.Student;

public class StudentManagementV2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("pls input " + (i + 1) + "st sutdent information!");
        }
        showInfo(sc, n);
    }
    public static void showInfo(Scanner sc, int n) {
        Student[] list = new Student[n];
        String name, id;
        int yob;
        double gpa;
        for (int i = 0; i < n; i++) {
            System.out.print("input name: ");
            name = sc.nextLine();

            System.out.print("input id: ");
            id = sc.nextLine();
            while (true) {
                try {
                    System.out.print("input yob: ");
                    yob = Integer.parseInt(sc.nextLine());

                    System.out.print("input gpa: ");
                    gpa = Double.parseDouble(sc.nextLine());

                    break;
                } catch (Exception e) {
                    System.out.println("The information you just have input is invalid!");
                    System.out.println("Please try again...");
                }
            }

            list[i] = new Student(name, id, yob, gpa);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("This is " + (i + 1) + "st student's information:");
            System.out.println(list[i].toString());
        }
    }
}
