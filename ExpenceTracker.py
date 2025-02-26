expences = []
value_list = []


print("\nWelcome to Semicolon Expense Ttracker App")
print("------------------------------------------")	

print('''1. Add an Expense 
2. View all Expenses
3. Calculate total Expences
4. Exit
''')

while (True):
	choice = int(input("Enter your choice: "))

	if (choice == 1):
		date = int(input("Enter the data(YYY-MM-DD): "))
		description = str(input("Enter the description: "))
		amount = int(input("Enter the amount: "))
		value_list.append(date)
		value_list.append(description)
		value_list.append(amount)
		print("Expence Added!\n")
		print('''1. Add an Expense 
2. View all Expenses
3. Calculate total Expences
4. Exit\n''')
	
	
	elif(choice == 2):
		print("Expences \n")
		for value in value_list:
			print(value)
		print('''1. Add an Expense 
2. View all Expenses
3. Calculate total Expences
4. Exit\n''')
	

	elif(choice == 3):
		print("Total Expences: \n")
		print('''1. Add an Expense 
2. View all Expenses
3. Calculate total Expences
4. Exit\n''')	
	
	elif(choice == 4):
		print("Exiting the app. Goodbye!")
		break;
	
	