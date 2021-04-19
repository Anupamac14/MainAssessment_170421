import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenOddEx {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Predicate<Integer> even = (a) -> a % 2 == 0;
		Predicate<Integer> odd = even.negate();

		List<Integer> evenList = lst.stream().filter(even).collect(Collectors.toList());
		List<Integer> oddList = lst.stream().filter(odd).collect(Collectors.toList());

		System.out.println("The Even List : " + evenList);
		System.out.println("The Odd List : " + oddList);
	}
}
