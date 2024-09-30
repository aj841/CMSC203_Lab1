/*
* Class: CMSC203 CRN 22502
* Program: Lab 1
* Instructor: Dr. Kuijt
* Summary of Description: Movie Test Driver Task 2
* Due Date: 09/29/2024
* Integrity Pledge: I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* Name: Alex Kim
*/

import java.util.Scanner;

public class MovieDriver_Task2 {
	
	public static void main(String[] args)	{     	
		Scanner myScanner = new Scanner(System.in);
		
		//Create instance of movie to test method in Movie.java
		Movie myMovie = new Movie();
		
		String loop = "y";
		
		//Repeat until user says no
		while (loop.equals("y"))
		{
			System.out.println("Enter the name of a movie");
			myMovie.setTitle(myScanner.nextLine());
			System.out.println("Enter the rating of the movie");
			myMovie.setRating(myScanner.nextLine());
			System.out.println("Enter the number of tickets sold for this movie");
			
			//Convert string to integer
			int sold = Integer.valueOf(myScanner.nextLine());
			
			myMovie.setSoldTickets(sold);
			
			//Print out the results
			System.out.println(myMovie.toString());
			System.out.println("Do you want to enter another? (y or n)");
			
			loop = myScanner.nextLine();
		}
		
		System.out.println("Goodbye");
		
		myScanner.close();
	}
}