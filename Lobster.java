import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Nicholas Arinduque
 * @version 8/31/2021
 */
public class Lobster extends Actor
{
    // This method repeats the following actions 
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    
    // Turna the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50); 
        }
    }
}
