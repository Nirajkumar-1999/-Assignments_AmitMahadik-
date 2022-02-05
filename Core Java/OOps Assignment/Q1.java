class SingletonInheritanceCheck{ 
	public static SingletonInheritanceCheck sic = null;
	SingletonInheritanceCheck(){
		System.out.print("Hello.");
	}
	
	public static SingletonInheritanceCheck getInstance() {
		if(sic==null) {
			sic = new SingletonInheritanceCheck();
		}
		return sic;
	}
}

public class Assignment2Q1 {

	public static void main(String[] args) {
		

		
        SingletonInheritanceCheck chk = new SingletonInheritanceCheck();

	}
}
