
package Author;
import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        verifyGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }
    public void setEmail(String e){
        this.email = e;
    }
    
    public void verifyGender(char g){
        if(g != 'f' && g != 'm'){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Gender invalid, enter a valid gender: ");
            verifyGender(scanner.next().charAt(0));
        }
        else this.gender = g;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nGender: " + this.gender;
    }
    
}
