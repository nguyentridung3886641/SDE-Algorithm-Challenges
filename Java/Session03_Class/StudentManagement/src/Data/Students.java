package data;

public class Students {
    private String name;
    private String id;
    private int yob;
    private double gpa;

    public Students(String name, String id, int yob, double gpa) {
        this.name = name;
        this.id = id;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%-15s|%-8s|%4d|%3.1f|", name, id, yob, gpa);
    }
}
