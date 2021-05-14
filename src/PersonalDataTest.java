import javax.swing.*;

public class PersonalDataTest {
    public static void main(String[] args) {
        String Name;
        Name = JOptionPane.showInputDialog("Please Enter your name: ");
        String Address;
        Address = JOptionPane.showInputDialog("Please enter your full address?: ");
        String Age;
        Age = JOptionPane.showInputDialog("Please enter your age: ");
        String PhoneNumber;
        PhoneNumber = JOptionPane.showInputDialog("Please enter your 10-digit phone number: ");

        PersonalData yourName = new PersonalData(Name,Address,Age,PhoneNumber);
        yourName.setName(Name);
        yourName.setAddress(Address);
        yourName.setAge(Age);
        yourName.setPhoneNumber(PhoneNumber);
        System.out.println("Your Info: ");
        System.out.println("Your name is " + yourName.getName());
        System.out.println("Your address is " + yourName.getAddress());
        System.out.println("Your age is " + yourName.getAge());
        System.out.println("Your phone number is " + yourName.getPhoneNumber());

        System.out.println("Your family Info: ");
        Name = JOptionPane.showInputDialog("Please enter one of your family name? ");
        Address =JOptionPane.showInputDialog("please enter your family full address? ");
        Age = JOptionPane.showInputDialog("Please enter your family age? ");
        PhoneNumber = JOptionPane.showInputDialog("Please enter your family phone number? ");

        PersonalData familyName = new PersonalData(Name,Address,Age,PhoneNumber);
        familyName.setName(Name);
        familyName.setAddress(Address);
        familyName.setAge(Age);
        familyName.setPhoneNumber(PhoneNumber);
        System.out.println("One of your family name is " + familyName.getName());
        System.out.println("There address is " + familyName.getAddress());
        System.out.println("There age is " + familyName.getAge());
        System.out.println("There phone number is " + familyName.getPhoneNumber());

        System.out.println("Your friend Info: ");
        Name = JOptionPane.showInputDialog("Please enter one of your friend name? ");
        Address =JOptionPane.showInputDialog("Please enter your friend full address? ");
        Age = JOptionPane.showInputDialog("Please enter your friend age? ");
        PhoneNumber = JOptionPane.showInputDialog("Please enter your friend phone number? ");

        PersonalData friendName = new PersonalData(Name,Address,Age,PhoneNumber);
        friendName.setName(Name);
        friendName.setAddress(Address);
        friendName.setAge(Age);
        yourName.setPhoneNumber(PhoneNumber);
        System.out.println("Your friend name is " + friendName.getName());
        System.out.println("There address is " + friendName.getAddress());
        System.out.println("There age is " + friendName.getAge());
        System.out.println("There phone number is " + friendName.getPhoneNumber());

    }
}
