import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Player - a room in an adventure game.
 *
 * Represents an item in the game.
 * 
 * @author  
 * @version 2026.04.29
 */

public class Player 
{
    private Room currentRoom;

    
    /**
     * Create an Player with a starting room
     * 
     * @param description the Items's description.
     * @param weight the room's weight
     */
    public Player(Room startingRoom) 
    {
        currentRoom= startingRoom;
    }

    /**
     * @return the the room player is in
     * (the one that was defined in the constructor).
     */
    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    /**
     * Set player's new location
     * @param room The new room player is in
     * 
     */
    public void setCurrentRoom(Room  room)
    {
        currentRoom = room;
    }
    
}

