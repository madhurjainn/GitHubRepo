package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> vehicle=Arrays.asList("bus","car","bicycle","truck","tractor");
		vehicle.stream().map(vname->vname.length()).forEach(System.out::print);
		
		
		List<Integer> number=Arrays.asList(2,3,4,5,7);
		List<Integer> multipleOfThree=new ArrayList<>();
		multipleOfThree=number.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(multipleOfThree);
		

	}

}
