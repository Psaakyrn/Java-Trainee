import java.util.*;

public class EnterDetails {
	
	int studentCount = 0;
	String regNo[];
	String name[];
	String debt[];
	//String result[];//replace later
	int result1[];
	int result2[];
	int result3[];
	Scanner textInput = new Scanner(System.in);
	
	void enterStudentCount() {
		
		System.out.print("Enter the no of students: ");
		studentCount = textInput.nextInt();
		
		if(studentCount > 0 ) {
			//create array of student details
			regNo = new String[studentCount];
			name = new String[studentCount];
			debt = new String[studentCount];
			//result = new String[studentCount];
			result1 = new int[studentCount];
			result2 = new int[studentCount];
			result3 = new int[studentCount];
			
		}
	}
	int getTotal(int studNum) {
		return result1[studNum]+result2[studNum]+result3[studNum];
	}
	
	String getGrade(int studNum) {
		String grade = "N.A.";
		float average = ((float)getTotal(studNum))/3;
		if(average >= 75) {
			grade = "A";
		}else if (average >= 65) {
			grade = "B";
		}else if (average >= 55) {
			grade = "C";
		}else if (average >= 45) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		return grade;
	}
	int getStudentCount() {
		return studentCount;
		
	}
	void enterInfo(int studNum) {
		if(studNum < 0 | studNum >= studentCount) {
			System.out.print("\nInvalid Student Count ");
			return;
		}
		System.out.print("\nstudent regNo: ");
		regNo[studNum] = textInput.next();
		System.out.print("name: ");
		name[studNum] = textInput.next();
		System.out.print("debt: ");
		debt[studNum] = textInput.next();
		System.out.print("result 1: ");
		result1[studNum] = textInput.nextInt();
		System.out.print("result 2: ");
		result2[studNum] = textInput.nextInt();
		System.out.print("result 3: ");
		result3[studNum] = textInput.nextInt();
	}
	
	void displayInfo(int studNum) {
		if(studNum < 0 | studNum >= studentCount) {
			System.out.print("\nInvalid Student Count ");
			return;
		}
		
		System.out.println("\nstudent regNo: "+regNo[studNum]);
		System.out.println("name: "+name[studNum]);
		System.out.println("debt: "+debt[studNum]);
		System.out.println("result 1: "+result1[studNum]+"\tresult 2: "+result2[studNum]+"\tresult 3: "+result3[studNum]);				
		System.out.println("total: "+getTotal(studNum)+"\tgrade: "+getGrade(studNum));				
	}
	
	public static void main(String[] args) {
		boolean getDetails = true;
		Scanner sc = new Scanner(System.in);
		
		EnterDetails obj = new EnterDetails();
		
		do{
			obj.enterStudentCount();
			if(obj.getStudentCount() > 0 ) {
				
				System.out.println("Pls enter the details for "+obj.getStudentCount()+" students:");
				for(int i=0;i<obj.getStudentCount();i++) {
					System.out.println("Student "+i+" Data:");
					obj.enterInfo(i);
				}
				System.out.println();
				System.out.println("=============");
				System.out.println("Given Details");
				System.out.println("=============");
				for(int i=0;i<obj.studentCount;i++) {
					obj.displayInfo(i);;				
				}
			}
			
			System.out.print("\nDo you wish to continue: ");
			String isContinue = sc.next();
			if(isContinue.equals("y") || isContinue.equals("Y") || isContinue.equals("yes") || isContinue.equals("Yes"))
			{
				getDetails = true;
				System.out.println();
			}
			else {
				getDetails = false;
			}
		} while(getDetails);
		
		sc.close();
	}
}
