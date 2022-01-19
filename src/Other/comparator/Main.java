package Other.comparator;

import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String[] args)
    {
   
    	
        ArrayList<Movie> movieList = new ArrayList<Movie>();
       

        movieList.add(new Movie("Force Awakens",	 8.3,	2015));
        movieList.add(new Movie("Star Wars", 		 8.7, 	1977));
        movieList.add(new Movie("Empire Strikes", 	 8.8, 	1980));
        movieList.add(new Movie("Rokky Ralboa", 	 8.4, 	1983));
        movieList.add(new Movie("Matrix: Reload", 	 6.6, 	2000));
        movieList.add(new Movie("Terminator", 		 8.4, 	1992));
 
       
 
       
        for (Movie movie: movieList)
        {
            System.out.println(movie);
        }
        
        
        System.out.println(" : ");
        System.out.println(" : ");
        
        System.out.println("Movies after sorting ByYear: ");
        System.out.println(" : ");
        System.out.println(" : ");
  
        Collections.sort(movieList, new Movie().new ByYear() );
        
                
        for (Movie movie: movieList)
        {
            System.out.println(movie);
        }
        
        
        System.out.println(" : ");
        System.out.println(" : ");
        
        System.out.println("Movies after sorting ByName: ");
        System.out.println(" : ");
        System.out.println(" : ");
  
        Collections.sort(movieList, new Movie().new ByName() );
        
                
        for (Movie movie: movieList)
        {
            System.out.println(movie);
            }
    }
}