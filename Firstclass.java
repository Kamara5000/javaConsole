// import System.out;
import java.util.Scanner;
public class Firstclass { //other classes will be dependent on this class
 
      public static void main(String[] args) {
         //here no other class will have this main, only this class
        System.out.println(myMessage("Maryann"));
        System.out.println(manyDatatypes(5, 3.8f));
      }
      
      // E.g o method definition
      public static String myMessage(String name){
        return name + " This is the first method in java";
      }

      public static int addition(int a, int b){
        return a + b;
      }

      public static float manyDatatypes(int b, float ty){
         float num = b + ty - addition(3, 4);
         return  num;
        // System.out.println(myname + (b * ty));
      }
 }        
        //  int[][] num = new int[5][10];
            // num = {{1,2,3,4,5,6,7,8,9,0}, {11,22,33,34,55,66,77,88,98}};
          //  for(int i = 0; i < num.length; i++){
            //  System.out.println(num[i]);
          //     for(int y = 0; y < num[i].length; y++){
          //         System.out.println(num[i][y]);
          //     }
          // }
          // String[] arrs = {"6", "maryann", "true", "bool"};
        //    for(String i : arrs){
        //      System.out.println(i);
        //    }

        // Scanner userInput = new Scanner(System.in);
        // System.out.println("Enter your name ");
        // String fname = userInput.nextLine();
        // String age = userInput.nextInt();
        // System.out.println("Your firstname is " + fname);
        // System.out.println("Enter your Lastname ");
        // String lname = userInput.nextLine();
        // System.out.println("Your lastname is " + lname);
        // System.out.println("Your fullname is " + lname + fname);
      // }

// }
// }

// DATATYPES IN JAVA
/*
String rep by ("") you have to terminate; N.b => string is not really a datatype in java it's a class
Integer rep by (int) 4byte
Float rep by (float) 4bytr
Double rep by (double) 8bytes
Character rep by (char) only a single quote 'a' 2bytes
Boolean rep by (boolean) true or false 1byte
*/

// Variable declaration IN JAVA
/*
    Synthax => datatype variableName;
                 OR
    Synthax => datatype variableName = value;
    e.gs
    int age;
    String name = "Maryann";
*/

// TYPES OF VARIABLE IN  JAVA
/*
Primitive 
Non-primitive e.g array, object 
*/

// To convert a String to integer you have to use casting
// From low memory to High memory it's called

// BITWISE => 
// & => and
// | => or,
// ~ => not

/*
Examples
        // Math.min(60, 90);
        // Math.sqrt(60, 90);
        // Math.abs(60, 90);
        // Math.random(60, 90);
        // Math.floor(60, 90);
       System.out.println("The total length of comment is " + comment.length());
       System.out.println(comment.toUpperCase());
       System.out.println(comment.indexOf("college"));
       System.out.println((int)Math.floor(Math.random() * 100));
       String comment = "This is \"java\" class for both college student and certificate";

          int numbs = 4 * 4;
          System.out.println("This is java class"); //This is to print something on the screen
          System.out.println(numbs + " :Maryann pay attention");

        //E.g of automatic casting;

         int ages = 28;
         double myAge = ages + 0.9;
         System.out.println(myAge + " Automatic casting");

        //E.g of Narrowing casting;

        float age = 28.95665f;
        int changeAge = (int)age;
        System.out.println(changeAge + " Narrow casting");

        String comment = "This is java class for both college student and certificate";
        
        String name = "Maryann";
        String age = "34";
        System.out.println(name.equals(age));

        String[] arrs = {"6", "maryann", "true", "bool"};
         String[] arr = new String[10]; // This means that this array will only contain 10 values
         arr[3] = "maryann";

         for(int i = 0; i < arrs.length; i++){
           System.out.println(arrs[i]);
         }

          for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
         }

          int[][] num = int[5][10]; // This is multidimensional array which means inside the big array that is the first one which is 5


*/

// N.B => equals() is normally use for string comparison