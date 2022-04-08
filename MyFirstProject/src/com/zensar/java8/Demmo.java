package com.zensar.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demmo {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,4,2,8,6,9);
		List<Integer>reverseSortedList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse ordered list is: "+reverseSortedList);
		List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted ordered list is: "+sortedList);
		
		
		List<String> stringList=Arrays.asList("Ravi","Akash","Balram","Dhoni");
		List<String>sortedStringList=stringList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted string list is: "+sortedStringList);
		List<String> reverseSortedString=stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse sorted string list is: "+reverseSortedString);
		
		//anyMatch
		Set<String> fruits=new HashSet<>();
		fruits.add("One Apple");
		fruits.add("Two Mango");
		fruits.add("Three Banana");
		fruits.add("One PineApple");
		boolean result=fruits.stream().anyMatch(n->{return n.startsWith("One");});
		System.out.println(result);
		//allMatch
		Boolean result1=fruits.stream().allMatch(n->{return n.startsWith("One");});
		System.out.println(result1);
		Boolean result2=fruits.stream().noneMatch(n->{return n.startsWith("One");});
		System.out.println(result2);
		
		
		
	}
	

}
