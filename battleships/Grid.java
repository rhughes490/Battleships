
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    // instance variable for the grid
    private char[][] grid;

    /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
        // initialise the grid (instance variables)
        grid = new char[10][10];
        emptyBoard();
    }

    /**
     * Fills the grid with a 'space' placeholder to denote that the square has neither a ship or a missed shot
     */
    private void emptyBoard() {
        for (int i = 0; i < grid.length; i++) {    
           for (int j = 0; j < grid[i].length; j++) {
              grid[i][j] = ' ';
           }
        }
    }
}
