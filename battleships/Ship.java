
/**
 * Write a description of class Ship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ship
{
  // instance variables - replace the example below with your own
    private char shipType;
    private char shipAlignment;
    private int shipRow;
    private int shipColumn;
    private int shipDamage;

    /**
     * Constructor for objects of class Ship, taking in shipType as a parameter
     */
    public Ship(char shipType, int shipHealth)
    {
       // initialise instance variables
       this.shipType = shipType;
       shipDamage = 0;
       shipAlignment = 'V'; // v for vertical
       shipRow = 'A'; // arbitrary position
       shipColumn = 0; // arbitrary position
    }

    /**
     * Accessor method for ship alignment
     */
    public char getShipAlignment() {
        return shipAlignment;
    }
    
    /**
     * Accessor method for getting the ship row
     */
    public int getShipRow() {
        return shipRow;
    }
    
    /**
     * Accessor method for getting the ship column
     */
    public int getShipColumn() {
        return shipColumn;
    }
    
    /**
     * Accessor method for getting the ship type
     */
    public char getShipType() {
        return shipType;
    }
    
        /**
     * Accessor method for getting the ship damage
     */
    public int getShipDamage() {
        return shipDamage;
    }
    
    /**
     * method for setting the position of ship, 
     * it's parameters being the position of the first square of the ship 
     * and the aligment of the ship
     */
    public void setPosition(char row, char column, char alignment) {
        shipRow = row;
        shipColumn = column;
        shipAlignment = alignment;
    }
    
    public String getName() {
        switch (shipType) {
	    case 'B':
		return "Battleship";
	    case 'C':
	        return "Cruiser";
	    case 'D':
		return "Destroyer";
	    case 'S':
		return "Submarine";
	    case 'O': 
		return "Miss";
	    default:
		return "Not a ship type";
	}
    }
    
    /**
     * method for getting the length of the ship
     */
    public int getLength() {
        switch (shipType) {
	    case 'B':
		return 4;
	    case 'C':
	        return 3;
	    case 'D':
		return 2;
	    case 'S':
		return 1;
	    case 'O': 
		return 0;
	    default:
            System.out.println("Not a ship type!");
            return 1000;    // I had to put a int return so if its 1000 it shouldn't have any effect if we 'addDamage'
        }
    }
    
    /** 
     * method for adding to shipDamage
     */
    public void addDamage() {
        shipDamage +=1;
    }
    
    public boolean isSunk() {
        if (shipDamage == this.getLength()){
            return true;
        }
        else {
            return false;
        }
    }
    
}
