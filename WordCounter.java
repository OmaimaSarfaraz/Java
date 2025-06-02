package files;
import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph (end with 'END' on a new line):");
        StringBuilder text=new StringBuilder();
        while(true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("END")) break;
            text.append(line).append("\n");
        }

        try {
            FileWriter fw=new FileWriter("paragraph.txt");
            fw.write(text.toString());
            fw.close();
            System.out.println("✅ Text saved to paragraph.txt");
        } catch(Exception e){
            System.out.println("❌ Error saving file: "+e.getMessage());
            return;
        }

        int wordCount=0, lineCount=0, charCount=0;
        try {
            Scanner reader=new Scanner(new File("paragraph.txt"));
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                lineCount++;
                wordCount+=line.split("\\s+").length;
                charCount+=line.length();
            }
            reader.close();
        } catch(Exception e){
            System.out.println("❌ Error reading file.");
            return;
        }

        System.out.println("\n📊 File Statistics:");
        System.out.println("Lines: "+lineCount);
        System.out.println("Words: "+wordCount);
        System.out.println("Characters: "+charCount);
        sc.close();
    }
}
