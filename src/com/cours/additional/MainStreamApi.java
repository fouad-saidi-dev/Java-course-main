package com.cours.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStreamApi {

	static List<String> places = new ArrayList<>();

	public static List getPlaces() {
		places.add("Morocco, rabat");
		places.add("Morocco, casa");
		places.add("Spain, barcelona");
		places.add("Italie, milan");
		return places;
	}

	public static void main(String[] args) {

		List<String> myPlaces = getPlaces();
		String place;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a country :");
		place = scanner.nextLine();
		System.out.println("Places from " + place);

		// filter places from country
		myPlaces.stream()
		        .filter((p) -> p.startsWith(place))
		        .map((p) -> p.toUpperCase())
		        .sorted()
				.forEach((p) -> System.out.println(p));

	}

}
