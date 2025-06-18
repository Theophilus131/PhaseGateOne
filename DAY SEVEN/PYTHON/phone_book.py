
contacts = []

def add_contact(first_name, last_name, phone_number):

	contacts.append({first_name, last_name, phone_number})




def menu():
	while True:
		print("""\n phone Book
		
		1. Add Contact
		2. Remove Contact
		3. Find by Phone
		4. Find by First Name
		5. Find by Last Name
		6. Edit contact
		7. Exist
			""")
		
		choice = input("choose option:")
	
		if choice == "1":
			add_contact()
		elif choice == "2":
			remove




menu()