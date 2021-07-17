// public class Secondclass extends InnerClass{
//     public void welcome(){
//         System.out.println("welcome to class");
//     }

//     public static void main(String[] args) {
//          Secondclass sc = new Secondclass();
//         //  InnerClass.Myclass icm = ic.new Myclass();
//         //  ic.eye = 5;
//         //  System.out.println(ic.eye);
//         //  icm.course = "Java";
//          sc.details();
//          sc.welcome();
//         //  System.out.println(icm.course);
//      }    
// }

public class Secondclass implements InnerClass{
    public void welcome(){
        System.out.println("welcome to class");
    }

    public void details(){
        System.out.println("welcome to class");
    }

    public static void main(String[] args) {
         Secondclass sc = new Secondclass();
         sc.details();
         sc.welcome();
    }
}