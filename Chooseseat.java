package cinema;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
public class Chooseseat {
 Cinema Cinema = new Cinema();
 

 public void display() throws Exception ,FileNotFoundException, IOException, ClassNotFoundException {
	
	 
	 String grid [][]= {
			 {"00","01","02","03","04","05","06","07","08","09"},
			 {"10","11","12","13","14","15","16","17","18","19"},
			 {"20","21","22","23","24","25","26","27","28","29"},
		
			};
	 
	//  ObjectInputStream in = new ObjectInputStream(new FileInputStream("grid.txt"));
	  //grid[] array = (grid[]) in.readObject();
	  //in.close();
	  
	 int row1 = 0;
	 int col1 = 0;
	 int seatnum;
	 //int colnum;
	 
	// grid = new int[cinema.rowno()][cinema.colno()];
	 
	 Cinema.getcinema();
	 Cinema.getcineplex();
	 
	if(Cinema.getcinema() == 1 && Cinema.getcineplex() == "Lido") {
	 
	 Scanner sc1 = new Scanner(new BufferedReader(new FileReader(".\\src\\lido1.txt")));
     
     while(sc1.hasNextLine()) {
        for (int i=0; i<grid.length; i++) {
           String[] line = sc1.nextLine().trim().split(" ");
           for (int j=0; j<line.length; j++) {
              grid[i][j] = line[j];
           }
        }
     }
     System.out.println(Arrays.deepToString(grid));
	 }
	

	 System.out.print(" you have choosen " +Cinema.getcineplex() );
	 System.out.println();
	 System.out.print(" HAll " + Cinema.getcinema());
	 System.out.println();
	 
	 System.out.printf("=========================================");
	 System.out.println();
	for (row1 = 0;  row1 < 3 ; row1++) {
		
		
	    for (col1 = 0; col1 < 10; col1++) {
	    	 
	    	  System.out.printf( "["+grid[row1][col1]+"]");
	    }
	    System.out.println();
	}
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Seat number: ");
	seatnum = sc.nextInt();    
	System.out.print(seatnum);
	
	
	if(Cinema.getcinema() == 1 && Cinema.getcineplex() == "Lido")	{
for (row1 = 0;  row1 < 3 ; row1++) {

	
		
	    for (col1 = 0; col1 < 10; col1++) {
	    	 
	    	  //if ( Integer.toString(seatnum) == grid[row1][col1] ) {
	    	//   String seatnums = Integer.toString(seatnum);
	    	
	    	
	    		  
	    			
	    		  
	    		 //System.out.printf("you have choosen " + str2 );
	    		  PrintWriter writer = null;
	    		  try
	    			{
	    			  writer = new PrintWriter(".\\src\\lido1.txt");
	    				for (int i = 0; i<grid.length; i++){
	    		        	      for(int j = 0; j<grid[i].length; j++){
	    		        	    	  
	    		        	    	  String str1 = grid[i][j];
	    		        		    	
	    		        		    	String str2 = Integer.toString(seatnum);
	    		        		    		 
	    		        	    	  if ( str1.equals(str2)  ) {
	    		        	    		  grid[i][j] = "xx";
	    		        	    	  
	    		        	    	  }
	    		        	    	  writer.print(grid[i][j] + ",");
	    		        	      }writer.println();
	    		        	     
	    		        	      }	
	    			}
	    			catch (FileNotFoundException e){
	    				System.out.println("Error: " + e.getMessage());			
	    			} 
	    		  finally
	    				  {
	    	                          try{if (writer!=null) writer.close(); } 
	    	                         catch (Exception e) {System.out.println("Could not close writer");}
	    	                }
	    		}
	    	}
	    				  
	    		  
	    		


 }
	    	  
	    	  
	    System.out.println();
	    for (row1 = 0;  row1 < 3 ; row1++) {
			
			
		    for (col1 = 0; col1 < 10; col1++) {
		    	 
		    	  System.out.printf( "["+grid[row1][col1]+"]");
		    }
		    System.out.println();
		}



	
	
}

}

/*package MovieBookings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class chooseseat {
cinema cinema = new cinema();
 

	 public void display() throws FileNotFoundException, IOException {
		
		 int[][] seats = new int[5][];
		 seats[0] = new int[10];
		 seats[1] = new int[10];
		 seats[2] = new int[10];
		 seats[3] = new int[10];
		 seats[4] = new int[10];
		 char i = 'a';
		 int j = 0, getI;
		 while(Character.compare(i, 'e') == 0) {
			 getI = Character.getNumericValue(i);
			 while(j < 10) {
				 System.out.print(seats[getI][j]);
				 j++;
			 }
			 i = (char)(i+1);
		 }
				 
		
		 
	 }
}*/