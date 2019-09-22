package speiser_p3;
import java.util.Scanner;

public class RatingTopics {
	public static void main (String [] args) {
		
		Scanner userData = new Scanner (System.in);
		String topics[] = {"Video Games", "Movies", "Shows", "News", "Furniture"};
		int score;
		int responses [] [] = new int [5][11];
		int userInput = 0;
		int numUsers = 0;
		int sumGames=0, sumMovies=0, sumShows=0, sumNews=0, sumFurniture=0;
		double avgGames, avgMovies, avgShows, avgNews, avgFurniture;
		boolean exit = false;
		
		System.out.println("If you would like to add a user to the poll, press 1. To exit, press 2. ");
		userInput = userData.nextInt();
		
		do {
			switch(userInput) {
		
			case 1:
				numUsers +=1;
				System.out.println("Enter rating for Video Games. (1-10)");
				score = userData.nextInt();
				responses[0][score]++;
				
				System.out.println("Enter rating for Movies. (1-10)");
				score = userData.nextInt();
				responses[1][score]++;
				
				System.out.println("Enter rating for Shows. (1-10)");
				score = userData.nextInt();
				responses[2][score]++;
				
				System.out.println("Enter rating for News. (1-10)");
				score = userData.nextInt();
				responses[3][score]++;
				
				System.out.println("Enter rating for Furniture. (1-10)");
				score = userData.nextInt();
				responses[4][score]++;
				
				System.out.println("Done. Press 1 for next user. Press 2 to exit and see poll results.");
				userInput = userData.nextInt();
				break;
			
			case 2:
				exit = true;
				break;
		
			default:
				System.out.println("Invalid Input");
			
			}
			
		}while(!exit);
		
		userData.close();
		
		for (int counter = 1; counter < 10; counter++ ) {
			sumGames += (responses[0][counter]) * counter;
		}
		for (int counter = 1; counter < 10; counter++ ) {
			sumMovies += (responses[1][counter]) * counter;
		}
		for (int counter = 1; counter < 10; counter++ ) {
			sumShows += (responses[2][counter]) * counter;
		}
		for (int counter = 1; counter < 10; counter++ ) {
			sumNews += (responses[3][counter]) * counter;
		}
		for (int counter = 1; counter < 10; counter++ ) {
			sumFurniture += (responses[4][counter]) * counter;
		}
		
		avgGames = sumGames / numUsers;
		avgMovies = sumMovies / numUsers;
		avgShows = sumShows / numUsers;
		avgNews = sumNews / numUsers;
		avgFurniture = sumFurniture / numUsers;
		
		
		System.out.printf("                 1 2 3 4 5 6 7 8 9 10 | Average");
        System.out.printf("\n__________________________________________");
        System.out.printf("\nVideo Game %d %d %d %d %d %d %d %d %d %d | %.2f", responses[0][1], responses[0][2], responses[0][3], responses[0][4], responses[0][5], responses[0][6], responses[0][7], responses[0][8], responses[0][9], responses[0][10], avgGames);
        System.out.printf("\nMovies     %d %d %d %d %d %d %d %d %d %d | %.2f", responses[1][1], responses[1][2], responses[1][3], responses[1][4], responses[1][5], responses[1][6], responses[1][7], responses[1][8], responses[1][9], responses[1][10], avgMovies);
        System.out.printf("\nShows      %d %d %d %d %d %d %d %d %d %d | %.2f", responses[2][1], responses[2][2], responses[2][3], responses[2][4], responses[2][5], responses[2][6], responses[2][7], responses[2][8], responses[2][9], responses[2][10], avgShows);
        System.out.printf("\nNews       %d %d %d %d %d %d %d %d %d %d | %.2f", responses[3][1], responses[3][2], responses[3][3], responses[3][4], responses[3][5], responses[3][6], responses[3][7], responses[3][8], responses[3][9], responses[3][10], avgNews);
        System.out.printf("\nFurniture  %d %d %d %d %d %d %d %d %d %d | %.2f", responses[4][1], responses[4][2], responses[4][3], responses[4][4], responses[4][5], responses[4][6], responses[4][7], responses[4][8], responses[4][9], responses[4][10], avgFurniture);
        System.out.printf("\n_________________________________________|");
		
		
	
	
	}
}
