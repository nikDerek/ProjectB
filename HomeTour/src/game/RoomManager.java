package game;

import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;
	public Room[] rooms;
	
	public RoomManager(Room startingRoom, Room[] rooms) {
		super();
		this.startingRoom = startingRoom;
		this.rooms = rooms;
	}
	
	public RoomManager() {
		rooms = new Room[9];
	}

	public void init() {
		Room foyer = new Room("The Foyer", "a small foyer", "The small entryway of a post-modern house.  A dining room is open to the north"
				+ "where a large table could be seen."+"\n"
				+"Straight ahead, to the west, is the living room leading ahead to a french door overlooking the back yard."+"\n"
				+"A small hallway leading to the private chambers is immediately to the south. Kitchen is to the west");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		
				
		Room diningRoom = new Room("The Dining Room", "Place where food is eaten", "A large dining space acting as the hearth of circulation throughout the house."+"\n"
				+"It is separated from the kitchen by a service window to the west.  To the east is a thick wall"+"\n"
				+" condition with a fireplace separating it from the living room to the east. To the south is a small "+"\n"
				+"hallway leading to private chambers.");
		this.rooms[1] = diningRoom;
		
		Room kitchen = new Room("The Kitchen", "Place where food is made", "A medium sized kitchen with a large window, opening a view to the south, while serving as a backdrop"+"\n"
				+"for a small coffee table.  The west wall is occupied by kitchen appliances while "+"\n"
				+"to the east is the sink on a service wall separating it from the dining room.");
		this.rooms[2] = kitchen;
		
		Room livingRoom = new Room("The Living Room", "The main living space", "Largest room in the house located on the north-east corner with large windows and a french-door"+"\n"
				+"to the east leading to the back yard.  Fireplace on the west wall separating it from the dining room, and a "+"\n"
				+"small hallway to the south leading to the private chambers.");
		this.rooms[3] = livingRoom;
		
		Room hallway = new Room("The Hallway", "A small hallway", "Main circulation connecting public and private spaces.  To the north is the foyer through which we can see the "+"\n"
				+"dining room.  To the east is a bedroom.  West side of the hallway has the entrance to the main bathroom."+"\n"
				+"Straight ahead, to the south, is the master bedroom.");
		this.rooms[4] = hallway;
		
		Room bedroom = new Room("The Bedroom", "A small guest bedroom", "A small guest bedroom with a queen sized bed.  To the east is a large window overlooking the backyard"+"\n"
				+"to the west is the closet resting against the hallway leading to the rest of the house.");
		this.rooms[5] = bedroom;
		
		Room bathroom = new Room("The Bathroom", "Main bathroom in the house", "Full sized bathroom with bathtub and shower on the east wall.  The toilet is located on the south side,"+"\n"
				+"while the sink is resting against the west wall next to a tall narrow window. It exits to the east in the hallway");
		this.rooms[6] = bathroom;
		
		Room masterBedRoom = new Room("The Master Bedroom",  "Where master of the house sleeps", "Main bedroom located on the southern most position of the house.  There are medium sized windows"+"\n"
				+"on the east wall, looking into the back yard, and on the south wall, encasing a king size bed. On the west side"+"\n"
				+"of the room is a 3/4 bathroom.  To the north is the hallway looking straight through the foyer, into the dining room.");
		this.rooms[7] = masterBedRoom;
		
		Room smallBathroom = new Room("3/4 Bathroom", "Small bathroom", "A small bathroom with a shower, toilet and sink.  Located on the west side of the master bedroom and entered through a"+"\n"
				+"sliding door.  To the east of it is the master bedroom.");
		this.rooms[8] = smallBathroom;
	}
}
