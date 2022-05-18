
public class CreateContacts {

	public static void main(String[] args) {
		
		Contact con1 = new Contact();   //ON HEAP
		
		// PRINT DEFAULT VALUES
		System.out.println(con1.Contactid);
		System.out.println(con1.firstName);
		System.out.println(con1.mailid);
		System.out.println(con1.mobileNo);
		
		
		//INTIALIZE THE DATA MEMBERS
		con1.Contactid = 3;
		con1.firstName = "naveen";
		con1.mailid = "naveen234@yahoo.com";
		con1.mobileNo = 9878978945l;
		
        //ACCESS THE DATA MEMBERS OR READ THE DATA
		
		System.out.println(con1.Contactid);
		System.out.println(con1.firstName);
		System.out.println(con1.mailid);
		System.out.println(con1.mobileNo);
		
		
	}

}
