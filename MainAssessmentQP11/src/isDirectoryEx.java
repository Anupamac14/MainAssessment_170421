import java.io.*;

public class isDirectoryEx {
	public static void main(String args[]) {
		File f = new File("D:\\data");
		if (f.isDirectory())
			System.out.println("Directory");
		else
			System.out.println("It is not a Directory");
	}
}
