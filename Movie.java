class Movie {
public Movie() {
this("Bahubali");
System.out.println("No argsconstructor");
}
public Movie(String title) {
this(9,2015);
System.out.println("title of movie" + title);
}
public Movie(double rating, int year) {
System.out.println("ratings "+ rating+"released in the Year  " + year);
    }
}
