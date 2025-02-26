import datetime

expenses = []

def add_expense(date, description, amount):
    """Add an expense after validating inputs."""
    if not is_valid_date(date):
        raise ValueError("Invalid Date Format! Please use YYYY-MM-DD.")

    if not is_valid_description(description):
        raise ValueError("Invalid description! Only letters allowed.")

    if not is_valid_amount(amount):
        raise ValueError("Invalid amount! Must be a positive number.")

    expense = {"date": date, "description": description, "amount": amount}
    expenses.append(expense)
    return expense

def view_expenses():
    """Return all expenses."""
    if not expenses:
        print("\nNo expenses recorded yet.\n")
    else:
        print("\nExpenses:\n")
        for expense in expenses:
            print(f"Date: {expense['date']}, Description: {expense['description']}, Amount: ₦{expense['amount']}")
    print()

def total_expenses():
    """Calculate the total of all expenses."""
    total = sum(expense["amount"] for expense in expenses)
    print(f"\nTotal Expenses: ₦{total}\n")
    return total

def is_valid_date(date_str):
    """Check if date string is in YYYY-MM-DD format."""
    try:
        datetime.datetime.strptime(date_str, "%Y-%m-%d").date()
        return True
    except ValueError:
        return False

def is_valid_description(description):
    """Check if description contains only letters."""
    return description.isalpha()

def is_valid_amount(amount):
    """Check if amount is a positive number."""
    return isinstance(amount, (int, float)) and amount >= 0

def main():
    """Main loop for user interaction."""
    while True:
        print('''
Welcome to Semicolon Expense Tracker App
----------------------------------------
1. Add an Expense 
2. View all Expenses
3. Calculate Total Expenses
4. Exit
''')
        choice = input("Enter your choice (1-4): ")

        if choice == '1':
            date = input("Enter your date (YYYY-MM-DD): ")
            description = input("Enter your description: ")
            try:
                amount = float(input("Enter your amount: ₦"))
                add_expense(date, description, amount)
                print("Expense added successfully!\n")
            except ValueError as e:
                print(e)

        elif choice == '2':
            view_expenses()

        elif choice == '3':
            total_expenses()

        elif choice == '4':
            print("Have a nice day. Goodbye!")
            break

        else:
            print("This is not a valid input. Please choose a number between 1 and 4.\n")


if __name__ == "__main__":
    main()
