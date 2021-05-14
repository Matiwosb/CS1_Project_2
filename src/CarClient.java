public class CarClient {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche","718 Cayman GTS","Black",86800);
        Car car2 = new Car("Toyota", "Corolla","Red", 19500);
        car1.displayCarInfo();
        car2.displayCarInfo();
        car1.paint("White"); //change th car color
        car2.paint("Gray");
        car1.travel(7500);
        car2.travel(5000);
        car1.setPrice(77000);
        car2.setPrice(15000);
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
