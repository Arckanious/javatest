package main;
import java.util.Scanner;

class Main {
	private static Scanner keyboard;

	public static void main(String args[]) {
		keyboard = new Scanner(System.in);

		System.out.println("Nome: ");
		String userName = keyboard.nextLine();
		
		System.out.println("Age: ");
		int userAge = Integer.parseInt(keyboard.nextLine());
		
		Person person = new Person(userAge, userName);
		
		while(true) {
			System.out.println(person.getName() + " please type the direction wanted (r, l, u, d) or any other letter to quit the program: ");
			String input = keyboard.nextLine();
			char direction = input.charAt(0);
			
			switch (direction) {
			case 'r':
				person.andar(Directions.RIGHT);
				break;
			case 'l':
				person.andar(Directions.LEFT);
				break;
			case 'u':
				person.andar(Directions.UP);
				break;
			case 'd':
				person.andar(Directions.DOWN);
				break;

			default:
				return;
			}
		}
		
	}
	
}