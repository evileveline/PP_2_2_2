package web.model;

public class Car {
    private String brand;
    private int year;
    private String color;

    public Car (String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return year;
    }

    public void setSeries(int Series) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }
}
