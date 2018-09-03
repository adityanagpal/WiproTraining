
public class UserRegistration {
	public static void registerUser(String username, String userCountry) throws InvalidCountryException{
		if(userCountry!="India"){
			throw new InvalidCountryException("User Outside India Cannot be Registered");
		}
		else{
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		try{
			registerUser("Mini", "India");
			registerUser("Mickey", "USA");
		}
		catch(InvalidCountryException e){
			System.out.println(e.getMessage());
		}

	}

}
