public class VariableAndFunction {
    public static void main(String[] args) throws Exception { 
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        integerType();
        doubleAndFloatType();
        charAndStringType();
        booleanType();
    }
    public static void integerType() {
        int yob = 2007;
        int age = 2026 - yob;
        System.out.println("Your yob is: " + yob);
        System.out.println("Your age is: " + age);

        long ymoney = 3000000000L;
        int ydebt = 2000000000;
        System.out.println("You have " + ymoney + "$ in your account");
        System.out.println("You need to pay " + ydebt + "$");
        System.out.println("You now have " + (ymoney - ydebt) + "$ left in your account");
    }

    public static void doubleAndFloatType() {
        double pi = 3.14;
        float vat = 0.1F;
        int radius = 2;
        System.out.println("The data type of char has 2 bytes storage!");
        System.out.println("The area of a circle has " + radius + " radius is: " + (radius * radius * pi));
        System.out.println("The average product's VAT of this year is: " + vat);
    }

    public static void charAndStringType() {
        char c = 'D';
        String name = "nguyễn trí Dũng";
        System.out.println("The first letter of my name is: " + c);
        System.out.println("The first letter of my name using func is: " + name.charAt(11));
        System.out.println("My full name as lowercase is: " + name.toLowerCase());
    }

    public static void booleanType() {
        boolean graduatedStatus = false;
        if (graduatedStatus == true) {
            System.out.println("I have graduated!");
        }
        else {
            System.out.println("I have not graduated yet!");
        }
    }
}
