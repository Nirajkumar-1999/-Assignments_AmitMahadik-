public class StringBuilder1 {

	public static void main(String[] args) {
		

		StringBuilder sbf1 = new StringBuilder("StringBuffer ");
		StringBuffer sbf2 = new StringBuilder("is a peer class of String ");
		StringBuffer sbf3 = new StringBuilder("that provides much of ");
		StringBuffer sbf4= new StringBuilder("the functionality of strings.");
		sbf1.append(sbf2);
	  sbf3.append(sbf4);
		sbf1.append(sbf3);
		System.out.println(sbf1);
	}

}
