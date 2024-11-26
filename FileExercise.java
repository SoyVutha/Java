
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileExercise {
    public static Scanner scan=new Scanner(System.in);
   public static void main(String[] args) {
       String filename = "codescracker.txt";
       try{
        File file=new File(filename);
        if(!file.exists())
        {
             System.out.println("File does not exist. Creating a new file...");
              file.createNewFile();
        }
        else{
            System.out.println("----Content of File----");
             BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
        }
        while (true) {
            System.out.printf("Want to append the text(y/n)? ");
            char append=scan.nextLine().charAt(0);
            if(append=='y')
            {
                  System.out.println("1. Append Single Line of Text.");
                    System.out.println("2. Append Multiple Lines of Text.");
                    System.out.print("Enter Your Choice (1 or 2): ");
                    int choice = scan.nextInt();
                    scan.nextLine();
                    FileWriter fileWriter=new FileWriter(filename,true);
                       if (choice == 1) {
                        System.out.print("Enter the Text: ");
                        String text = scan.nextLine();
                        fileWriter.write(text + "\n");
                    } else if (choice == 2) {
                       System.out.println("How many line to write ?");
                       int n=scan.nextInt();
                       scan.nextLine();
                       System.out.println("Enter "+n+"lines of text :");
                       for(int i=0;i<n;i++)
                       {
                        String text = scan.nextLine();
                        fileWriter.write(text + "\n");
                       }
                    }
                     fileWriter.close();
                    System.out.println("The content is successfully appended to the file.");
            }
            else if(append=='n'){
                return;
            }
            System.out.printf("Want to see the new content (y/n) ?");
            char see=scan.nextLine().charAt(0);
            if(see=='y')
            {
                  System.out.println("----Content of File----");
                  BufferedReader reader1 = new BufferedReader(new FileReader(filename));
                   String line;
                    while ((line = reader1.readLine()) != null) {
                        System.out.println(line);
            }
            reader1.close();
            
           }
       }}
       catch(IOException e){
        System.out.println("Error: " + e.getMessage());
       }
            
        }
    
}
