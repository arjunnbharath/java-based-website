package project;
public class Customer {
    private String name;
    private String password;
    private String email;
    private String email2;

    // Constructor
    public Customer(String name, String password, String email, String email2) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.email2=email2;
    }

    public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	// Getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    public boolean authenticate(String enteredEmail, String enteredPassword) {
        return email.equals(enteredEmail) && password.equals(enteredPassword);
    }

}
