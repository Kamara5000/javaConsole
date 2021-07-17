import java.util.Scanner;
import java.lang.*;
// import java.lang.Math;

public class Atm{
    static Scanner userInput = new Scanner(System.in);
    static Scanner answer = new Scanner(System.in);
    static String name;
    static int ans;
    static int pin;
    static double accountNo;
    static int transamount;
    static int amount = 1000;
    static int savings = 1500;
    static int currents = 2000;
    static int fixedDeposit = 2500;

    static String register = "Register";
    static String transfer = "Transfer";
    static String withdraw = "Withdraw";
    static String deposit = "Deposit";
    static String balance = "Balance";
    static String cancel = "Cancel";
    static String exits = "Exit";
    static String yes = "yes";
    static String nope = "no";

  public static void main(String[] args) {

     System.out.println(" 1. " + register + "\n" + " 2. " + transfer + "\n" + " 3. " + withdraw + "\n" + " 4. " + deposit +"\n" + " 5. " + balance + "\n"+ " 6. " + cancel + "\n" + " 7. " + exits);
    
     ans = answer.nextInt();
    if(ans == 1){
         registerUser();
     }
    if(ans == 2){
        Transfer();
    }
    if(ans == 3){
        Transfer();
    }
    if(ans == 6){
        Cancel();
    }
   }

   public static void registerUser() {
       accountNo = Math.random()*100000000;
       int newans;
       System.out.println( " Enter your names:");
       name = userInput.nextLine();
       System.out.println(" Enter your pin:");
       pin = userInput.nextInt(); 
       System.out.println(" Account name: " + " " + name + "\n" + " Account Number: " + " " + accountNo + "\n" + " Transaction pin: " + " " + pin);
       System.out.println(" Do you wish to perform another transaction ? \n");
       System.out.println(" 1. " + yes + "\n" + " 2. " + nope);
       newans = userInput.nextInt();
       if(newans == 1){
            Cancel();
       }
       if(newans == 2){
          System.exit(0);
       }
   }

  public static void Transfer() {
    String save = "Savings";
    String fixed = "Fixed Deposit";
    String current = "Current";
    int select;
    int newpin;
    String newpin2;
    int pin2;
    
    System.out.println(" Enter your pin:");
    newpin = userInput.nextInt(); 
    if(newpin != pin){
        System.out.println(" Incorrect pin! Enter 0 to cancel OR press 1 to re-enter your pin");
        pin2 = userInput.nextInt();
        if(pin2 == 0) {
            Cancel();
        } else if(pin2 == 1){
            System.out.println(" Enter your pin:");
            newpin = userInput.nextInt(); 
        }
    } else if(newpin == pin){
        String acco;
        System.out.println(" Enter benefactor's account number: ");
        newpin2 = userInput.nextLine();
        System.out.println(" Bank name:");
        newpin2 = userInput.nextLine();
        System.out.println(" Transfer amount: ");
        transamount = userInput.nextInt();
        System.out.println(" 1. " + save + "\n" + " 2. " + current + "\n" + " 3. " + fixed);
        select = userInput.nextInt();
        if(select == 1 & transamount > savings){
            System.out.println(" Dear customer, your transfer amount has exceeded your balance");
            System.out.println(" Enter 0 to cancel operation!");
            pin2 = userInput.nextInt();
            if(pin2 == 0){
                Cancel();
            }
        } else {
            savings -= transamount;
            System.out.println(" Please wait... Transaction in progress \n");
            System.out.println(" Transfer successful! \n");
            System.out.println(" Do you wish to perform another transaction ? \n");
            newpin2 = userInput.nextLine();
            if(newpin2.equals("yes")){
                 Cancel();
            }
            else if(newpin2.equals("no")){
               System.exit(0);
            }
        }

        if(select == 2 & transamount > currents){
            System.out.println(" Dear customer, your transfer amount has exceeded your balance");
            System.out.println(" Enter 0 to cancel operation!");
            pin2 = userInput.nextInt();
            if(pin2 == 0){
                Cancel();
            }
        } else {
            currents -= transamount;
            System.out.println(" Please wait... Transaction in progress \n");
            System.out.println(" Transfer successful! \n");
            System.out.println(" Do you wish to perform another transaction ? \n");
            newpin2 = userInput.nextLine();
            if(newpin2.equals("yes")){
                 Cancel();
            }
            else if(newpin2.equals("no")){
               System.exit(0);
            }
        }

        if(select == 3 & transamount > fixedDeposit){
            System.out.println(" Dear customer, your transfer amount has exceeded your balance");
            System.out.println(" Enter 0 to cancel operation!");
            pin2 = userInput.nextInt();
            if(pin2 == 0){
                Cancel();
            }
        } else {
            fixedDeposit -= transamount;
            System.out.println(" Please wait... Transaction in progress \n");
            System.out.println(" Transfer successful! \n");
            System.out.println(" Do you wish to perform another transaction ? \n");
            newpin2 = userInput.nextLine();
            if(newpin2.equals("yes")){
                 Cancel();
            }
            else if(newpin2.equals("no")){
               System.exit(0);
            }
        }

    }
   
}

  public static void Withdraw() {  
    String save = "Savings";
    String fixed = "Fixed Deposit";
    String current = "Current";
    int select;
    int newpin;
    String newpin2;
    int pin2;
   System.out.println(" Enter your pin:");
   newpin = userInput.nextInt(); 
   if(newpin != pin){
       System.out.println(" Incorrect pin! OR Enter 0 to cancel");
       pin2 = userInput.nextInt();
       if(pin2 == 0) {
           Cancel();
       }
       Transfer();
   } else{
    System.out.println(" Type in amount: \n" );
    transamount = userInput.nextInt();
    System.out.println(" 1. " + save + "\n" + " 2. " + current + "\n" + " 3. " + fixed);
    select = userInput.nextInt();
    if(select == 1 & transamount > savings){
        System.out.println(" Dear customer, your amount has exceeded your balance");
        System.out.println(" Enter 0 to cancel operation!");
        pin2 = userInput.nextInt();
        if(pin2 == 0){
            Cancel();
        }
    } else if(select == 1 & transamount < savings) {
        savings -= transamount;
        System.out.println(" Please wait... Transaction in progress \n");
        System.out.println(" This atm will not retract your cash \n");
        System.out.println(" Do you wish to perform another transaction ? \n");
        newpin2 = userInput.nextLine();
        if(newpin2.equals("yes")){
             Cancel();
        }
        else if(newpin2.equals("no")){
           System.exit(0);
        }
    }

    if(select == 2 & transamount > currents) {
        System.out.println(" Dear customer, your amount has exceeded your balance");
        System.out.println(" Enter 0 to cancel operation!");
        pin2 = userInput.nextInt();
        if(pin2 == 0){
            Cancel();
        }
    }  else {

    }

    if(select == 3 & transamount > fixedDeposit){
        System.out.println(" Dear customer, your amount has exceeded your balance");
        System.out.println(" Enter 0 to cancel operation!");
        pin2 = userInput.nextInt();
        if(pin2 == 0){
            Cancel();
        }
    } 
    else {
        System.out.println(" Transfer Successful! \n");
        System.out.println(" Do you wish to perform another transaction ? \n");
        newpin2 = userInput.nextLine();
        if(newpin2.equals("yes")){
             Cancel();
        }
        else if(newpin2.equals("no")){
           System.exit(0);
        }
    }
   }


  }

  public static void Cancel() {
    System.out.println(" 1. " + register + "\n" + " 2. " + transfer + "\n" + " 3. " + withdraw + "\n" + " 4. " + deposit +"\n" + " 5. " + balance + "\n"+ " 6. " + cancel + "\n" + " 7. " + exits);

    ans = answer.nextInt();
    switch (ans) {
        case 1:
         registerUser();
            break;
        case 2:
         Transfer();
            break; 
        case 3:
          Withdraw();
          break;   
      //   case "4":
      //      Deposit();
      //      break;
      //   case "5":
      //       Balance();
      //       break;
      //   case "6":
      //       Cancel(); 
      //       break;
      //   case "7":
      //       Exits();
      //       break;
        default:
            break;
    }

  }
}