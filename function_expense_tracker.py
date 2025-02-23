import datetime

expences = []

def add_expences():
	
	while True:
		date = input("Enter your date (YYYY-MM-DD): ")
		try:
			datetime.datetime.strptime(date, "%Y-%m-%d").date()
			break
		except ValueError:
			print("Invalid Date Format! Please use YYYY-MM-DD.")
			

	while True:
		try:
			description = str(input("Enter your description: "))
			if not description.isalpha():
				print("Invalid Entry!")
			else:
				break
		except ValueError:
			print("I said Invalid Entry!")
					


	
	while True:
		try:
			amount = float(input("Enter your amount:  ₦"))
			if amount < 0:
				print("Invalid Entry!")
			else:
				break
		except ValueError:
			print("Invalid Entry!")
			
	
	
	
	expense = {"date": date, "description": description, "amount": amount}
	expences.append(expense)	


def view_expenses():
	print("Expenses:\n")
	for expence in expences:
	        print(f"Date: {expence['date']}, Description: {expence['description']}, Amount: {expence['amount']}")	

	

def total_expenses():
	total = sum(expence['amount'] for expence in expences)
	print(f"\nTotal Expenses:  ₦{total}")



is_operating = True

while is_operating:
	print('''
Welcome to Semicolon Expense Tracker App
----------------------------------------
1. Add an Expense 
2. View all Expenses
3. Calculate total Expences
4. Exit\n
''')
	choice = input("Enter your choice (1-4): ")

	if (choice == '1'):
		add_expences()
	elif (choice == '2'):
		view_expenses()
	elif (choice == '3'):
		total_expenses()
	elif (choice == '4'):
		is_operating = False
	else:
		print("This is not a valid input")

print("Have a nice day. Goodbye!")


