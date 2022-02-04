import java.util.ArrayList;

class Manager extends Assignment2Q2 {
	Manager(){
		super();
	}
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        salary = salary + incentive;
        return salary;
    }
}

class Labour extends Assignment2Q2 {
	Labour(){
		super();
	}
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        salary = salary + overtime;
        return salary;
    }
}
public class Assignment2Q2 {

	static int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int count = 0;
    	for(int i: employeeSalaries) {
    		System.out.println(i);
    		count = count + i;
    	}
    	System.out.println("Total salary: "+ count);
    	return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q2 m = new Manager();
		Assignment2Q2 l = new Labour();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(m.getSalary(salary));
		a.add(l.getSalary(salary));
		totalEmployeesSalary(a);
	}

}
