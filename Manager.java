package lab3;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	//private variables
	String dept;
	//static list of managers
	static List<Manager> managers=new ArrayList<Manager>();
	//constructor of manager class that extends from employee class
	public Manager(String name,double salary,String dept) {
		super(name,salary);
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	//methods to get and set department
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	//method to turn manager info to a string for display
	@Override
	public String toString()
	{
		return super.toString()+"\nDept: "+dept;
	}
	//method to print a list of managers in managers list
	public static void printManagerListNames()
	{
		int i=1;
		for (Manager manager : managers) {
			System.out.println(i+". "+manager.name);
			i++;
		}
	}
}
