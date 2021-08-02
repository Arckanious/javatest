package main;
import java.io.IOException;
import java.util.Scanner;

class Main {
	private static Scanner keyboard  = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Specify the parameter to make search: ");
		String find = keyboard.next();
		URLConection urlConnection = new URLConection(find);

    	try {
			urlConnection.connect();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
    	
    	String data = urlConnection.getGETMethod();
    	
        //int occurencies = countOccurrencies(data, find);
    	int occurencies = data.toLowerCase().split(find, -1).length - 1;

    	System.out.println(occurencies);
        
        return;
	}
	
	/*public static int countOccurrencies(String data, String find) {
		int occurencies = 0;
        int index = 0;
        
        while(index+find.length() < data.length() ) {
        	int found = data.indexOf(find, index);
        	if(found >= 0) {
        		occurencies++;
        		index = found + find.length();
        	}else {
        		break;
        	}
        }
        
        return occurencies;
	}*/
	
}