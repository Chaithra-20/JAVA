package com.kodnest.day6.game;

public class Player {
	
		static String name;
		static int level;
		static int healthPoint;
		
		public static void levelUp()
		{
			level++;
		}
	
		public static void main(String [] args)
		{
			Player player1 = new Player();
			player1.levelUp();
			Player player2 = new Player();
			player2.levelUp();
			Player player3 = new Player();
			player3.levelUp();
			
			System.out.println(level);
		}
	

}
