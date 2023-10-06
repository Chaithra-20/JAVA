package ShadowingProgramming;

public class Movie {
	
	String movieName;
	String directorName;
	String movieLanguage;
	String actorName;
	String actressName;
	int duration;
	String filmCategory;
	String releaseDate;
	int cost;
	String theatre;
	
	public Movie(String movieName, String directorName, String movieLanguage, String actorName, String actressName,
			int duration, String filmCategory, String releaseDate, int cost, String theatre) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.movieLanguage = movieLanguage;
		this.actorName = actorName;
		this.actressName = actressName;
		this.duration = duration;
		this.filmCategory = filmCategory;
		this.releaseDate = releaseDate;
		this.cost = cost;
		this.theatre = theatre;
		
		
	}
	
	void casting()
	{
		System.out.println("The movie "+movieName+" is directed by "+directorName+" , " +actorName+" who plays a lead role in movie ");
		
	}
	
	void releasing()
	{
		System.out.println("The movie "+movieName+" is releasing on "+releaseDate+" in "+theatre+"  theatre which costs for 1 ticket is "+cost+" rs");
	}
}
