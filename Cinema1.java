package cinema;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Cinema1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int choices;
		Cineplex cineplex = new Cineplex();
		Cinema cinema = new Cinema();
		Chooseseat chooseseat = new Chooseseat();
		//BoxLayoutExample2 BoxLayoutExample2 = new BoxLayoutExample2();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("(1) choose cineplex");
			System.out.println("(2) show hall");
			System.out.println("(3) chooseseat");
			
			
			System.out.println("Enter the number of your choice: ");
			choices = sc.nextInt();
			
			switch(choices) {
				case 1: 
					cineplex.cineplexs();
					break;
				case 2: 
					cinema.cinemas();
					break;
				case 3: 
					chooseseat.display();;
					break;
					

	
		
	}
} while(choices<4);
}
}
	


