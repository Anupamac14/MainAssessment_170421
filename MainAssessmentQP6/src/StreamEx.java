import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
 
public class StreamEx
{
    public static void main(String[] args)
    {
        String[] array = { "A", "B", "C", "D"  };
 
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(array)
                .map(str -> index.getAndIncrement() + " -> " + str)
                .forEach(System.out::println);
    }
}
