import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.zensar.collection.NameComparator;
import com.zensar.collection.SalaryComparator;
import com.zensar.entity.Employee;

public class SortList {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList();

		l1.add(10);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);// printing in reverse order not descending order
		System.out.println(l1);
		Employee e1 = new Employee(103, "Ben", 10000);
		Employee e2 = new Employee(102, "Akash", 30000);
		Employee e3 = new Employee(101, "Dan", 20000);
		Employee e4 = new Employee(101, "Dan", 20000);

		l2.add(e3);
		l2.add(e2);
		l2.add(e1);
		Collections.sort(l2, new SalaryComparator());
		System.out.println(l2);
		Set t1 = new TreeSet();
		t1.add(e3);
		t1.add(e2);
		t1.add(e1);
		t1.add(e4);
		t1.add(e2);
		System.out.println(t1);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);
		for (Map.Entry<String, Integer> i : map.entrySet()) {// entrySet() .
			System.out.print(i.getKey() + ":");
			System.out.println(i.getValue());

		}
		System.out.println("Size of map is: "+map.size());
		System.out.println(map.get("a"));
		Hashtable htable=new Hashtable();
		htable.put(e1.getEmployeeId(), e1);
		htable.put(e2.getEmployeeId(), e2);
		htable.put(e3.getEmployeeId(), e3);
		System.out.println(htable);
		

	}

}
