package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile object1 = new Mobile();
         	   object1.sendMessage();
		       object1.makeCall();
	           object1.saveContact();
	}
	

	public void sendMessage() {
		System.out.println("HELLO");
	}
	private void makeCall() {
		System.out.println("MAKE CALL");
	}
	public void saveContact() {
		System.out.println("CONTACT SAVED");
	}
	}