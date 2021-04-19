import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class ListToStreamEx {
    private static <String> Stream<String> listToStream (List<String> list) {
        return list.stream();
    }
 
    public static void main(String[] args)
    {
        List<String> empName = Arrays.asList("Anu","Racchu","Buff");
        System.out.println("Employee names in List : "+empName);
        Stream<String> stream = listToStream(empName);
        System.out.println("Employee names After converting into Stream : "+Arrays.toString(stream.toArray()));
    }
}


