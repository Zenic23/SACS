package SACS;

public class security {
    private String id;
    private String adminPassword;
    private String password;
    public String role;
    
    public security(String id, String adminPassword, String password, String role) { 
        this.id = id;
        this.password = password;
        this.adminPassword = adminPassword;
        this.role = role;
    }
    private boolean checkPasswordforAdmin(String adminPassword){
        return this.adminPassword.equals("paradox2021");
    }
    private boolean checkIdforGuards(String id){
        return this.id.equals("2019-0001");
    }
    private boolean checkPasswordforcitizen(String password){
        return this.password.equals("citizen450");
    }
    
    public void getAccess() {
        switch(role){
            case "Admin":
                if(checkPasswordforAdmin(this.adminPassword)){
                    user role1 = new Admin(role);
                    role1.displayInfo();
                }
                else{
                    System.out.println("Access denied for Admin. Incorrect password.");
                }
                break;
            case "Guard":
                 if(checkIdforGuards(this.id)){
                    user role2 = new guard(role);
                    role2.displayInfo();
                 }
                 else{
                     System.out.println("Access denied for Guard. Incorrect ID.");
                 }
                 break;
            case "Citizen":
                 if(checkPasswordforcitizen(this.password)){
                    user role3 = new citizen(role);
                    role3.displayInfo();
                 }
                 else{
                     System.out.println("Access denied for Citizen. Incorrect password.");
                 }
                 break;
            default:
                System.out.println("Invalid role. Please enter a valid role (Admin, Guard, Citizen).");
                break;
                         
                

        }
        
        

    }
    
}

