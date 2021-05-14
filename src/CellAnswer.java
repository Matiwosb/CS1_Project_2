import java.util.Scanner;

public class CellAnswer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the manufacturer: ");
        String manufactureTest = in.nextLine();
        System.out.print("Enter the model number: ");
        String modelTest = in.nextLine();
        System.out.print("Enter the retail price: ");
        double retailPriceTest = in.nextDouble();

        CellPhone cell = new CellPhone(manufactureTest, modelTest,retailPriceTest);

        cell.setManufacture(manufactureTest);
        cell.setModel(modelTest);
        cell.setRetailPrice(retailPriceTest);

        System.out.println("Here is the data that you provided: ");
        System.out.println("Manufacturer: " + cell.getManufacture());
        System.out.println("Model: " + cell.getModel());
        System.out.println("Retail price: " + cell.getRetailPrice());
    }
}
