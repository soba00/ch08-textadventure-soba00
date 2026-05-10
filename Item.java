import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Item - an item in the game world
 *
 * Represents an item in the game with description and weight
 * 
 * @author  Federico Cadavid Rojas
 * @version 2026.04.29
 */

public class Item 
{
    private String description;
    private int weight;
    
    /**
     * Create an Item described "description" with weight "weight"
     * 
     * @param description the Items's description.
     * @param weight the room's weight
     */
    public Item(String description, int weight) 
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * @return the description of the item
     * (the one that was defined in the constructor).
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the weight of the item
     * (the one that was defined in the constructor).
     */
    public int getWeight()
    {
        return weight;
    }
    
}

