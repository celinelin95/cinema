package cinema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Showtime {


	
public String moviename;
public String cineplex;
public int hall;
public int showtime;

public String getmovie() {
	
return this.moviename;
}

public String getcineplex() 

{
return this.cineplex;
}

	
public int getshowtime() {
	
	return this.showtime;
}

public int gethalls()

{
	return this.hall;
}



public static void showlist(){



	


ArrayList<String> arrayList = new ArrayList<>();
try (Scanner s = new Scanner(new File("fileName")).useDelimiter("\\s*-\\s*")) {
    while (s.hasNext()) {
        arrayList.add(s.next());
    }
}
catch (FileNotFoundException e) {
    // Handle the potential exception
}


Cinema cinema = new Cinema();
	


if (cinema.getcinema()== 1 && cinema.getcineplex()== "Lido") {
		
		//print list
	}

if (cinema.getcinema()== 2 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 3 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 4 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 5 && cinema.getcineplex()== "Lido") {
	
	//print list
}

if (cinema.getcinema()== 6 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 7 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 8 && cinema.getcineplex()== "Lido") {
	
	//print list
}


if (cinema.getcinema()== 1 && cinema.getcineplex()== "Jewel") {
	
	//print list
}


if (cinema.getcinema()== 1 && cinema.getcineplex()== "Jewel") {
	
	//print list
}


if (cinema.getcinema()== 2 && cinema.getcineplex()== "Jewel") {
	
	//print list
}

if (cinema.getcinema()== 3 && cinema.getcineplex()== "Jewel") {
	
	//print list
}


if (cinema.getcinema()== 4 && cinema.getcineplex()== "Jewel") {
	
	//print list
}


if (cinema.getcinema()== 5 && cinema.getcineplex()== "Jewel") {
	
	//print list
}


if (cinema.getcinema()== 1 && cinema.getcineplex()== "PayaLabar") {
	
	//print list
}

if (cinema.getcinema()== 2 && cinema.getcineplex()== "PayaLabar") {
	
	//print list
}


if (cinema.getcinema()== 3 && cinema.getcineplex()== "PayaLabar") {
	
	//print list
}


if (cinema.getcinema()== 4 && cinema.getcineplex()== "PayaLabar") {
	
	//print list
}


if (cinema.getcinema()== 5 && cinema.getcineplex()== "PayaLabar") {
	
	//print list
}


if (cinema.getcinema()== 1 && cinema.getcineplex()== "WaterWay") {
	
	//print list
}


if (cinema.getcinema()== 2 && cinema.getcineplex()== "WaterWay") {
	
	//print list
}


if (cinema.getcinema()== 3 && cinema.getcineplex()== "WaterWay") {
	
	//print list
}


if (cinema.getcinema()== 4 && cinema.getcineplex()== "WaterWat") {
	
	//print list
}


if (cinema.getcinema()== 5 && cinema.getcineplex()== "WaterWay") {
	
	//print list
}


if (cinema.getcinema()== 1 && cinema.getcineplex()== "Nex") {
	
	//print list
}


if (cinema.getcinema()== 2 && cinema.getcineplex()== "Nex") {
	
	//print list
}

if (cinema.getcinema()== 3 && cinema.getcineplex()== "Nex") {
	
	//print list
}if (cinema.getcinema()== 4 && cinema.getcineplex()== "Nex") {
	
	//print list
}

if (cinema.getcinema()== 5 && cinema.getcineplex()== "Nex") {
	
	//print list
}

if (cinema.getcinema()==  1&& cinema.getcineplex()== "Tampines") {
	
	//print list
}


if (cinema.getcinema()==  1&& cinema.getcineplex()== "Tampines") {
	
	//print list
}

if (cinema.getcinema()==  2&& cinema.getcineplex()== "Tampines") {
	
	//print list
}

if (cinema.getcinema()==  3&& cinema.getcineplex()== "Tampines") {
	
	//print list
}

if (cinema.getcinema()==  4&& cinema.getcineplex()== "Tampines") {
	
	//print list
}

if (cinema.getcinema()==  5&& cinema.getcineplex()== "Tampines") {
	
	//print list
}



}
}

	









