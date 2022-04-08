package com.zensar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List <Integer>> finalList=Arrays.asList(list1,list2,list3);
		List<Integer> singleFinalList=finalList.stream().flatMap(n->n.stream()).map(x->x+10).collect(Collectors.toList());
		System.out.println(singleFinalList);
		
		List<String> teamA=Arrays.asList("Rohit","Dhoni");
		List<String> teamB=Arrays.asList("Jadega","Raina");
		List<String> teamC=Arrays.asList("Kohli","Pandya");
		
		List<List<String>> finalTeam=Arrays.asList(teamA,teamB,teamC);
	/*	for(List<String> team:finalTeam) {
			for(String s:team)
			System.out.println(s);
		}*/
		List<String>storedList=finalTeam.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		System.out.println(storedList);
		
	}

}
