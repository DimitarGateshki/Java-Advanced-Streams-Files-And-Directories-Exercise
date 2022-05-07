import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class M1 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("C:\\Users\\Dimi\\OneDrive\\Работен плот\\js\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        BufferedReader bReader=new BufferedReader(reader);

        Map<String,Integer> words=new LinkedHashMap<>();

        FileWriter writer=new FileWriter("output2.txt");

        String[] line=bReader.readLine().split("\\s+");


        String cr;
        while (line!=null){
            for (int i = 0; i < line.length; i++) {
                cr=line[i].toLowerCase();
                if (words.containsKey(cr)){
                    words.put(cr,words.get(cr+1));
                }else {
                    words.put(cr,1);
                }
            }



            line=bReader.readLine().split("\\s+");
        }

        writer.flush();
        writer.close();
    }
}
