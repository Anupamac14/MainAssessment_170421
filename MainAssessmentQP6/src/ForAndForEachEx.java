import java.util.*;

public class ForAndForEachEx {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vimal");
		list.add("sonoo");
		list.add("ratan");
		System.out.println("Using For Loop");
		for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
		System.out.println("Using For Each Loop");
		for (String s : list) {
			System.out.println(s);
		}

	}
}
