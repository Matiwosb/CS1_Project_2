public class PersonalData {
    private String name;
    private String address;
    private String age;
    private String phoneNumber;

    public PersonalData(String name, String address, String age,String phoneNumber){
        this.name=name;
        this.address=address;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return this.age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
