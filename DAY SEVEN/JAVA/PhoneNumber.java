import java.util.Scanner;
import java.util.ArrayList;

public class PhoneNumber{


public static void addContact(String firstName, String lastName, String phoneNumber){
contacts.add(firstName);
contacts.add(lastName);
contacts.add(phoneNumber);

System.out.println("contact  added successfully: ");



}

public static void removeContact(String phoneNumber){
for(int index = 0; index < contacts.size(); index += 3){
if(contacts.get(index + 2).equals(phoneNumber)){
	contacts.remove(index + 2);
	contacts.remove(index + 1);
	contacts.remove(index);
	
	System.out.println("contact removed successfully. ");
	return;
}
	}
	System.out.println("contact not found. ");
}

public static void findByPhone(String phoneNumber){
for (int index = 0; index < contacts.size(); index += 3){
if(contacts.get(index + 2).equals(phoneNumber)){

	System.out.println("phone number found:");
	return;

}


	}
	System.out.println("phone number not found: ");
}

public static void findByFirstName(String firstName){
for(int index = 0; index < contacts.size(); index += 3){
	if(contacts.get(index).equals(firstName)){
	
	System.out.println("First Name found :");
	return;
	}

}
	System.out.println("first name not found. ");

}

public static void findByLastName(String lastName){

	for(int index = 0; index < contacts.size(); index +=3){
		if(contacts.get(index + 1).equals(lastName)){

		System.out.println("last name found ");
		return;

		}



	}


		System.out.println("last name not found. ");


}

 public static void editContact(String oldPhone, String newFirst, String newLast, String newPhone) {
        for (int i = 0; i < contacts.size(); i += 3) {
            if (contacts.get(i + 2).equals(oldPhone)) {
                if (!newFirst.isEmpty()) contacts.set(i, newFirst);
                if (!newLast.isEmpty()) contacts.set(i + 1, newLast);
                if (!newPhone.isEmpty()) contacts.set(i + 2, newPhone);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }





public static void main(String [] args){
Scanner input = new Scanner(System.in);

ArrayList<String> contacts = new ArrayList<>();

while(true){

	System.out.println("""
	
	\nPhone Book

	1. Add Contact
	2. Remove Contact
	3. Find by Phone
	4. Find By First Name
	6. Find by Last Name
	7. Exit


	""");

	String choice = input.nextLine();
	switch(choice){
		case "1":
			System.out.print("Enter First Name: ");
			String first = input.nextLine();
			
			System.out.print("Enter second Name: ");
			String second = input.nextLine();
	
			System.out.print("Enter phone number: ");
			String phone = input.nextLine();

			addContact(first, last, phone);
		
			break;

		case "2":
			System.out.print("Enter phone number to remove: ");
	
			removeContact(input.nextLine());
			break;

		case "3":
			System.out.print("Enter phone number: ");
			findByPhone(input.nextLine);
			break;

		case "4":
			System.out.print("Enter first name: ");

			findByFirstName(input.nextLine());
			break;

		case "5":
			System.out.print("Enter last name: ");
			
			findByLastName(input.nextLine());
			break;

		case "6":
			
			 System.out.print("Phone to edit: ");
                    	 String oldPhone = input.nextLine();
                    	 System.out.print("New First Name: ");
                    	 String newFirst = input.nextLine();
                    	 System.out.print("New Last Name: ");
                   	 String newLast = input.nextLine();
                   	 System.out.print("New Phone Number: ");
                   	 String newPhone = input.nextLine();
                  	 editContact(oldPhone, newFirst, newLast, newPhone);
                   	 break;

		case "7":
		
			System.out.println("Exit ");
			return;

		default:
			System.out.println("invalid option");


			}

				}





}


	}
