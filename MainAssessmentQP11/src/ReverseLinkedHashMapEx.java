
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
 
public class ReverseLinkedHashMapEx {
 
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(); 
        lhm.put(1, "Anu");
        lhm.put(2, "Racchu");
        lhm.put(3, "Buff");
        lhm.put(4, "Netty");
        lhm.put(5, "Kala");
        System.out.println("Insertion Order of LinkedHashMap: \n");
        Set<Integer> set = lhm.keySet();
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            Integer key = itr.next();
            System.out.println("Key : "  + key +"  "+ "Value : "  + lhm.get(key));
        }
        System.out.println("\n\nReverse of Insertion Order:\n");
        List<Integer> alKeys = new ArrayList<Integer>(lhm.keySet());
        Collections.reverse(alKeys);
        for(Integer strKey : alKeys){
            System.out.println("Key : "  + strKey +"  "+ "Value : "  + lhm.get(strKey));
        }
    }
}
