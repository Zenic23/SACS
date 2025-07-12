package SACS;

public class Admin extends user {
    
    public Admin(String role) {
        super(role);
    }
    @Override
    public void displayInfo() {
        System.out.println("Admin role: " + role);
        
    }
}
