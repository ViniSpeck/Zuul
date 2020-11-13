package zuul;

import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
    public String getExitString(){
        String exitString = "Saídas: ";
        for(String exit : exits.keySet()){
            exitString += " " + exit;
        }
        return exitString;
    }

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param neighbor The room's description.
     */
    public void setExit(String direction, Room neighbor){
        exits.put(direction, neighbor);
    }

    public String getDescription()
    {
        return description;
    }

}
