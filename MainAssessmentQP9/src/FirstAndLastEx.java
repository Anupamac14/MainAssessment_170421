import java.util.ArrayList;  
class FirstAndLastEx{  
 public static void main(String args[]){  
 ArrayList<Integer> list=new ArrayList<Integer>();  
         list.add(24);  
         list.add(66);  
         list.add(12);  
         list.add(15); 
         System.out.println(list);
         int first = list.get(0);
         int last = list.get(list.size() - 1);
         System.out.println("\nFirst : " + first+ ", Last : " + last);
 	}
}
