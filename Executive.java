package lab3;
import java.util.ArrayList;
import java.util.List;

public class Executive extends Manager {
	//private variables
	double yearlyBonus;
	//static list of executives
	static List<Executive> executives=new ArrayList<Executive>();
	//constructor of executive class that extends from the manager class
	public Executive(String name,double salary,String dept,double yearlyBonus) {
		super(name, salary, dept);
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.yearlyBonus=yearlyBonus;
	}
	//methods to get and set yearly bonus
	public double getYearlyBonus()
	{
		return yearlyBonus;
	}
	public void setYearBonus(double yearlyBonus)
	{
		this.yearlyBonus=yearlyBonus;
	}
	//method to turn executive info to a string for display
	public String toString()
	{
		return super.toString()+"\nYearly Bonus: $"+yearlyBonus;
	}
	//method to print a list of executives in managers list
	public static void printExecutivesListNames()
	{
		int i=1;
		for (Executive executive : executives) {
			System.out.println(i+". "+executive.name);
			i++;
		}
	}
}
