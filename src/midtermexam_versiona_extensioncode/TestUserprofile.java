package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class TestUserprofile {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your User ID");
        String id = input.nextLine();
        System.out.print("\nEnter your favorite genre Comedy, Drama, Action, Mystery");
        String genre = input.nextLine();
        UserProfile profile = new UserProfile(id, genre);
        System.out.println("User profile created ");
    }
    
}
