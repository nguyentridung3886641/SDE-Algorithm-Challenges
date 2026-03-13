package data;

public class Dog {
    private String name;
    private int yob;
    private double weight;

    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    public void bark() {
        System.out.println("Go go go | " + name + " | " + yob + " | " + weight);
    }
    public void loseWeight(double newWeight) {
        weight = newWeight;
    }
    public String toString() {
        String barkV2 = String.format("Go go go |%-10s|%4d|%4.1f|", name, yob, weight);
        return barkV2;
    }
}
