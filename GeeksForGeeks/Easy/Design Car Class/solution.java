class Car {
    // Define the properties brand, model and year
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String b, String m, int y) {
        // Initialize brand, model, and year
        brand = b;
        model = m;
        year = y;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Solution {
    public void fun(String brand, String model, int year) {

        // Create Car class and call displayDetails() method
        Car car = new Car(brand, model, year);
        car.displayDetails();
    }
}