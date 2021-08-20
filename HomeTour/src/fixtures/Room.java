package fixtures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.Player;
import game.RoomManager;

public class Room extends Fixture {
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

	}
	
	//create map object for each room in order to'map-out' the exits
	Map<String, Room> foyer = new HashMap<>();
	Map<String, Room> diningRoom = new HashMap<>();
	Map<String, Room> kitchen = new HashMap<>();
	Map<String, Room> livingRoom = new HashMap<>();
	Map<String, Room> hallway = new HashMap<>();
	Map<String, Room> bedroom = new HashMap<>();
	Map<String, Room> bathroom = new HashMap<>();
	Map<String, Room> masterBedRoom = new HashMap<>();
	Map<String, Room> smallBathroom = new HashMap<>();

	
	
	
	public void init() {
		RoomManager rm = new RoomManager();
		rm.init();
		
		//'mapping-out' exits
		foyer.put("North", rm.rooms[1]);
		foyer.put("West", rm.rooms[2]);
		foyer.put("South", rm.rooms[4]);
		
		diningRoom.put("South", rm.rooms[0]);
		diningRoom.put("West", rm.rooms[2]);
		
		kitchen.put("West", rm.rooms[1]);
		
		livingRoom.put("West", rm.rooms[1]);
		livingRoom.put("South", rm.rooms[4]);
		
		hallway.put("North", rm.rooms[1]);
		hallway.put("South", rm.rooms[7]);
		hallway.put("East", rm.rooms[5]);
		hallway.put("West", rm.rooms[6]);
		
		bedroom.put("West", rm.rooms[4]);
		
		bathroom.put("East", rm.rooms[4]);
		
		masterBedRoom.put("West", rm.rooms[8]);
		masterBedRoom.put("North", rm.rooms[4]);
		
		smallBathroom.put("East", rm.rooms[7]);
	}
	
	//print room exits in current room and return map of the current room
	public Map<String, Room> getExits(Room currentRoom){
		
		init();
		String s = currentRoom.getName();
		RoomManager rm = new RoomManager();
		rm.init();
		
	
		switch (s){
		case "The Foyer":
			for(Entry<String, Room> entry : foyer.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return foyer;
			
		case "The Dining Room":
			for(Entry<String, Room> entry : diningRoom.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return diningRoom;
			
		case "The Kitchen":
			for(Entry<String, Room> entry : kitchen.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return kitchen;
		
		case "The Living Room":
			for(Entry<String, Room> entry : livingRoom.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return livingRoom;

		case "The Hallway":
			for(Entry<String, Room> entry : hallway.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return hallway;
			
		case "The Bedroom":
			for(Entry<String, Room> entry : bedroom.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return bedroom;
			
		case "The Bathroom":
			for(Entry<String, Room> entry : bathroom.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue().getName());
			}
			return bathroom;
		}
		
		return null;
	}

	//if direction entered is valid returns the the room of choice
	/*public Room getExit(String direction, Map<String, Room> Room, Player player) {
		
		init();
		Room room = player.getCurrentRoom();
		RoomManager rm = new RoomManager();
		rm.init();
		//valid direction loop
		for(Entry<String, Room> entry : Room.entrySet()) {
			String s = entry.getKey().toString();
			if(s.equals(direction)) {
				room = entry.getValue();
				return room;
			}
		}
		System.out.println("Invalid entry. Please enter a valid direction choice provided.");	
		return room;
	}*/
	
}
