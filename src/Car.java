public class Car {
    private String make;
    private String model;
    private String color;
    private double price;
    private double mileage;

    public Car(){
        mileage = 0;
        make = "Toyota";
        model = "Yaris";
        color = "Blue";
        price = 1234.90;
    }
    public Car(String make, String model, String color, double price){
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        mileage = 0;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void paint(String color) {
        this.color = color;
    }
    public void displayCarInfo(){
        System.out.println("Car's Information: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage);
        System.out.println( );
    }
    public void travel(double distance){
        if (distance > 0){
            System.out.println("Distance travel is " + distance);
            mileage += distance;
        }else {
            System.out.println("Can not use negative value");
        }
    }
}
