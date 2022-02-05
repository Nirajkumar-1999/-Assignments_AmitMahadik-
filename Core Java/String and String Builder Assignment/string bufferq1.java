public class StringBuffer1 {

	public static void main(String[] args) {
		

		StringBuffer sbf1 = new StringBuffer("StringBuffer ");
		StringBuffer sbf2 = new StringBuffer("is a peer class of String ");
		StringBuffer sbf3 = new StringBuffer("that provides much of ");
		StringBuffer sbf4= new StringBuffer("the functionality of strings.");
		sbf1.append(sbf2);
	        sbf3.append(sbf4);
		sbf1.append(sbf3);
		System.out.println(sbf1);
	}

}
