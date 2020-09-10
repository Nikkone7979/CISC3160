import java.util.*;
import java.io.*;
import java.lang.Math;

//Some notes:
//I'm sorting a .csv file as a .txt file, I'm reading the file into a br object and printing out every value (separated by a comma)
//but only printing the values that are kept track of, and divisible, by a counter of 5 (Because there are 5 columns)
//By Youness Elwiddi

public class SortSpotify {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\SpotifyData.txt"));
		    String line = null;
		    int x = 0;
		    int y = 1;
		    while ((line = br.readLine()) != null) {
		      String[] values = line.split(",");
		      for (String str : values) {
		    	if (x % 5 == 0) {
		    		System.out.print("Track rank: ");
		    		System.out.print(str);
		    		System.out.println();
		    		}
		    	x++;
		      }
		      for (String str : values) {
			    if (y % 5 == 0) {
			    	System.out.print("Track link: ");
			    	System.out.print(str);
			    	System.out.println();
			    	}
			    y++;
			    }
		    }
		    br.close();
	}
}
