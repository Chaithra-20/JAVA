package ShadowingProgramming;

import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie name");
		String movieName=sc.nextLine();
		System.out.println("Enter Director name");
		String directorName=sc.nextLine();
		System.out.println("Enter movie language");
		String movieLanguage=sc.nextLine();
		System.out.println("Enter Actor name");
		String actorName=sc.nextLine();
		System.out.println("Enter Actress name");
		String actressName=sc.nextLine();
		System.out.println("Enter the duration of the movie");
		int duration=sc.nextInt();
		System.out.println("Enter the film category");
		sc.nextLine();
		String filmCategory=sc.nextLine();
		System.out.println("Enter the release date of the movie");
		String releaseDate=sc.nextLine();
		System.out.println("Enter the cost of 1 ticket for the movie in theatre");
		int cost=sc.nextInt();
		System.out.println("Enter the theatre");
		sc.nextLine();
		String theatre=sc.nextLine();
		
		Movie m1=new Movie(movieName,directorName,movieLanguage,actorName,actressName,duration,filmCategory,releaseDate,cost,theatre);
		System.out.println(m1.movieName+" "+m1.directorName+" "+m1.movieLanguage+" "+m1.actorName+" "+m1.actressName+" "+m1.duration+" "+m1.filmCategory+" "+m1.releaseDate+" "+m1.cost+" "+m1.theatre);
		m1.casting();
		m1.releasing();
		

	}

}
