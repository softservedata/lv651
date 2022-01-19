package Other.comparator;

import java.util.Comparator;




public class Movie implements Comparable<Movie> {
	
	
	private double rating;
	private String name;
    private int year;
    
    
 
    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return -name.compareTo(m.name);
    }
 
    public Movie()
    {
        name = "";
        rating = 0;
        year = 0;
        ;
    }
    
    public Movie(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
      
    }
 
    public double getRating() {
    	return rating; }
    
   
    public String getName()   { 
    	return name; 
    	}
    
    public int getYear()      {  
    	return year;  
    	}
   
    @Override
   	public String toString() {
 
   		return "Movie  " +  " ["+name + "	" + year +" (rating = "+rating + ") ]";
   		
   		
   	}
    
//	-------------------------------------------------------------	
	
	public class ByName implements Comparator<Movie>{
	    @Override
	    public int compare(Movie m1, Movie m2) {
	        return m1.name.compareTo(m2.name);
	    }
	}

	public class ByYear implements Comparator<Movie>{
	    @Override
	    public int compare(Movie m1, Movie m2) {
	        return m1.getYear() - m2.getYear();
	    }
	}

  
    
}