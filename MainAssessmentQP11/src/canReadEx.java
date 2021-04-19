import java.io.*;
 
public class canReadEx {
    public static void main(String args[])
    {
        File f = new File("D:\\data\\file.txt");
        if (f.canRead())
            System.out.println("Can be Read");
        else
            System.out.println("Cannot be Read");
    }
}
