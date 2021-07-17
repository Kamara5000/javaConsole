package myapp;
import java.util.Scanner;

public class NewClass2 {
    private String name;

    public void setName(String val) {
        name = val;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        NewClass2 ne = new NewClass2();
        ne.setName("Maryann");
        System.out.println(ne.getName());
    }
}