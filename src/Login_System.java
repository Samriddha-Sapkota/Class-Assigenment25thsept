import java.util.Scanner;

public class Login_System {
    public static void main(String[] args) {
        String Username, Password, Input_username, Input_password;
        Username = "Samriddha_24067";
        Password = "1234@Samriddha";

        Scanner sn = new Scanner(System.in);
        for(int i = 5; i >= 0; i--) {

            System.out.println("Enter the username. ");
            Input_username = sn.next();

            System.out.println("Enter the password. ");
            Input_password = sn.next();

            if (Input_username.equals(Username) && Input_password.equals(Password)) {
                System.out.println("Successfully Logged In!");
                break;
            } else {
                System.out.println("Incorrect Username or Password.");
                System.out.println("You have " + i + " tries left");
            }
        }
    }
}