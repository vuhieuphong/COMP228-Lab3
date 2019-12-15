package lab3;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	//private variables
	String name;
	double salary;
	//static list of employees
	static List<Employee> employees=new ArrayList<Employee>();
	//constructor of employee class
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;		
	}
	//methods to get and set name
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//methods to get and set salary
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	//method to turn employee info to a string for display
	@Override
	public String toString()
	{
		return "Name: "+name+"\nSalary: $"+salary;
	}
	//method to print a list of employees in employee list
	public static void printEmployeesListNames()
	{
		int i=1;
		for (Employee employee : employees) {
			System.out.println(i+". "+employee.name);
			i++;
		}
	}

}
