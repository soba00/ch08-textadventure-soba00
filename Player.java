import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
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
    private ArrayList<Item> items;

    
    /**
     * Create an Player with a starting room
     * 
     * @param description the Items's description.
     * @param weight the room's weight
     */
    public Player(Room startingRoom) 
    {
        currentRoom= startingRoom;
        items = new ArrayList<>();
    }

    
    /**
     * add an Item to this Player's inventory.
     * @param item The item being added.
     */
    public void addItem(Item item) 
    {
        items.add(item);
    }

    /**
     * Remove an Item from this Player's inventory.
     * @param item The item being removed.
     */
    public void removeItem(Item item) 
    {
        items.remove(item);
    }

    /**
     * Return a string describing the room's items, for example
     * "Items: Halleck's Poleaxe, Catnip of Darkvision".
     * Based of getExitString()
     * @return Details of the room's exits.
     */
    private String openInventory()
    {
        if(items.isEmpty()) {
         return "You see only lint and dust in your empty inventory";   
        }
        
        String returnString = "You are carrying: \n";
        
        for(Item item : items) {
            returnString += " " + item.getDescription();
        }
        return returnString;
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

