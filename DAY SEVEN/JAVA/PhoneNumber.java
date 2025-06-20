import java.util.Scanner;
import java. ArrayList;

public class PhoneNumber{


public static void addContact(){}

public static void removeContact(){}

public static void findByPhone(){}

public static void findByFirstName(){}

public static void findByLastName(){}

public static void editContact(){}






public static void main(String [] args){
Scanner input = new Scanner(System.in);
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
