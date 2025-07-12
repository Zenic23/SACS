
package SACS;
import java.util.Scanner;

public class main {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your role: (Admin, Guard, Citizen)");
    String role = sc.nextLine();

    String id = "";
    String adminPassword = "";
    String password = "";

     
    if(role.equals("Admin")){
      System.out.print("Enter you admin password: ");
       adminPassword = sc.nextLine();
      
      

    }
    else if(role.equals("Guard")){
      System.out.print("Enter your ID: ");
       id = sc.nextLine();
      
    }
    else if(role.equals("Citizen")){
      System.out.print("Enter your password: ");
      password = sc.nextLine();
      
    }
    else{
      System.out.println("Invalid role. Please enter a valid role (Admin, Guard, Citizen).");
      return;
    }

    //Object calling
    security sec = new security(id, adminPassword, password, role);
    sec.getAccess();
        sc.close();
   }
}
