import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileSystem{

    String data;
    public FileSystem(){

        //creating a file
        // try {
        //     
        //     File myFile = new File("javaFile.txt"); 
        //    // it will save it on same folder unless the path is specify like  File myFile = new File("C:\\Users\\DELL\\Desktop\\JAVA_SQI\\java_classjavaFile.txt"); 
        //     //boolean status = myFile.createNewFile();
        //     if(myFile.createNewFile()){
        //         System.out.println("File created succesfully");
        //     }else{
        //         System.out.println("unable to create file");
        //     }
        // } catch (IOException e) {
        //     //TODO: handle exception
        //     System.out.println("operation encounter an error");
        //     e.printStackTrace();
        // }


         //check if the file is writeable
        // try {
        //    
        //     File myFile = new File("javaFile.txt"); 
        //    // it will save it on same folder unless the path is specify like  File myFile = new File("C:\\Users\\DELL\\Desktop\\JAVA_SQI\\java_classjavaFile.txt"); 
        //     //boolean status = myFile.createNewFile();
        //     if(myFile.canWrite()){
        //         System.out.println("File is writeable");
        //     }else{
        //         System.out.println("file is not writeable");
        //     }
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println("operation encounter an error");
        //     e.printStackTrace();
        // }


         //check file can exists and is writable
        // try {
        //    
        //     File myFile = new File("javaFile.txt"); 
        //    // it will save it on same folder unless the path is specify like  File myFile = new File("C:\\Users\\DELL\\Desktop\\JAVA_SQI\\java_classjavaFile.txt"); 
        //     //boolean status = myFile.createNewFile();
        //     if(myFile.exists() && myFile.canWrite()){
        //         System.out.println("File created succesfully");
        //     }else{
        //         System.out.println("unable to create file");
        //     }
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println("operation encounter an error");
        //     e.printStackTrace();
        // }


        //writing to a file
        // try {

            
        //     // FileWriter myFile = new FileWriter("javaFile.txt");
        //     //if you want thr file to be append to the end of the file
        //     FileWriter myFile = new FileWriter("javaFile.txt", true);

        //    // it will save it on same folder unless the path is specify like  File myFile = new File("C:\\Users\\DELL\\Desktop\\JAVA_SQI\\java_classjavaFile.txt"); 
        //    myFile.write("this is the second write operation on the file");
        //    myFile.close();
        //    System.out.println("Written succesfully");
            
        // } catch (IOException e) {
        //     //TODO: handle exception
        //     System.out.println("operation encounter an error");
        //     e.printStackTrace();
        // }

        
        //reading from a file
    //     try {
    //         File myFile = new File("javaFile.txt");
    //         Scanner myRead = new Scanner(myFile);
    //   // it will save it on same folder unless the path is specify like  File myFile = new File("C:\\Users\\DELL\\Desktop\\JAVA_SQI\\java_classjavaFile.txt"); 
    //        while(myRead.hasNextLine()){
    //            data = myRead.nextLine();
    //            System.out.println(data);
    //        }
    //        System.out.println(myFile.getAbsolutePath());
    //        System.out.println(myFile.getName());
    //        System.out.println(myFile.exists());
    //        myRead.close();
            
    //     } catch (IOException e) {
    //         //TODO: handle exception
    //         System.out.println("operation encounter an error");
    //         e.printStackTrace();
    //     }


        // //deleting a file
        // File myFile = new File("javaFile.txt");
        // if(myFile.delete()){
        //     System.out.println(myFile.getName() + "file deleted succesfully");
        // }else{
        //     System.out.println("failed to delete");
        // }


    //working with folder
        //creating folder
        //  File myFile = new File("javaFile");
        // if(myFile.mkdir()){
        //     System.out.println(myFile.getName() + "folder created succesfully");
        // }else{
        //     System.out.println("failed to create folder");
        // }


        //files in folder must be deleted before a folder can be deleted
        File myFile = new File("javaFile");
        String[] output = myFile.list();
        for(String nextFile: output){
           
            File newFile = new File("C:\\JAVA_SQI\\java_class\\javaFile\\" + nextFile);
            newFile.delete();
        }
        if(myFile.delete()){
            System.out.println("folder deleted successfully");
        }else{
            System.out.println("failed to delete folder");
        }





    }

    public static void main(String[] args){
        FileSystem fs = new FileSystem();
    }
}

//canRead()-check if thr file can be Read and returns boolean
//canWrite()- check if the file can be writen and returns boolean
//createNewFile()- create file and returns boolean
//delete()- to delete a file and returns boolean
//exists()- if file exists and returns boolean
//getName()- to get the file name and returns string
//getAbsolutePath()- to get the absolute file path 
//length()- returns size of the file
//list()- retunns string array
//mkdir()- create new folder