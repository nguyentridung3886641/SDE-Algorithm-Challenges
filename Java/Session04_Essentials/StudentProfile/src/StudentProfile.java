import java.util.Scanner;

public class StudentProfile {
    
    public static void main(String[] args) {
        inputProfile();
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.print("input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.println("Here is your profile:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Year of birth: " + yob);

        sc.close();
    }

}