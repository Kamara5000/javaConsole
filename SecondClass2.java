import java.util.Scanner;

public class SecondClass2 {
    
    private int value;
    private int eye;

    protected String name = "Maryann";
    
    public void setValue(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public void myName(){
        System.out.println("My name is " + name);
    }

    public void setEye(int ye) {
        eye = ye;
    }

    public int getEye() {
        return eye;
    }

    // public static void main(String[] args) {
    //     SecondClass2 ne = new SecondClass2();
    //     ne.setValue(30);
    //     ne.setEye(2);
        // System.out.println(ne.getValue());
    // }
}