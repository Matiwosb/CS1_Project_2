import java.util.Scanner;

public class PatientProcedureTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName, middleName, lastName, address, city, state,zipCode, phoneNumber, emergencyName,emergencyContact;
       
        System.out.print("Enter your first Name: ");
        firstName = in.nextLine();
        System.out.print("Enter your middle Name: ");
        middleName = in.nextLine();
        System.out.print("Enter your last Name: ");
        lastName = in.nextLine();
        System.out.print("Enter your address: ");
        address = in.nextLine();
        System.out.print("Enter your city: ");
        city = in.nextLine();
        System.out.print("Enter your state: ");
        state = in.nextLine();
        System.out.print("Enter your zip-code: ");
        zipCode = in.nextLine();
        System.out.print("Enter your 10-digit phone number: ");
        phoneNumber = in.nextLine();
        System.out.print("Enter emergency name: ");
        emergencyName = in.nextLine();
        System.out.print("Enter emergency contact number: ");
        emergencyContact = in.nextLine();

        Patient patient = new Patient(firstName,middleName,lastName,address,city,state,zipCode,phoneNumber,emergencyName,emergencyContact);
        Procedure procedure1 = new Procedure("Physical Exam", "4/15/2021","Dr. Irvine",250);
        Procedure procedure2 = new Procedure("X-ray", "4/15/2021","Dr. Jamison",500.00);
        Procedure procedure3 = new Procedure("Blood Test", "4/15/2021","Dr. Smith",200.0);

        System.out.println("First Name: " + patient.getFirstName());
        System.out.println("Middle Name: " + patient.getMiddleName());
        System.out.println("Last Name: " + patient.getLastName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("City: " + patient.getCity());
        System.out.println("Zip-Code: " + patient.getZipCode());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Name: " + patient.getEmergencyName());
        System.out.println("Emergency Contact Number: " + patient.getEmergencyContact());
        System.out.println("Procedure Printout: ");
        System.out.println("____________________");
        System.out.println("Procedure 1: ");
        System.out.println("Procedure Name: "+procedure1.getProcedureName());
        System.out.println("Procedure Date: " +procedure1.getProcedureDate());
        System.out.println("Practitioner Name: "+procedure1.getPractitionerName());
        System.out.println("Charges: $"+procedure1.getCharges());
        System.out.println("");
        System.out.println("Procedure 2: ");
        System.out.println("Procedure Name: "+procedure2.getProcedureName());
        System.out.println("Procedure Date: " +procedure2.getProcedureDate());
        System.out.println("Practitioner Name: "+procedure2.getPractitionerName());
        System.out.println("Charges: $"+procedure2.getCharges());
        System.out.println("");
        System.out.println("Procedure 3: ");
        System.out.println("Procedure Name: "+procedure3.getProcedureName());
        System.out.println("Procedure Date: " +procedure3.getProcedureDate());
        System.out.println("Practitioner Name: "+procedure3.getPractitionerName());
        System.out.println("Charges: $"+procedure3.getCharges());
    }
}
