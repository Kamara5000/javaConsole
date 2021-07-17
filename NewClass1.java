package myapp;
import java.util.Scanner;

public class NewClass1 {
    private int value;

    protected String name = "Maryann";
    
    public void setValue(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        NewClass1 ne = new NewClass1();
        ne.setValue(30);
        System.out.println(ne.getValue());
    }
}
