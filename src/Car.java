public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public void sell(int amount) {
        if (amount > 0 && this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Insufficient stock to sell " + amount + " units.");
        }
    }

    @Override
    public String toString() {
        return "Car Details:\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Color: " + color + "\n" +
                "Quantity: " + quantity + "\n";
    }
}
