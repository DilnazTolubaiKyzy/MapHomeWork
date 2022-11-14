package task1;

public class DataCar {
    private int yearOfRelease;
    private String stamp;
    private int price;
    private String color;

    public DataCar(int yearOfRelease, String stamp, int price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.stamp = stamp;
        this.price = price;
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DataCar{" +
                "yearOfRelease=" + yearOfRelease +
                ", stamp='" + stamp + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
