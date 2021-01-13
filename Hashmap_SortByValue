import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(1000,"Akash");    
      map.put(101,"Sumit");    
      map.put(1082,"Niks");    
      //Returns a Set view of the mappings contained in this map    
      map.entrySet()  
      //Returns a sequential Stream with this collection as its source  
      .stream()  
      //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByValue())  
      //Performs an action for each element of this stream  
      .forEach(System.out::println);   
 } 
}
