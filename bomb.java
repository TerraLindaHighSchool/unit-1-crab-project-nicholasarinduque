import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author Nicholas Arinduque
 * @version 9/9/2021
 */
public class bomb extends Actor
{
     // This method repeats the following actions 
    public void act()
    {
        move(1);
        turnAtEdge();
    }
    
    // Turna the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(90); 
            turn(180);
        }
    }
    

}

