package in.ineuron;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapp {

	public static void main(String[] args) {
		
		HashMap<String,Integer> m=new HashMap();
		m.put("a",1);
		m.put("b",2);
		m.put("c",3);
		m.put("d",4);
		System.out.println(m);
		// we can't iterate on it directly
		Set s=m.entrySet();
		Iterator r=s.iterator();
		while(r.hasNext())
		{
			Map.Entry<String, Integer> g= (Map.Entry)r.next();
			System.out.println(g.getKey()+" "+g.getValue());
		}
		
	}
}
