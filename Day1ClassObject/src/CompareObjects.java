
public class CompareObjects {

	public static void main(String[] args) {
		// COMPARE A CONTACT WITH A CONTACT
		
		Contact con1= new Contact();
		Contact con2= new Contact();
		
		boolean result= (con1 == con2); // == used to checking object references in memory
		System.out.println(result);
		
		result = (con1.hashCode() == con2.hashCode());
		System.out.println(result);
		
		Contact con3= con1; // assign reference of con3 to con1
		result = (con1 == con3);
		System.out.println(result);
		
		result = (con3.hashCode() == con1.hashCode());
		System.out.println(result);
		
		
		

	}

}
