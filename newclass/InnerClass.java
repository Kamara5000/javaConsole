// innerclass means nestin a class inside another class


public class InnerClass{
    
    enum EnumClass{
        final = 34, HEAD, RIGHTEYE, LEFTEYE, MOUTH, LEFTEAR, RIGHTEAR, RIGHTHAND, LEFTHAND, NOSE
    }

    public static void main(String[] args) {
        EnumClass en = EnumClass.HEAD;
        // for(EnumClass val : EnumClass.values())
        switch (en) {
            case 34:
              System.out.println(" You're correct!");
            break;
        
            default:
                break;
        }
        // InnerClass in = new InnerClass();
        // InnerClass.EnumClass ine = in.new EnumClass();
    }
}

// abstract class InnerClass {
//     public String name = "Maryann";
//     public int age;
//     public int eye;

//    public class Myclass {
//     String level;             
//     String course;  
// }   
//     public void details(){
//         System.out.println("My name is " + name);
//     }
//     public abstract void welcome();    
// }

// implement an interface, inherit abstract class

// interface InnerClass {
//     public String name = "Maryann";
//     public int age = 6;
//     public int eye = 4;

//    public class Myclass {
//     String level;             
//     String course;  
// }   
//     public void details();
//     public void welcome();    
// }


