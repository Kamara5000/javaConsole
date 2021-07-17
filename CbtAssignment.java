import java.util.Scanner;
import java.util.ArrayList;

public class CbtAssignment {

    Scanner studentInput = new Scanner(System.in);
    int studNum;
    ArrayList <String> studentDetails = new ArrayList<String>();

    public CbtAssignment() {
     
        registration();
    }

    public void registration(){
        System.out.println("WELCOME TO JAVA101 TEST");  
        System.out.print("Enter number of Students: ");
        studNum = studentInput.nextInt();
        System.out.println("Thank you. you can only register"+" "+studNum+" "+"student click enter to start register");

        for (int i = 0; i < studNum; i++) {
            
        }


    }

    
    
    public static void main(String[] args) {
        CbtAssignment cA = new CbtAssignment();
    }
    
}
