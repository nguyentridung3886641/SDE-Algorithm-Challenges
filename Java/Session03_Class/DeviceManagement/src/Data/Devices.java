package Data;

public class Devices {
    private String id;
    private String name;
    private String brand;
    private int releaseYear;
    private double price;
    
    public Devices(String id, String name, String brand, int releaseYear, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getDeviceAge() {
        return 2026 - releaseYear;
    }

    public double getVndPrice() {
        return price * 25000;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-20s|%-15s|%4d|%7.2f|", id, name, brand, releaseYear, getVndPrice());
    }
}
