package in.ineuron;

import java.util.Scanner;

class ContextDetails {
	int contexts = 2;
	int[] size = new int[] { 5, 6 };
	int[] vacancy = new int[] { 5, 0 };
}


class Player {
	int guessedNumbers[] = new int[5];
}


class Umpire
{
	public void winner(int []numbers)
	{
		int guesser;
		Scanner s= new Scanner(System.in);
		System.out.println("guesser guess the number");
		guesser=s.nextInt();

		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==guesser)
			System.out.println("palyer"+i+"win");
			else
				System.out.println("player"+i+"lost");
		}
	}
}
public class GuesserGame extends ContextDetails {

	public void contextOne(Scanner s,Player p,int id) {
		System.out.println("Hi player" + id + ",Welcome to the context of team size 5");
		System.out.println("Please enter the your number according to your guess");
		int num=s.nextInt();
		p.guessedNumbers[id-1]=num;		
	}
	

	public static void main(String[] args) {

		char skipTour;
		Scanner s = new Scanner(System.in);
		GuesserGame g = new GuesserGame();
		Player p = new Player();
		Umpire u= new Umpire();

		for (int j = 0; j < p.guessedNumbers.length; j++) {
			System.out.println("Hello player"+(j+1)+"Welcome to the gusser game ");
			System.out.println("Want the high level info again select y/n:");
			skipTour = s.next().charAt(0);
			switch (skipTour) {
			case 'y':
				System.out.println("welcome to the tour");
				System.out.println("The below are the details of the game");
				System.out.println("There will be players who guess the game and a guesser who guess's"
						+ "the game, the player who guess the number correctly will win the game");
				break;
			case 'n':
				System.out.println("Redirecting to game");
				break;
			}

			System.out.println("Are you ready for the game if yes please enter yes or else enter no");
			
			String ready=s.next();
			if ( ready.equals("yes"))
			{
				System.out.println("Currently " + g.contexts + "contexts are running based on vvacancy you will be mapped");
					
				for (int i = 0; i < g.contexts; i++) 
				System.out.println("contex" + (i + 1) + "Team Size" + g.size[i] + g.vacancy[i]);
				System.out.println("You are being mapped to context1");
					g.vacancy[0]=g.vacancy[0]-1;
					g.contextOne(s,p,j+1);
			}
			else
			{
				System.out.println("visit us again when you want to play the game");
			}

}
		u.winner(p.guessedNumbers);
	}
}