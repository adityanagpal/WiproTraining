
public class LibraryIntefaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers kid= new KidUsers();
		kid.registerAccount(10);
		kid.registerAccount(18);
		kid.requestBook("Kids");
		kid.requestBook("Fiction");
		AdultUser adult= new AdultUser();
		adult.registerAccount(5);
		adult.registerAccount(23);
		adult.requestBook("Kids");
		adult.requestBook("Ficiton");

	}

}
