import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("Model S", "Tesla", 2022, 79999.99, "Red", 10);

        System.out.println("Initial Car Details:");
        System.out.println(car.toString());

        car.sell(1);
        System.out.println("Car Details after selling 1 unit:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        System.out.print("Enter new brand: ");
        String newBrand = scanner.nextLine();
        car.setBrand(newBrand);

        System.out.print("Enter new model: ");
        String newModel = scanner.nextLine();
        car.setModel(newModel);

        System.out.print("Enter new year: ");
        int newYear = scanner.nextInt();
        car.setYear(newYear);

        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();
        car.setPrice(newPrice);

        System.out.print("Enter new color: ");
        scanner.nextLine();
        String newColor = scanner.nextLine();
        car.setColor(newColor);

        System.out.print("Enter the quantity of cars delivered: ");
        int deliveredQuantity = scanner.nextInt();
        car.delivery(deliveredQuantity);

        System.out.println("Car Details after delivery:");
        System.out.println(car.toString());

        scanner.close();
    }
}
