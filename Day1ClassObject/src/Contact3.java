
public class Contact3 {
	
   private int Contactid;
   private String firstName;
   private	String mailid;
   private long mobileNo;
   
   
   
   
public Contact3() {
	super();
}
public Contact3(int contactid, String firstName, String mailid, long mobileNo) {
	super();
	Contactid = contactid;
	this.firstName = firstName;
	this.mailid = mailid;
	this.mobileNo = mobileNo;
}
public int getContactid() {
	return Contactid;
}
public void setContactid(int contactid) {
	Contactid = contactid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
   
   
   
	
}
