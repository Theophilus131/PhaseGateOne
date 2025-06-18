
contacts = []

def add_contact(first_name, last_name, phone_number):

	contacts.append({first_name, last_name, phone_number})
"""
def remove_contact():

def find_contact_by_phone():

def find_contact_by_first_name():

def find_contact_by_last_name():

def edit_contact():
"""



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