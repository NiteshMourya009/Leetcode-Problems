package oopsConcept;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args)  {

        // code to create a new file
        File myfile= new File("File_Handling.txt") ;
        try{
            myfile.createNewFile() ;
        }
        catch(Exception e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("File_Handling.txt");
            fileWriter.write("This is our first from this java course");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
