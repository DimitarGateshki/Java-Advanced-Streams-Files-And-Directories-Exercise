import java.io.File;

public class m4 {
    public static void main(String[] args) {
        File folder=new File("C:\\Users\\Dimi\\OneDrive\\Работен плот\\js\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        File[] files=folder.listFiles();
        long size=0;
        for (int i = 0; i < files.length; i++) {
            size+=files[i].length();
        }

        System.out.println("Folder size: "+size);
    }
}
