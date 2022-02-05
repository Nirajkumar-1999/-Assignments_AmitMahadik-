import java.io.*;
import java.util.*;

class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
  
  
  ///constructor
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
}


//Comparator class will override the compare
// method which will compare the tw0 objects
// passed in the parameter

class MyIdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}


class MyNameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
  
  class MyDepartmentComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getDept().compareTo(e2.getDept());
	}
}

  
  class MySalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary()-e2.getSalary());
	}
}

public class Niraj{
  public static void main(String[] args) {
    
    TreeSet<Employee> SetId = new TreeSet<Employee>(new MyIdComparator());
    
    SetId.add(new Employee(11808638, "Niraj", "Faculty", 1000));
		SetId.add(new Employee(11808592, "Abhishek", "Management", 2000));
		SetId.add(new Employee(11808387, "Avneet", "Faculty", 2500));
    SetId.add(new Employee(11808389, "Mahak", "Finance", 2600));
    
    TreeSet<Employee> SetName= new TreeSet<Employee>(new myNameComparator());
    SetName.add(new Employee(11808638, "Niraj", "Faculty", 1000));
    SetName.add(new Employee(11808592, "Abhishek", "Management", 2000));
    SetName.add(new Employee(11808387, "Avneet", "Faculty", 2500));
    SetName.add(new Employee(11808389, "Mahak", "Finance", 2600));
    
    
    TreeSet<Employee> SetDepartment= new TreeSet<Employee>(new MyDepartmentComparator());
    SetDepartment.add(new Employee(11808638, "Niraj", "Faculty", 1000));
    SetDepartment.add(new Employee(11808592, "Abhishek", "Management", 2000));
    SetDepartment.add(new Employee(11808387, "Avneet", "Faculty", 2500));
    SetDepartment.add(new Employee(11808389, "Mahak", "Finance", 2600));
    
    
    TreeSet<Employee> SetSalary= new TreeSet<Employee>(new MySalaryComparator());
    SetSalary .add(new Employee(11808638, "Niraj", "Faculty", 1000));
    SetSalary .add(new Employee(11808592, "Abhishek", "Management", 2000));
    SetSalary.add(new Employee(11808387, "Avneet", "Faculty", 2500));
    SetSalary.add(new Employee(11808389, "Mahak", "Finance", 2600));
    
    
    
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice: ");
		System.out.println("1 - ID");
		System.out.println("2 - Name");
		System.out.println("3 - Department");
		System.out.println("4 - Salary");
    int p;
		p = sc.nextInt();
    
    
    switch(p) {
		case 1->{
			System.out.println("sorting with respect to employeeid.");
			for(Employee e : SetId) {
				System.out.println(e.getId() +" "+ e.getName()+" "+ e.getDept()+" "+ e.getSalary());
			}
		}
		case 2->{
			System.out.println("Sorting with respect to name");
			for(Employee e : SetName) {
				System.out.println(e.getId()+" "+ e.getName()+" "+ e.getDepartment()+" "+e.getSalary());
			}
		}
		case 3->{
			System.out.println("Sorting with respect to Department");
			for(Employee e : SetDepartment) {
				System.out.println(e.getId()+" "+ e.getName()+" "+ e.getDepartment()+" "+e.getSalary());
			}
		}
		case 4->{
			System.out.println("sorting with respect to Salary");
			for(Employee e : SetSalary) {
				System.out.println(e.getId() +" "+ e.getName()+" "+ e.getDepartment()+" "+ e.getSalary());
			}
		}
		default->{
			System.out.println("Invalid");
		}
		}
	}

}
    
  
 
