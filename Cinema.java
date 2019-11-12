package cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

	public static  int hall ;
	
	public static  int row ;
	public static  int col ;
	public static  String Cineplex ;
	public static void cinemas() {
		Cineplex cineplex= new Cineplex();
		
		
		
		
	
		 if (cineplex.getInput() == 1) {
				Cineplex = "Lido";
				ArrayList<String> Lido = new ArrayList<String>();
			    Lido.add("Hall 1");
				Lido.add("Hall 2");
				Lido.add("Hall 3");
				Lido.add("Hall 4");
				Lido.add("Hall 5");
			    Lido.add("Hall 6");
			    Lido.add("Hall 7 ");
			    Lido.add("Hall 8");
			    System.out.println("list of halls at " +Cineplex + Lido);
				
			    System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
			    
			  
			    
			    
			    
			    
			  
			}
		 else if (cineplex.getInput() == 2) {
			 Cineplex = "Jewel";
				ArrayList<String> jewel = new ArrayList<String>();
	    	    jewel.add("Hall 1");
				jewel.add("Hall 2");
				jewel.add("Hall 3");
				jewel.add("Hall 4");
				jewel.add("Hall 5");
			    
			    System.out.println("list of halls at " + Cineplex +  jewel);
			    
                System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
			    
			 
			   
				
			}
		 
		 else if (cineplex.getInput() == 3) {
			 Cineplex = " Paya Labar";
				ArrayList<String> PayaLabar = new ArrayList<String>();
	    	    PayaLabar.add("Hall 1");
				PayaLabar.add("Hall 2");
				PayaLabar.add("Hall 3");
				PayaLabar.add("Hall 4");
				PayaLabar.add("Hall 5");
			    
			    System.out.println("list of cinema at " + Cineplex + PayaLabar);
                System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
				
			}
		 

		 else if (cineplex.getInput() == 4) {
				Cineplex = "Waterway Point";
				ArrayList<String> waterway = new ArrayList<String>();
			    waterway.add("Hall 1");
				waterway.add("Hall 2");
				waterway.add("Hall 3");
				waterway.add("Hall 4");
				waterway.add("Hall 5");
			    waterway.add("Hall 6");
			    waterway.add("Hall 7 ");
			    waterway.add("Hall 8");
			    System.out.println("list of halls at " +Cineplex + waterway);
                System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
				
			}
		 

		 else if (cineplex.getInput() == 5) {
				Cineplex = "Nex";
				ArrayList<String> Nex = new ArrayList<String>();
			    Nex.add("Hall 1");
				Nex.add("Hall 2");
				Nex.add("Hall 3");
				Nex.add("Hall 4");
				Nex.add("Hall 5");
				Nex.add("Hall 6");
				Nex.add("Hall 7");
				Nex.add("Hall 8");
				Nex.add("Hall 9");
				
			    
			    System.out.println("list of halls at " +Cineplex +Nex );
                System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
			}
		 
		 else if (cineplex.getInput() == 6) {
				Cineplex = "Tampines";
				ArrayList<String> tampines = new ArrayList<String>();
			    tampines.add("Hall 1");
				tampines.add("Hall 2");
			    tampines.add("Hall 3");
				tampines.add("Hall 4");
				tampines.add("Hall 5");
			    tampines.add("Hall 6");
			    tampines.add("Hall 7 ");
			    tampines.add("Hall 8");
			    System.out.println("list of halls at " +Cineplex + tampines);
                System.out.println("Choose a Hall " );
			    
			    Scanner sc  = new Scanner(System.in);
			    hall = sc.nextInt();
			    System.out.println("You have choosen hall " + hall  );
				
			}
		 
	
		 
			
		 else {
				 System.out.println("error");
			}
		 
		

	}
	
	
	public int getcinema() {
		return hall;
		
	}
	
	public String getcineplex() {
		return Cineplex;
		
	}		
		
	}
	


