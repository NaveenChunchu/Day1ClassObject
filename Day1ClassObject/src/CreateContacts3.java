
public class CreateContacts3 {

	public static void main(String[] args) {
		
		Contact3 con1 = new Contact3(3,"naveen","navee.12@gmail.com",45637889l);   //ON HEAP
		
		// PRINT DEFAULT VALUES
		System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMailid());
		System.out.println(con1.getMobileNo());
		
		//INTIALIZE THE DATA MEMBERS
		con1.setContactid(3);
		con1.setFirstName("naveen");
		con1.setMailid("naveen234@yahoo.com");
		con1.setMobileNo(9878978945l);
		
//ACCESS THE DATA MEMBERS OR READ THE DATA
		
		System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMailid());
		System.out.println(con1.getMobileNo());
		
		
	}

}
