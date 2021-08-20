package game;

import java.util.Map;
import java.util.Scanner;

import fixtures.Room;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	
	//takes user input and splits/stores it into an array
		private static String[] collectInput(Player player) {
			String input = scanner.nextLine();
			String[]actionAndTarget = input.split(" ");
		
			return actionAndTarget;
			
		}
	
	
	
	//prints the room object with its exits
	private static Map<String, Room> printRoom(Player player) {
		
		Room room = new Room(player.getCurrentRoom().getName(), player.getCurrentRoom().getShortDescription(), player.getCurrentRoom().getLongDescription());
		
		System.out.println(player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		
		Map<String, Room> exits = room.getExits(player.getCurrentRoom());
		
		return exits;
	}
	
	
	
	//
	/*private static boolean parse(String[] controller, Player player, Map<String, Room> exits) {
		
		Room room = new Room(null, null, null);
		Room currentRoom = null;
		String action = controller[0];
		
		
		switch(action) {
		case "go":
				currentRoom = room.getExit(controller[1], exits, player);
				player.setCurrentRoom(currentRoom);
			break;
		
		case "quit":
			System.out.println("Goodbye");
			return false;
		}
		
		
		return true;
		
		
	}*/
	
	//the driver
		public static void main(String[] args) {
		
			
			Player player = new Player();
			player.init();
			boolean gameIn = true;
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Welcome! To move around the house, use <go> along with <North>, <South>, <East>, OR <West> in order to get where you want to go!");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			
			while(gameIn) {

				String[] controller = null;
				Map<String, Room> exits = printRoom(player);
				controller = collectInput(player);
				//
				//parse(controller, player, exits);
			}
					
		}
}
