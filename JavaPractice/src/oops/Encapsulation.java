package oops;

public class Encapsulation {
    private String brand; // Private field
    private int year;     // Private field

    // Getter methods for brand and year (to access private fields)
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Setter methods for brand and year (to modify private fields)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Constructor to initialize brand and year
	/*
	 * public Encapsulation(String brand, int year) { this.brand = brand; this.year
	 * = year; }
	 */

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + year);
    }

    public static void main(String[] args) {
        // Creating an object of class Car
       Encapsulation myCar = new Encapsulation();

        // Accessing and modifying object's state using methods
        myCar.displayInfo(); // Display initial car info
        myCar.setBrand("Honda"); // Modify brand
        myCar.setYear(2023); // Modify year
        myCar.displayInfo(); // Display modified car info
    }
}
