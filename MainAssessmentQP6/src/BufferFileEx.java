import java.io.*;  
public class BufferFileEx {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:/data/BufferFile.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("ABC");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  
