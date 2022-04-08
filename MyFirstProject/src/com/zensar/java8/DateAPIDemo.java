package com.zensar.java8;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateAPIDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Raina");
		names.add("Jaddu");
		names.add("Gambhir");
		names.add("Sehwag");
		names.add("Rohit");
		System.out.println(names);
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> number = new ArrayList<>();
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(9);
		number.add(8);
		number.add(2);
		System.out.println("Original List " + number);

		List<Integer> squareNumberList = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Squared List " + squareNumberList);

		// List<String>
		// namesWithR=names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		// System.out.println(namesWithR);

		// Stream<String> nameStream=names.stream();
		// nameStream.forEach(c->System.out.println(c));
		// names.stream().forEach(c->System.out.println(c)); //Method Chaining
		// List<String> namesStartWithR= new ArrayList<String>();

		/*
		 * for(String s: names) { if(s.startsWith("R")) { namesStartWithR.add(s); } }
		 * System.out.println("Names starting with R are: "+namesStartWithR);
		 */
		/*
		 * List<String> namesWithR = (ArrayList<String>) names.stream().filter(name ->
		 * name.startsWith("R")) .collect(Collectors.toList());
		 * System.out.println(namesWithR);
		 */

		/*
		 * LocalDate birthDate=LocalDate.of(1998,07,29); LocalDate
		 * currentDate=LocalDate.of(2022, 03, 29); Period
		 * period=Period.between(birthDate, currentDate);
		 * System.out.println("I am "+period.getYears()+" years "+period.getMonths()
		 * +" Months"+" and "+period.getDays()+" days old");
		 * 
		 * //Set<String> zoneIds=ZoneId.getAvailableZoneIds();
		 * //System.out.println(zoneIds); //ZoneId zoneId= ZoneId.now(); //LocalDate
		 * date =LocalDate.now(); /*LocalDate localDate=
		 * LocalDate.of(2022,03,21);//setting custom date
		 * localDate=localDate.plusYears(2); localDate=localDate.plusMonths(5);
		 * localDate=localDate.plusDays(30); localDate=localDate.minusYears(2);
		 * localDate=localDate.minusMonths(5); localDate=localDate.minusDays(30);
		 * localDate=localDate.plusDays(8); //System.out.println(localDate);
		 * 
		 * //LocalTime time=LocalTime.now(); //System.out.println(time); LocalTime
		 * localtime=LocalTime.of(4, 00);// //System.out.println(localtime);
		 * localtime=localtime.plusHours(2); localtime=localtime.plusMinutes(30);
		 * localtime=localtime.minusHours(2); localtime=localtime.minusMinutes(30);
		 * 
		 * //System.out.println(localtime);
		 * 
		 * LocalDateTime localDateTime= LocalDateTime.now();
		 * //System.out.println(localDateTime); localDateTime=LocalDateTime.of(2022, 03,
		 * 29, 4, 00); //System.out.println(localDateTime);
		 * localDateTime=localDateTime.plusDays(10);
		 * localDateTime=localDateTime.plusMonths(10);
		 * localDateTime=localDateTime.plusYears(10); System.out.println(localDateTime);
		 */

	}

}
