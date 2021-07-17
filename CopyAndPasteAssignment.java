import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class CopyAndPasteAssignment {
    Scanner input = new Scanner(System.in);
     String[] myFiles;
    int Copynum=0; 
        int Pastenum=0;
        String copy;
        String paste;
        String data = null;
    
        public CopyAndPasteAssignment() {
        try {
                copy();
                paste();
        
        } catch (Exception e) {
            //TODO: handle exception

            System.out.println("operation encounter an error");
                   e.printStackTrace();
        }
        


    }

    public void copy(){
        try {
            System.out.println("WELCOME TO FILE PROCESSING CLICK ENTER TO SEE LIST OF AVAILABLE FILES");
        input.nextLine();

        File myFile= new File("C:\\JAVA_SQI\\java_assignment\\");
         myFiles= myFile.list();
        
       // System.out.println(myFiles);
        // for (String output : myFiles) {
        //     //File newFile = new File("C:\\JAVA_SQI\\java_assignment\\" + output);
        //     System.out.println(output);
        // }
        // for (int i = 0; i < myFiles.length; i++) {
        //     if(i+1 == Copy){
        //         System.out.println(myFiles[i]);
        //     }
        // }
        

        for (int i = 0; i < myFiles.length; i++) {
            System.out.println(i+1 + " "+ myFiles[i]);
        }

        System.out.println("select the file to be copy by inserting the number");
        Copynum = input.nextInt();
        // copy = myFiles[Copynum-1];
        // paste= myFiles[Pastenum-1];
        System.out.println("copy from"+" " + myFiles[Copynum-1]);

        System.out.println("select where to paste the file by inserting the number");
        Pastenum = input.nextInt();
        System.out.println("paste to"+" " + myFiles[Pastenum-1]);
        System.out.println("select 1 to copy from"+" "+myFiles[Copynum-1] + " " +"to"+ " "+ myFiles[Pastenum-1] );
        input.nextInt();
        File readFile = new File(myFiles[Copynum-1]);
        Scanner  myRead = new Scanner(readFile);
        
        while(myRead.hasNextLine()){
            data = myRead.nextLine();
            //System.out.println(data);
        }
        //System.out.println(myRead);

        myRead.close();

        } catch (Exception e) {
            System.out.println("operation encounter an error");
            e.printStackTrace();
        }
    }

    public void paste(){
        try {
            FileWriter copyFile = new FileWriter(myFiles[Pastenum-1], true);
            File cFile = new File(myFiles[Pastenum-1]);
                if(cFile.exists() && cFile.canWrite()){
                    
                    copyFile.write(data);
                   copyFile.close();
                    System.out.println("File copied from"+" "+myFiles[Copynum-1]+" "+ " to" +" "+myFiles[Pastenum-1]+" "+"succesfully");
                }else{
                    System.out.println("unable copy file");
                }
        } catch (Exception e) {
            System.out.println("operation encounter an error");
            e.printStackTrace();
        }
        
    }




     public static void main(String[] args) {
        CopyAndPasteAssignment cP= new CopyAndPasteAssignment();
    }
}
