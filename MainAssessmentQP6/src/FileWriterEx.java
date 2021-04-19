import java.io.FileWriter;
import java.io.IOException;
public class FileWriterEx {
    public static void main(String[] args)
        throws IOException
    {
        String str = "Xyz";
        try {
            FileWriter fw
                = new FileWriter("D:/data/file.txt");
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
  
            System.out.println("Successfully written");
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
