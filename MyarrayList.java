import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Scanner;

public class MyarrayList{
    static Scanner userInput = new Scanner(System.in);
    static String names;
    static ArrayList <String> studentlist = new ArrayList<String>();
    static HashMap <String, Integer> nameAge = new HashMap <String, Integer>();
    public static void students(){
        // LinkedList <String> studentlist = new LinkedList<String>();
        // ArrayList <Integer> numbers = new ArrayList<Integer>();
        // ArrayList <Myclass> numbers = new ArrayList<Myclass>();
        
        System.out.println("Enter your name");
        names = userInput.nextLine();
        studentlist.add(names);
        // System.out.println(studentlist.get(i));

        // studentlist.addFirst(names);
        // studentlist.addLast(names);
        // studentlist.addFirst(names);
        // studentlist.removeLast(names);
        
        // for(int i = 0; i < studentlist.size(); i++){
        //     System.out.println(studentlist.get(i));
        // }

        // numbers.add(3);
        // numbers.add(1);
        // numbers.add(4);
        // numbers.add(2);
        // Collections.sort(numbers);
        // for(int i : numbers)
        // System.out.println(i);

        students();

    }

    public static void Nameage(){
        // names.put();
        // System.out.println(" Enter your name");
        // nameAge.put("maryann", 24);
        // nameAge.put("brother", 24);
        //  If only the keys use nameAge.keySet();
        // for(String i : nameAge.keySet())
        // System.out.println("key:" + i + " "+ "value" + " " + nameAge.get(i));

        for(int i : nameAge.values())
        System.out.println(i);

        // System.out.println(nameAge.get("maryann"));
        // System.out.println(nameAge.get("maryann"));
        // System.out.println(nameAge);
    }

    // public class Myclass{}
    
    public static void main(String[] args) {
        //  students();
         Nameage();
        // for(String i : studentlist)
        // System.out.println(i);

        // studentlist.add("maryann");
        // studentlist.add("rhoda");
        // studentlist.add("yemi");
        // studentlist.add("prof");
        // studentlist.set(2, "anna");
        // studentlist.remove(3)
        // studentlist.clear();
        // studentlist.get(1)
        // studentlist.size();
    }
}
