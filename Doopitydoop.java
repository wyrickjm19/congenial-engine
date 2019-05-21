package packag;
import java.util.scanner;
public class Doopitydoop {

    //added static and put in a parameter
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.out);
        System.out.println("Enter your name");
        String name = in.nextLine();
        String eman = "";
	//changed to "i--" and "i >= 0"
        for(int i = name.length() - 1; i >= 0; i--) {
	   //switched eman and name
           eman += name.charAt(i);
        }
        System.out.println(eman);        
    }
    
}
