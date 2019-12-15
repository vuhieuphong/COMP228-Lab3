package lab3;
import java.util.Scanner;

public class EmployeeTest {	
	//static method to display user menu
	private static void displayMenu() {
		System.out.println("MENU:");
		System.out.println("C: Create new staff ");
		System.out.println("R: Read staff information ");
		System.out.println("U: Update staff information ");
		System.out.println("D: Delete a staff ");
		System.out.println("Any Other keys: Exit");
	}
	//static method to ask for staff position
	private static int askStaffPosition(Scanner input) {
		System.out.println("1.Employee");
		System.out.println("2.Manager");
		System.out.println("3.Executive");
		System.out.print("Choose a position: ");
		int position=input.nextInt();
		return position;
	}
	//static method to ask for name
	private static String askName(Scanner input)
	{
		input=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=input.next();
		return name;
	}
	//static method to ask for salary
	private static double askSalary(Scanner input)
	{
		input=new Scanner(System.in);
		System.out.print("Enter salary: ");
		while(!input.hasNextInt())
		{
			input=new Scanner(System.in);
            System.out.print("Not valid! Enter another salary: ");
		}
		double salary=input.nextDouble();
		return salary;
	}
	//static method to ask for department
	private static String askDept(Scanner input)
	{
		input=new Scanner(System.in);
		System.out.print("Enter department: ");
		String dept=input.next();		
		return dept;
	}
	//static method to ask for yearly bonus
	private static double askYearlyBonus(Scanner input)
	{
		input=new Scanner(System.in);
		System.out.print("Enter yearly bonus: ");
		while(!input.hasNextInt())
		{
			input=new Scanner(System.in);
            System.out.print("Not valid! Enter another yearly bonus: ");
		}		
		double yearlyBonus=input.nextDouble();
		return yearlyBonus;
	}
	
	//static method to add a new staff
	private static void createStaff(Scanner input) {
		int position=askStaffPosition(input);
		if(position==1){
			String name=askName(input);
			double salary=askSalary(input);
			Employee newEmployee=new Employee(name, salary);
			Employee.employees.add(newEmployee);
			System.out.println("\n===============");
			System.out.println(newEmployee.toString());			
			System.out.println("===============\n");
		}
		else if (position==2) {
			String name=askName(input);
			double salary=askSalary(input);			
			String dept=askDept(input);
			Manager newManager=new Manager(name, salary, dept);
			Manager.managers.add(newManager);
			System.out.println("\n===============");
			System.out.println(newManager.toString());
			System.out.println("===============\n");
		}
		else if(position==3){
			String name=askName(input);
			double salary=askSalary(input);			
			String dept=askDept(input);
			double yearlyBonus=askYearlyBonus(input);
			Executive newExecutive=new Executive(name, salary, dept, yearlyBonus);
			Executive.executives.add(newExecutive);
			System.out.println("\n===============");
			System.out.println(newExecutive.toString());
			System.out.println("===============\n");
		}	
		else {
			System.out.println("\nInvalid staff choice!\n");
		}
	}
	
	//static method to ask user with staff they want to choose in a list of staffs
	private static int askStaffNumber(Scanner input)
	{
		System.out.print("Choose a staff number: ");
		int staffNo=input.nextInt();
		return staffNo;
	}
	
	//static method to view staff information
	private static void viewStaffInfo(Scanner input)
	{
		int position=askStaffPosition(input);
		if(position==1)
		{
			if(Employee.employees.size()==0)
			{
				System.out.println("\nNo employee records found!\n");
			}
			else {
				Employee.printEmployeesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Employee.employees.size())
				{
					System.out.println("\nInvalid employee number!\n");
				}
				else {
					System.out.println("\n===============");
					System.out.println(Employee.employees.get(staffNo-1).toString());
					System.out.println("===============\n");
				}				
			}			
		}
		else if(position==2)
		{
			if(Manager.managers.size()==0)
			{
				System.out.println("\nNo manager records found!\n");
			}
			else {
				Manager.printManagerListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Manager.managers.size())
				{
					System.out.println("\nInvalid manager number!\n");
				}
				else {
					System.out.println("\n===============");
					System.out.println(Manager.managers.get(staffNo-1).toString());
					System.out.println("===============\n");
				}			
			}			
		}
		else if(position==3)
		{
			if(Executive.executives.size()==0)
			{
				System.out.println("\nNo executive records found!\n");
			}
			else {
				Executive.printExecutivesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Executive.executives.size())
				{
					System.out.println("\nInvalid executive number!\n");
				}
				else {
					System.out.println("\n===============");
					System.out.println(Executive.executives.get(staffNo-1).toString());
					System.out.println("===============\n");
				}	
			}						
		}
		else {
			System.out.println("\nInvalid staff choice!\n");
		}
	}
	
	//static method to edit staff information
	private static void updateStaffInfo(Scanner input)
	{
		int position=askStaffPosition(input);
		if(position==1)
		{
			if(Employee.employees.size()==0)
			{
				System.out.println("\nNo employee records found!\n");
			}
			else {
				Employee.printEmployeesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Employee.employees.size())
				{
					System.out.println("\nInvalid employee number!\n");
				}
				else {
					String name=askName(input);
					double salary=askSalary(input);
					Employee.employees.get(staffNo-1).setName(name);
					Employee.employees.get(staffNo-1).setSalary(salary);
					System.out.println("\n===============");
					System.out.println(Employee.employees.get(staffNo-1).toString());
					System.out.println("===============\n");
				}				
			}			
		}
		else if(position==2)
		{
			if(Manager.managers.size()==0)
			{
				System.out.println("\nNo manager records found!\n");
			}
			else {
				Manager.printManagerListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Employee.employees.size())
				{
					System.out.println("\nInvalid manager number!\n");
				}
				else {
					String name=askName(input);
					double salary=askSalary(input);
					String dept=askDept(input);
					Manager.managers.get(staffNo-1).setName(name);
					Manager.managers.get(staffNo-1).setSalary(salary);
					Manager.managers.get(staffNo-1).setDept(dept);
					System.out.println("\n===============");
					System.out.println(Manager.managers.get(staffNo-1).toString());
					System.out.println("===============\n");
				}				
			}			
		}
		else if(position==3)
		{
			if(Executive.executives.size()==0)
			{
				System.out.println("\nNo executive records found!\n");
			}
			else {
				Executive.printExecutivesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Executive.executives.size())
				{
					System.out.println("\nInvalid executive number!\n");
				}
				else {
					String name=askName(input);
					double salary=askSalary(input);
					String dept=askDept(input);
					double yearlyBonus=askYearlyBonus(input);
					Executive.executives.get(staffNo-1).setName(name);
					Executive.executives.get(staffNo-1).setSalary(salary);
					Executive.executives.get(staffNo-1).setDept(dept);
					Executive.executives.get(staffNo-1).setYearBonus(yearlyBonus);
					System.out.println("\n===============");
					System.out.println(Executive.executives.get(staffNo-1).toString());
					System.out.println("===============\n");
				}				
			}			
		}
		else{
			System.out.println("\nInvalid staff choice!\n");	
		}
	}
	//static method to delete a staff
	private static void deleteStaff(Scanner input)
	{
		int position=askStaffPosition(input);
		if(position==1)
		{
			if(Employee.employees.size()==0)
			{
				System.out.println("\nNo employee records found!\n");
			}
			else {
				Employee.printEmployeesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Employee.employees.size())
				{
					System.out.println("\nInvalid employee number!\n");
				}
				else {
					System.out.println("\nEmployee "+Employee.employees.get(staffNo-1).name
							+" was deleted!\n");
					Employee.employees.remove(staffNo-1);
				}
			}
		}
		else if(position==2)
		{
			if(Manager.managers.size()==0)
			{
				System.out.println("\nNo manager records found!\n");
			}
			else {
				Manager.printManagerListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Manager.managers.size())
				{
					System.out.println("\nInvalid manager number!\n");
				}
				else {
					System.out.println("\nManager "+Manager.managers.get(staffNo-1).name
							+" was deleted!\n");
					Manager.managers.remove(staffNo-1);
				}
			}
		}
		else if (position==3) 
		{
			if(Executive.executives.size()==0)
			{
				System.out.println("\nNo executive records found!\n");
			}
			else {
				Executive.printExecutivesListNames();
				int staffNo=askStaffNumber(input);
				if(staffNo<0||staffNo>Executive.executives.size())
				{
					System.out.println("\nInvalid executive number!\n");
				}
				else {
					System.out.println("\nExecutive "+Executive.executives.get(staffNo-1).name
							+" was deleted!\n");
					Executive.executives.remove(staffNo-1);
				}
			}
		}
		else{
			System.out.println("\nInvalid staff choice!\n");	
		}
	}
	
	public static void main(String[] args) {
		System.out.println("===Welcome to Staff CRUD System===\n");
		//ask user menu option
		while(true){
			displayMenu();
			Scanner input=new Scanner(System.in);
			System.out.print("Which menu choice would you like to choose: ");
			String choice=input.next();
			if(choice.toUpperCase().equals("C"))
			{
				createStaff(input);	
			}
			else if (choice.toUpperCase().equals("R")) 
			{
				viewStaffInfo(input);				
			}
			else if(choice.toUpperCase().equals("U"))
			{
				updateStaffInfo(input);
			}
			else if(choice.toUpperCase().equals("D"))
			{
				deleteStaff(input);
			}
			else 
			{
				System.out.println("Goodbye!");
				input.close();
				break;
			}
		}			
	}	
}
