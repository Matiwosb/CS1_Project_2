public class Patient {
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String address;
    private String City;
    private String state;
    private String ZipCode;
    private String phoneNumber;
    private String EmergencyName;
    private String EmergencyContact;
    public Patient(String FirstName, String MiddleName, String LastName, String address, String City,
                   String state,String ZipCode, String phoneNumber, String EmergencyName, String EmergencyContact){
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.address=address;
        this.City = City;
        this.state = state;
        this.ZipCode = ZipCode;
        this.phoneNumber=phoneNumber;
        this.EmergencyName=EmergencyName;
        this.EmergencyContact=EmergencyContact;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public void setMiddleName(String MiddleName){
        this.MiddleName=MiddleName;
    }
    public String getMiddleName(){
        return this.MiddleName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setCity(String City){
        this.City=City;
    }
    public String getCity() {
        return this.City;
    }
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
    public String getZipCode() {
        return this.ZipCode;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getState() {
        return this.state;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setEmergencyName(String EmergencyName) {
        this.EmergencyName = EmergencyName;
    }
    public String getEmergencyName() {
        return this.EmergencyName;
    }
    public void setEmergencyContact(String EmergencyContact) {
        this.EmergencyContact = EmergencyContact;
    }
    public String getEmergencyContact() {
        return this.EmergencyContact;
    }
}