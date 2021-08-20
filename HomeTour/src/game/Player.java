package game;

import fixtures.Room;

public class Player {

	private Room currentRoom;

	public void init() {
		
		RoomManager rm = new RoomManager();
		rm.init();
		//set player starting room
		setCurrentRoom(rm.startingRoom);
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
}
