import java.util.Scanner;

class Student {
	// enter number of subjects
	// input through marks array
	// sum of array
	// average of an array
	// percentage of an array
	// grade based on percentage 
	
	Scanner scan = new Scanner(System.in);	
	int n = scan.nextInt();
	int sum = 0;
	public int percentage = 0;
	int[] student = new int[n];
	void arrayInput() {
		System.out.println("Great! you choose " + n + " subjects");

		for (int i = 0; i < student.length; i++) {
			student[i]= scan.nextInt();
			if (student[i] > 100) {
				System.out.println("Please enter less than 100");
				System.exit(0);
			}
		}
	}
	
	void displaymarks() {
		System.out.println("You entered Marks : ");
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
	
	void sumOfMarks() {
		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}
		System.out.println("Sum of marks is " + sum);
	}
	
	void averageOfmarks() {
		double average = 0; 
		average = sum / student.length;
		System.out.print("average of marks is " + average);
	}
	
	void percentageOfmarks() {
		for(int i = 0; i < student.length; i++) {
			percentage = sum / student.length;
		}
		System.out.print("Percentage is " + percentage);
	}
	
	void gradeOfMarks() {
		
		if (percentage >= 90) {
			System.out.println("You got Grade A+");
		}
		else if (percentage < 90 && percentage > 65) {
			System.out.println("You got Grade A");
		}
		else if (percentage < 65 && percentage > 35) {
			System.out.println("You got Grade B");
		}
		else {
			System.out.println("You got Grade C");
		}
	}
	
	void ChoiceForUser() throws InterruptedException {
		do {
			
			System.out.println("** Welcome to the Task2 ***\n\n");
			System.out.println("Enter 1 for get sum Of Marks : ");
			System.out.println("Enter 2 for get avergage Of Marks : ");
			System.out.println("Enter 3 for get percentage Of Marks : ");
			System.out.println("Enter 4 for get Grade : ");
			System.out.println("Enter 5 for display marks : ");
			System.out.println("Enter 6 for Exit");
			System.out.println("Enter your choice : ");
			int choice = scan.nextInt();
				switch (choice) {
				case 1:
					sumOfMarks();
					break;
					
				case 2:
					averageOfmarks();
					break;
				
				case 3:
					percentageOfmarks();
					break;
					
				case 4:
					gradeOfMarks();
					break;
				
				case 5:
					displaymarks();
					break;
					
				case 6:
					System.exit(0);
					break;
					
				default:
					break;
				}
				Thread.sleep(3000);
		} while (true);
		}
	}



public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Enter the number of subjects : ");
		Student falcon = new Student();
		falcon.arrayInput();
		falcon.ChoiceForUser();
	}

}
