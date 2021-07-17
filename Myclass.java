public class Myclass extends SecondClass2{

    public Myclass(){
        // super(); //so that the child constructor won't override the parent constructor
    }

    public void myName(){
        System.out.println("Hello world");
        // super.message();
    }

    public static void main(String[] args) {
        SecondClass2 sc = new SecondClass2();
        SecondClass2 my = new Myclass();
        sc.myName();
        my.myName();
        // my.setEye(2);
        // System.out.println(my.name);
        // System.out.println(my.getEye());
        // my.myName();
    }
}