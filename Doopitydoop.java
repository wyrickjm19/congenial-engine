package myPackage;
import java.util.Scanner;
public class Doopitydoop {
    
    public void main() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = console.nextLine();
        String reversedName = "";
        for(int i = 0; i < name.length(); i++) {
           reversedName = name.charAt(i) + reversedName;
        }
        System.out.println(reversedName);
    }
    
}
