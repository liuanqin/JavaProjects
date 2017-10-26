package emailApp;

public class EmaillApp {
	public static void main(String[] args){
		Email em1 = new Email("Anqing", "Liu");
		
		em1.changePassword("newpass");
		em1.setAlternateEmail("newemail@nd.edu");
		em1.setMailboxCapacity(900);

		System.out.println(em1.showInfo());
	}
}
