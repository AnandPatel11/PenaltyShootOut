import java.util.Scanner;

class penaltyshootout
{
	
	Scanner scan=new Scanner(System.in);
	String enterkey;
	String teamname;
	
		int max=3;
		int min=1;
		int myscore;
		int compscore;
	
	void iamstriker()
	{
		
		
		System.out.println("\n\n\nYou are the kick taker\nPress 1 to kick on left side of goal post\nPress 2 to kick in the middle of the goal post\nPress 3 to kick on the right side of the goal post");
		int aa = scan.nextInt();
		
		//int a = (int)Math.floor(Math.random() * ((max-min)+1) + min); // formula for getting random number between two numbers is Math.floor(Math.random() * (max - min)) + min;
		int a = (int)Math.floor(Math.random() * ((max-min)+1) + min); // formula for getting random number between two numbers is Math.floor(Math.random() * (max - min)) + min;
	
		if(a!=aa)
		{
			System.out.println("\n\n\nGoallllll");
			myscore++;
		}
		else
		{
			System.out.println("\n\n\nOops missed");
			
		}
//System.out.println("a: "+a);		
		switch(a)
		{
			case 1:
			System.out.println("Computer goal keeper went to left side of the goal post\n");
			break;
			case 2:
			System.out.println("Computer goal keeper stayed on the middle of the goal post\n");
			break;
			case 3:
			System.out.println("Computer goal keeper went to right side of the goal post\n");
			break;
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Scores are:   "+teamname+"  "+myscore+" - "+compscore+"  Computer FC");
		System.out.println("--------------------------------------------------------\n");
	}
	
	
	void iamkeeper()
{
		System.out.println("\n\n\nYou are the Goal Keeper\nPress 1 to dive on left side of goal post\nPress 2 to stay in the middle of the goal post\nPress 3 to dive on the right side of the goal post");
		int dd = scan.nextInt();
		int d = (int)Math.floor(Math.random() * ((max-min)+1) + min); // formula for getting random number between two numbers is Math.floor(Math.random() * (max - min)) + min;
		
		if(d!=dd)
		{
			System.out.println("\n\n\nOops opponent scores");
			compscore++;
		}
		else
		{
			System.out.println("\n\n\nNice save");
			
		}
		switch(d)
		{
			case 1:
			System.out.println("Computer kick taker kicked on the left side of the goal post\n");
			break;
			case 2:
			System.out.println("Computer kick taker kicked on the middle of the goal post\n");
			break;
			case 3:
			System.out.println("Computer kick taker kicked on the right side of the goal post\n");
			break;
			}
			
		System.out.println("--------------------------------------------------------");
		System.out.println("Scores are:   "+teamname+"  "+myscore+" - "+compscore+"  Computer FC");
		System.out.println("--------------------------------------------------------\n");
			}
		void results()
		{	
		
		if(myscore>compscore)
		{
			System.out.println("Congratulations your team "+teamname+" wins!!!");
		}
		else if(myscore<compscore)
		{
			System.out.println("Sorry better luck next time. Your team "+teamname+" loses!!!");
		}
			else
			{
				System.out.println("Very well there is a TIE between "+teamname+" and Computer FC");
			}
			for( int x=1; myscore==compscore ;x++) 
				{
							System.out.println("Press Enter when ready to take the position of Penalty Kick Taker");
		enterkey = scan.nextLine();
		String kkk = scan.nextLine();
		
		
		System.out.println("\n\n\nYou are the kick taker\nPress 1 to kick on left side of goal post\nPress 2 to kick in the middle of the goal post\nPress 3 to kick on the right side of the goal post");
		int kk = scan.nextInt();
		int k = (int)Math.floor(Math.random() * ((max-min)+1) + min); // formula for getting random number between two numbers is Math.floor(Math.random() * (max - min)) + min;
		if(k!=kk)
		{
			System.out.println("\n\n\nGoallllll");
			myscore++;
		}
		else
		{
			System.out.println("\n\n\nOops missed");
			
		}
		switch(k)
		{
			case 1:
			System.out.println("Computer goal keeper went to left side of the goal post\n");
			break;
			case 2:
			System.out.println("Computer goal keeper stayed on the middle of the goal post\n");
			break;
			case 3:
			System.out.println("Computer goal keeper went to right side of the goal post\n");
			break;
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Scores are:   "+teamname+"  "+myscore+" - "+compscore+"  Computer FC");
		System.out.println("--------------------------------------------------------\n");
		
		
			System.out.println("Press Enter when ready to take the position of Goalkeeper");
			enterkey = scan.nextLine();
		String lll = scan.nextLine();
		
		System.out.println("\n\n\nYou are the Goal Keeper\nPress 1 to dive on left side of goal post\nPress 2 to stay in the middle of the goal post\nPress 3 to dive on the right side of the goal post");
		int ll = scan.nextInt();
		int l = (int)Math.floor(Math.random() * ((max-min)+1) + min); // formula for getting random number between two numbers is Math.floor(Math.random() * (max - min)) + min;
		
		if(l!=ll)
		{
			System.out.println("\n\n\nOops opponent scores");
			compscore++;
		}
		else
		{
			System.out.println("\n\n\nNice save");
			
		}
		switch(l)
		{
			case 1:
			System.out.println("Computer kick taker kicked on the left side of the goal post\n");
			break;
			case 2:
			System.out.println("Computer kick taker kicked on the middle of the goal post\n");
			break;
			case 3:
			System.out.println("Computer kick taker kicked on the right side of the goal post\n");
			break;
			}
			
		System.out.println("--------------------------------------------------------");
		System.out.println("Scores are:   "+teamname+"  "+myscore+" - "+compscore+"  Computer FC");
		System.out.println("--------------------------------------------------------\n");
				
				{
			if(myscore>compscore)
		{
			System.out.println("Congratulations your team "+teamname+" wins!!!");
		}
		else if(myscore<compscore)
		{
			System.out.println("Sorry better luck next time. Your team "+teamname+" loses!!!");
				
			}
			
			}
			}
	System.out.println("Game Over");
			}
		
	

	
	
	
	
	
	
	
	
	 







	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		penaltyshootout ob = new penaltyshootout();
		
		System.out.println("		 _______   _______	                                  _________  ");
		System.out.println("		|       | |         |\\      |         /\\         |            |      \\      /");
		System.out.println("		|       | |         | \\     |        /  \\        |            |       \\    /");
		System.out.println("		|       | |         |  \\    |       /    \\       |            |        \\  /");
		System.out.println("		|_______| |_______  |   \\   |      /______\\      |            |         \\/");
		System.out.println("		|	  |         |    \\  |     /        \\     |            |         /");
		System.out.println("		|	  |         |     \\ |    /          \\    |            |        /");
		System.out.println("		|	  |         |      \\|   /            \\   |            |       /");
		System.out.println("		|	  |_______  |       |  /              \\  |______      |      /\n\n\n");
		System.out.println("              _______             _______   _______   _________  _______              _________");
		System.out.println("             |         |       | |       | |       |      |     |       | |        |      |");
		System.out.println("             |         |       | |       | |       |      |     |       | |        |      |");
		System.out.println("             |         |       | |       | |       |      |     |       | |        |      |");
		System.out.println("             |_______  |_______| |       | |       |      |     |       | |        |      |");
		System.out.println("                     | |       | |       | |       |      |     |       | |        |      |");
		System.out.println("                     | |       | |       | |       |      |     |       | \\        /      |");
		System.out.println("                     | |       | |       | |       |      |     |       |  \\      /       |");
		System.out.println("              _______| |       | |_______| |_______|      |     |_______|   \\____/        |\n\n\n");
		
		
		
		System.out.println("                                               Anand Patel 10-G\n\n\n");
		
		System.out.println("Press enter to play");
		String enterkey = scan.nextLine();
		System.out.println("\n\n\nInput name to your Football Club");
		ob.teamname = scan.nextLine();
		
		
		int max = 3;
		int min = 1;
		int myscore = 0;
		int compscore = 0;
		System.out.println("");
		
		
		
		    ob.iamstriker();
			ob.iamkeeper();
			/*ob.iamstriker();
			ob.iamkeeper();
			ob.iamstriker();
			ob.iamkeeper();
			ob.iamstriker();
			ob.iamkeeper();
			ob.iamstriker();
			ob.iamkeeper();*/
			ob.results();
			//int mine = ob.results(myscore);
			//int yours = ob.results(compscore);
			//System.out.println("abc"+mine+yours);
		
				
			
	}
	
}


	

