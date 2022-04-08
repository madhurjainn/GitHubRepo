package com.zensar.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Client {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Akash");
		names1.add("Anil");

		names.add("Ram");
		names.add("Ravi");
		names.add("Ranu");
		Iterator<String> nameIterator = names.iterator();
		while (nameIterator.hasNext()) { // hasNext() return type boolean
			String name = (String) nameIterator.next();// next() method prints value
			System.out.println(name);
		}
		System.out.println();
		ListIterator<String> namesIterator = (ListIterator<String>) names1.listIterator();
		while (namesIterator.hasNext()) {
			String name1 = namesIterator.next();
			System.out.println(name1);
		}
			Vector v = new Vector();
			v.addElement(10);
			v.addElement("Ram");
			v.addElement("Lakshman");
			v.addElement("Sita");
			v.add(1);
			v.add(2);
			v.add(3);
			v.add(4);
			System.out.println(v);
			Vector<Integer> v1 = new Vector<Integer>();
			v1.add(20);
			v1.add(30);
			v1.add(40);
			v1.add(50);
			System.out.println(v1);
		}

	}

