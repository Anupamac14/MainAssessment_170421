import java.util.Collections;
import java.util.Vector;

public class TraverseVectorEx {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		names.add("Anu");
		names.add("Buff");
		names.add("Racchu");

		System.out.println("Before Reversing :");
		names.forEach(n -> System.out.println(n));

		Collections.reverse(names);
		System.out.println("After Reversing :");
		names.forEach(n -> System.out.println(n));
	}
}
