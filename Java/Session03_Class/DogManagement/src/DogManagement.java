import data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        Dog shiBa = new Dog("Ngáo Đá", 2022, 20.0);
        shiBa.bark();
        shiBa.loseWeight(10.0);
        System.out.println("After lose weight, shiBa bark:");
        shiBa.bark();
        Dog pug = new Dog("Khoa Pug", 2023, 5.0);
        System.out.println(shiBa.toString());
        System.out.println(pug.toString());
    }
}
