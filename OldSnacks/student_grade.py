


number_student = int(input("How many students do you have?: "))
number_subject = int(input("How many subjects do they offer?: "))

for student in range(1, number_student + 1):
    print(f"\nEntering scores for Student {student}")
    
    for subject in range(1, number_subject + 1):
       
        while True:
            score = int(input(f"  Enter score for Subject {subject}: "))
            if 0 <= score <= 100:
                break
            else:
                print("  Invalid score. Please enter a number between 0 and 100.")
    
 
"""
score += 1
if score < 0 and score <= 100:
        print("invalid score")
        
total = 0
average = 0

#for number in number_student and number_subject:

def calculating_total():
	total += score

def calculating_average():

	average = total/ number_subject
    
"""