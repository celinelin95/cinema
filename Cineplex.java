package cinema;

import java.util.Scanner;



public class Cineplex {
	   public int input;
	   public static int nextinput;
	 
	 //public cineplex() {}

	 public static void cineplexs() {
		
		System.out.println("Enter Cineplex (1-Lido , 2-Jewel , 3-Paya Labar 4- Waterway Point, 5- Nex , 6-Tampines ): ");
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		
         
	    nextinput = userinput.nextInt();  // Read user input
	    
	    System.out.println("you have enter: " + nextinput);
		
	  

	}

	 public int getInput() {
		
         return nextinput;
    }
}
