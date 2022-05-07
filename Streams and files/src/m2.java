import java.io.*;

public class m2 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("C:\\Users\\Dimi\\OneDrive\\Работен плот\\js\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        FileReader reader2=new FileReader("C:\\Users\\Dimi\\OneDrive\\Работен плот\\js\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        BufferedReader bReader=new BufferedReader(reader);
        BufferedReader bReader2=new BufferedReader(reader2);
        FileWriter writer=new FileWriter("output3.txt");

        String line=bReader.readLine();

        while (line!=null){
            writer.write(line);
            writer.write(System.lineSeparator());
            line=bReader.readLine();
        }

        line=bReader2.readLine();
         while (line!=null){
             writer.write(line);
             writer.write(System.lineSeparator());
            line=bReader2.readLine();
        }

         writer.flush();
         writer.close();

    }
}
