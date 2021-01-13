import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
  
  String s = "programmerit";
  findWords(s,s.length(),"");
  
  }
  
  public static void findWords(String s, int length, String out)
{
    HashMap<String,String>hm = getDictionary();
    for (int i=1; i <= length; i++)
    {
        String subwords = s.substring(0, i);
        if (hm.containsKey(subwords))
        {
            if (i == length)
            {
                out = out + subwords;
                System.out.println(out);
                return;
            }
            findWords(s.substring(i,length), length-i, out+subwords+" ");
        }
    }
}
public static HashMap<String,String> getDictionary()
{
    HashMap<String,String> hm=new HashMap<String,String>();
    hm.put("a","a");
    hm.put("it","it");
    hm.put("am","am");
    hm.put("ram","ram");
    hm.put("pro","pro");
    hm.put("grammer","grammer");
    hm.put("program","program");
    hm.put("programmer","programmer");
    hm.put("me","me");
    hm.put("merit","merit");
    return hm;
}

}
