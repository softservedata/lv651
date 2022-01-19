package Other.comparable;

 

public class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return -name.compareTo(m.name);
    }
 
    // Constructor
    public Movie(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
 
    // Getter methods for accessing private data
    public double getRating() {
    	return rating; }
   
    public String getName()   { 
    	return name; }
    
    public int getYear()      {  
    	return year;  }
}
 
// Driver class
