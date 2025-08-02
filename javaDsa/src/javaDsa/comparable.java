package javaDsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class comparable {
public static void main(String[] args) {
	ArrayList<Movie> al = new ArrayList<Movie>();
	al.add(new Movie("kingdom","fun",11,"telugu"));
	al.add(new Movie("whistle","horror",9,"malayam"));
	al.add(new Movie("Rcb","fighting",11,"kannada"));
	al.add(new Movie("mizapur","comedy",11,"hindi"));
	al.add(new Movie("priates","romance",11,"english"));
	
	System.out.println("Before sorting: == ");
	Iterator<Movie> itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next() + " ");
	}
	System.out.println();
	Collections.sort(al);
	System.out.println("After sorting: == ");
	itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next() + " ");
	}
}
}

class Movie implements Comparable<Movie>{
	String name;
	String genere;
	int showtimings;
	String lanugage;
	
	

	public Movie(String name, String genere, int showtimings, String lanugage) {
		super();
		this.name = name;
		this.genere = genere;
		this.showtimings = showtimings;
		this.lanugage = lanugage;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGenere() {
		return genere;
	}



	public void setGenere(String genere) {
		this.genere = genere;
	}



	public int getShowtimings() {
		return showtimings;
	}



	public void setShowtimings(int showtimings) {
		this.showtimings = showtimings;
	}



	public String getLanugage() {
		return lanugage;
	}



	public void setLanugage(String lanugage) {
		this.lanugage = lanugage;
	}



	void watch() {
		System.out.println("is Movie watchable");
	}



	@Override
	public int compareTo(Movie o) {
		return this.lanugage.compareTo(o.lanugage);
	}
	
	public String toString() {
		return " name: " + name + " genere: " + genere + " showtimings: " + showtimings + " language: " + lanugage;
	}
}