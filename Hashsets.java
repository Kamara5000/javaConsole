import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashsets{
    static HashSet <String> studentlist = new HashSet <String>();
    static Iterator<String> ite = studentlist.iterator();
    static Scanner userInput = new Scanner(System.in);
    static String name;

    static void addName(){
        System.out.println(" Enter your name");
        name = userInput.nextLine();
        studentlist.add(name);
        System.out.println(studentlist);
        
        String newname = "rhoda";
        while (ite.hasNext()) {
        	if(newname.equals(ite.next()))
        	{
        		System.out.println(ite.next());
        	}
        }
        // System.out.println(studentlist);
        addName();
    }

    public static void main(String[] args) {
    	addName();
    }
}