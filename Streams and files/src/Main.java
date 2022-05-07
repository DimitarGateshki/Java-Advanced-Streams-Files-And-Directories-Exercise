import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("C:\\Users\\Dimi\\OneDrive\\Работен плот\\js\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        BufferedReader bReader=new BufferedReader(reader);

        FileWriter writer=new FileWriter("output.txt");

        String line=bReader.readLine();
        int m=0;
        int v=0;
        int o=0;

        Stack<Character> vowels=new Stack<>();
        vowels.push('a');
        vowels.push('e') ;
        vowels.push('i');
        vowels.push('o');
        vowels.push('u');

 Stack<Character> marks=new Stack<>();
        marks.push('!');
        marks.push('?') ;
        marks.push('.');
        marks.push(',');


        char cr;
        while (line!=null){
            for (int i = 0; i < line.length(); i++) {
                cr=line.charAt(i);
                if (vowels.contains(cr)){
                    v++;
                }else if (marks.contains(cr)){
                    m++;
                }else if(cr!=' '){
                    o++;
                }

            }
            line=bReader.readLine();



        }
        System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d",v,o,m);


    }
}
