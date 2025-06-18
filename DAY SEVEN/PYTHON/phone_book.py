
contacts = []

def add_contact(first_name, last_name, phone_number):

	return contacts.append({"first_name": first, "last_name": last, "phone_number": phone})

def remove_contact():
	for contact in contacts:
		if contact["phone_number"] != phone:
			return None

def find_contact_by_phone():
	for contact in contacts:
		if contact["phone_number"] == phone:
	
			return phone

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
			
			print("contact added successfully ")
			add_contact()
		elif choice == "2":
			 remove_contact()
		elif choice == "3":
			find_contact_by_phone()
		elif choice == "4":
			find_contact_by_first_name()
		elif choice == "5":
			find_contact_by_last_name()
		elif choice == "6":
			edit_contact()
		elif choice == "7":
			print("Exit")
			break
		else:
			print("invalid option")
			




menu()