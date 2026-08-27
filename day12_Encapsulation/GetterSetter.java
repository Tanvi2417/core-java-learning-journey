package day12_Encapsulation;


class User {

	private String username;
	private String email;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}

public class GetterSetter {

	public static void main(String[] args) {

		User user = new User();

		user.setUsername("Tanvi");
		user.setEmail("tanvi@gmail.com");

		System.out.println("Username: " + user.getUsername());
		System.out.println("Email   : " + user.getEmail());
	}
}
