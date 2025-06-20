
contacts = []

def add_contact(first_name, last_name, phone_number):

	return contacts.append({"first_name": first_name, "last_name": last_name, "phone_number": phone_number})

def remove_contact(phone_number):
	for contact in contacts:
		if contact["phone_number"] == phone_number:
			contacts.remove(contact)
			print("contact removed succefully")
			
		return print("Contact not found.")
	
    
def find_contact_by_phone(phone_number):
	for contact in contacts:
		if contact["phone_number"] == phone_number:
	
			return contact
	return None

def find_contact_by_first_name():
	for contact in contacts:
		if contact["first_name"] == first:
			return first

def find_contact_by_last_name():
	for contact in contacts:
		if contact["last_name"] == last:

			return last

#def edit_contact():




def menu():
	while True:
		print("""\n phone Book
		
		1. Add Contact
		2. Remove Contact
		3. Find contact by Phone
		4. Find contact by First Name
		5. Find contact by Last Name
		6. Edit contact
		7. Exist
			""")
		
		choice = input("choose option:")
	
		if choice == "1":
			first_name = input("Enter your first name: ")
			last_name = input("Enter your last name: ")
			phone = input("Enter phone number: ")
			
			add_contact(first_name, last_name, phone)
			print("contact added successfully ")

		elif choice == "2":
			phone_number = input("Enter the phone number: ")
			remove_contact(phone_number)

		elif choice == "3":
			phone = input("Enter phone number: ")
			result = find_contact_by_phone(phone)
			if result:
				print("phone number found: " result)
			else:
				print("phone number not found. ")
			

		elif choice == "4":
			first_name = input("Enter your first name: ")
			result = find_contact_by_first_name(first_name)
			
			if result:
				print("first name found succefully>>>>" result)
			else:
				print("first name not found ")

		elif choice == "5":
			last_name = input("Enter your last name: ")

			result = find_contact_by_last_name(last_name)
			if result:
				print("last name found succefully>>>>" result)
			else:
				print("last name not found .")
		elif choice == "6":
			edit_contact()
		elif choice == "7":
			print("Exit")
			break
		else:
			print("invalid option")
			




menu()