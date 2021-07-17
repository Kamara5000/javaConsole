import java.util.Scanner;
public class Thirdclass {
    static Scanner userInput = new Scanner(System.in);

    public static void login(){
        Scanner userInput = new Scanner(System.in);
       String id = "myId1";
       String pin = "1234";
       System.out.println("Enter your id > ");
       String userId = userInput.nextLine();
       System.out.println("Enter your password > ");
       String pins = userInput.nextLine();

       if(id.equals(userId) && pin.equals(pins)){
           System.out.println("Login Successfully");
       } 
       else{
           System.out.println("Incorrect password");
           login();
       }
    }

    public static void main(String[] args){
        login();
    }
}