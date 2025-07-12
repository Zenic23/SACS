package SACS;

public class citizen extends user {
    public citizen(String role){
        super(role);
    }
    @Override
    public void displayInfo() {
        System.out.println("Citizen role: " + role);
    }
    
}
