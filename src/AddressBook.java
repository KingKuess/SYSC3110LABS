import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	
	public List<BuddyInfo> getBuddies() {
		return buddies;
	}

	public void setBuddies(List<BuddyInfo> buddies) {
		this.buddies = buddies;
	}
	
	public void addBuddy(BuddyInfo newBuddy)
	{
		if (newBuddy != null)
		{
			buddies.add(newBuddy);
		}
	}
	public void removeBuddy(int index)
	{
		if(index >= 0 && index < buddies.size())
		{
			buddies.remove(index);  
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo kyle = new BuddyInfo();
		AddressBook book = new AddressBook();
		
		book.addBuddy(kyle);
		book.removeBuddy(0);
		
	}
}
