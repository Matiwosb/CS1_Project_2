public class CellPhone {
    private String manufacture;
    private String model;
    private double retailPrice;

    public CellPhone(){

    }
    public CellPhone(String manufacture, String model, double retailPrice) {
        this.manufacture = manufacture;
        this.model = model;
        this.retailPrice = retailPrice;
    }
    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }
    public String getManufacture(){
        return this.manufacture;
    }
    public String getModel(){
        return this.model;
    }
    public double getRetailPrice(){
        return this.retailPrice;
    }
}
