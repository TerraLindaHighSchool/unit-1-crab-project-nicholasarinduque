import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dolfin here.
 * 
 * @author Nicholas Arinduque
 * @version 9/9/2021
 */
public class dolfin extends Actor
{
    // This method repeats the following actions 
    public void act()
    {
        move(5);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turna the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50); 
        }
    }    
    
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
    
         if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }
    
    //Check for collisions with other objects 
    private void onCollision()
    {
        if(isTouching(fish.class))
        {
            removeTouching(fish.class);
            Greenfoot.playSound("dolphinchirping.wav");
            
            //Winning the game
            if(getWorld().getObjects(fish.class).size() == 0)
            {
                Greenfoot.setWorld(new youWon());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();

            }
        }
        
        if(isTouching(Bomb.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
        
    }  





}
