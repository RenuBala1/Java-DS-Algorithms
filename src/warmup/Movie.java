package warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie>{

	private double rating;
	private String name;
	private int year;

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	public Movie()
	{

	}

	public Movie(String name, Double rating, int year)
	{
		this.name =  name;
		this.rating = rating;
		this.year = year;
	}

	public double getRating()
	{
		return this.rating;

	}

	public String getName()
	{
		return this.name;

	}

	public int getYear()
	{
		return this.year;

	}


	class NameCompare implements Comparator<Movie>
	{

		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.name.compareTo(o2.name);
		}

	}

	class SortByRating implements Comparator<Movie>
	{

		@Override
		public int compare(Movie o1, Movie o2) {
			if(o1.getRating() > o2.getRating())
				return 1;
			else if(o1.getRating() < o2.getRating())
				return -1;
			else return 0;

		}

	}

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		System.out.println("------Before sorting-------");
		for(Movie e: list)
		{
			System.out.println(e.name + " " + e.rating + " " + e.year);
		}

		Collections.sort(list, Collections.reverseOrder());

		System.out.println("--------After sorting by year reverseOrder() - CompareTo() function is invoked-------");
		for(Movie e: list)
		{
			System.out.println(e.name + " " + e.rating + " " + e.year);
		}

		// Sort by name
		System.out.println("-------After sorting by name-------");
		Movie mv = new Movie();
		NameCompare nameCompare = mv. new NameCompare();
		Collections.sort(list,nameCompare);

		for(Movie e: list)
		{
			System.out.println(e.name + " " + e.rating + " " + e.year);
		}

		// Sort by name
		System.out.println("-------After sorting by rating-------");

		SortByRating sortByRating = mv. new SortByRating();
		Collections.sort(list,sortByRating);

		for(Movie e: list)
		{
			System.out.println(e.name + " " + e.rating + " " + e.year);
		}

	}
}


