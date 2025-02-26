print("\nTo-Do List Manager")

task_list = []

while True:

	print("""
1. Add a task
2. View tasks
3. Mark task as Complete
4. Delete a task
5. Exit
""")

	choice = int(input("Enter a number: "))

	match choice:
		case 1:
			
			first_task = input("Enter a task: ")
			task_list.append(first_task)
		case 2:
			for value, num in enumerate(task_list):
				print(value+1, num)
			
		case 3:
			for num in task_list:
				number_check = int(input("Enter a number you want to eliminate: "))
			task_list[num] = "[x]"
						
		