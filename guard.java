package SACS;

public class guard  extends user {

    public guard(String role) {
        super(role);
    }

    @Override
    public void displayInfo() {
        System.out.println("Guard role: " + role );
    }
    
}
