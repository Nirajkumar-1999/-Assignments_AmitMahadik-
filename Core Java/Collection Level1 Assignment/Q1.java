import java.util.Comparator;
import java.util.TreeMap;
enum gender{male, female}

class Contact{
	public long phoneNo;
	public String name;
	public String email;
	gender g;
	public Contact(String name, String email, gender g) {
		this.name = name;
		this.email = email;
		this.g = g;
	}
}
class Compare implements Comparator<Contact>{
	public int compare(Contact c1, Contact c2) {
		return 0;
	}
}
	
public class CollectionQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Long, Contact> tm = new TreeMap<Long, Contact>();
		Contact c1 = new Contact("Jasmine", "jj@gmail.com", gender.female); 
		tm.put(7654387654, c1);
		tm.put(876543218l, new Contact("Alok", "alok@gmail.com", gender.female));
		tm.put(765789477l, new Contact("Niraj", "Niraj@gmail.com", gender.male));
		tm.put(654387636l, new Contact("Mahak", "mahak@gmail.com", gender.female));
		tm.put(5565634325l, new Contact("Abhishek", "abhishek@gmail.com", gender.male));
		tm.put(890444744l, new Contact("Suraj", "suraj@gmail.com", gender.male));
		tm.put(3333333333l, new Contact("Chamanlal", "chamanlal@gmail.com", gender.female));
		tm.put(2943874522l, new Contact("Rishav", "rishav@gmail.com", gender.female));
		tm.put(18964312l, new Contact("Ajay", "ajay@gmail.com", gender.male));
		tm.put(1114532911l, new Contact("Ravish", "ravish@gmail.com", gender.male));
		
		System.out.println("Keys:");
		System.out.println(tm.keySet());
		System.out.println("Values:");
		System.out.println(tm.values());
		System.out.println("Pair:");
		System.out.println(tm);
	}
}
