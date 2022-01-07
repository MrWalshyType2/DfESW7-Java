package com.qa.iteration.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// The iterator pattern can be used to iterate over List collections, such as
		// the ArrayList
		List<String> names = new ArrayList<>(List.of("Bob", "Fred", "Sarah", "Edgar"));

		// get the iterator
		Iterator<String> iterator = names.iterator();

		// check if there is a next element in the iterator (i.e. it is not empty)
		while (iterator.hasNext()) {
			// the iterator has a next element, so we can get the element
			String element = iterator.next(); // returns the next element and advances the iterator
			System.out.println(element);
		}

		iterator = names.iterator();
		// You cannot use the List interfaces 'remove' method with the iterator pattern
		// or it will throw an exception
		// - uncomment this code to try it
//		while (iterator.hasNext()) {
//			// try to remove "Fred"
//			String element = iterator.next();
//			if (element == "Fred") {
//				names.remove(element);
//			}
//			System.out.println(element);
//		}

		// To remove an element whilst using the iterator pattern, use the
		// iterator.remove() method instead
		while (iterator.hasNext()) {
			// try to remove "Fred"
			String element = iterator.next();
			if (element == "Fred") {
				iterator.remove(); // removes the last element returned from the iterator
			} else {
				System.out.println(element);
			}
		}
		
		// removing the element from the iterator also removed it from the list that backed the iterator
		System.out.println(names.get(1));
	}

}
