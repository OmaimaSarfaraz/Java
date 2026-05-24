package files;
import java.io.*;
import java.util.*;

public class DiaryApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String folder="DiaryEntries";
        new File(folder).mkdirs(); 

        System.out.println("📖 Welcome to Your Personal Diary");
        System.out.println("1. Write Entry");
        System.out.println("2. Read Entry");
        System.out.print("Choose option: ");
        int choice=sc.nextInt();
        sc.nextLine(); 

        if(choice==1){
            System.out.print("Enter today's title: ");
            String title=sc.nextLine();
            System.out.println("Write your entry (end with 'END' on a new line):");
            StringBuilder entry=new StringBuilder();
            while(true){
                String line=sc.nextLine();
                if(line.equalsIgnoreCase("END")) break;
                entry.append(line).append("\n");
            }
            try{
                FileWriter fw=new FileWriter(folder+"/"+title+".txt");
                fw.write(entry.toString());
                fw.close();
                System.out.println("✅ Entry saved as "+title+".txt");
            }catch(Exception e){
                System.out.println("❌ Error: "+e.getMessage());
            }
        }else if(choice==2){
            System.out.print("Enter title to read: ");
            String title=sc.nextLine();
            try{
                File file=new File(folder+"/"+title+".txt");
                Scanner reader=new Scanner(file);
                System.out.println("📂 Entry: "+title);
                while(reader.hasNextLine()){
                    System.out.println(reader.nextLine());
                }
                reader.close();
            }catch(Exception e){
                System.out.println("❌ Entry not found.");
            }
        }else{
            System.out.println("❌ Invalid choice.");
        }

        sc.close();
    }
}
