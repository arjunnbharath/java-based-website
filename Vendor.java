package project;

public class Vendor {

	private String name;
    private String password;
    private String email;

    // Constructor
    public Vendor(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
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

