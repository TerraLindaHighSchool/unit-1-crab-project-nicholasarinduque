import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OceanWorld here.
 * 
 * @author Nicholas Arinduque
 * @version 9/9/2021
 */
public class OceanWorld extends World
{

    /**
     * Constructor for objects of class OceanWorld.
     * 
     */
    public OceanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        fish fish = new fish();
        addObject(fish,390,401);
        dolfin dolfin = new dolfin();
        addObject(dolfin,220,259);
        fish fish2 = new fish();
        addObject(fish2,461,232);
        fish fish3 = new fish();
        addObject(fish3,363,131);
        fish fish4 = new fish();
        addObject(fish4,95,434);
        fish fish5 = new fish();
        addObject(fish5,100,197);
        fish fish6 = new fish();
        addObject(fish6,200,88);
        fish fish7 = new fish();
        addObject(fish7,271,481);
        fish fish8 = new fish();
        addObject(fish8,476,508);
        fish fish9 = new fish();
        addObject(fish9,536,324);
        fish fish10 = new fish();
        addObject(fish10,501,60);
        bomb bomb = new bomb();
        addObject(bomb,328,309);
        bomb bomb2 = new bomb();
        addObject(bomb2,379,192);
        bomb bomb3 = new bomb();
        addObject(bomb3,128,344);
        bomb.setLocation(399,481);
        bomb2.setLocation(476,124);
        bomb3.setLocation(96,351);
    }
}
