
public class BuddyInfo {

	String Name;
	String Number;
	String Email;
	
	
	public static void main(String[] args) {
		BuddyInfo Fareed = new BuddyInfo();
		Fareed.setName("Fareed");
		Fareed.setEmail("Fareed@Fareed.com");
		Fareed.setNumber("911");//Call in case of emergency
		
		System.out.println(String.format("Hello %s, Can you still be contacted at:\nEmail:%s\nNumber:%s",Fareed.getName(),Fareed.getEmail(),Fareed.getNumber() ));

	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getNumber() {
		return Number;
	}


	public void setNumber(String number) {
		Number = number;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}

}
