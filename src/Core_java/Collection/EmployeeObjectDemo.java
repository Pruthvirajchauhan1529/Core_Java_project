package Core_java.Collection;//import java.util.Comparable;
import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

//class Employee implements Comparable<Employee>{

public class EmployeeObjectDemo{
	public static void main(String[] args) {
		
		Set<Employees> set = new TreeSet<>();
		set.add(new Employees(100, "Bharat"));
		set.add(new Employees(105, "Akash"));
		set.add(new Employees(104, "Prakash"));
		set.add(new Employees(103, "Dhaval"));
		set.add(new Employees(102, "Chintan"));


		for (Employees emp : set) {
			//System.out.println(set);
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}
}