
public class KidUsers implements LibraryUser{
	int age;
	String bookType;
	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		this.age=age;
		if(age<12){
			System.out.println("You have successfully registered under a Kids Account");
		}
		else{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook(String book) {
		// TODO Auto-generated method stub
		this.bookType=book;
		if(bookType=="Kids"){
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
