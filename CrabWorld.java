import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,92,202);
        Worm worm = new Worm();
        addObject(worm,355,256);
        worm.setLocation(117,80);
        crab.setLocation(276,232);
        crab.setLocation(180,211);
        Worm worm2 = new Worm();
        addObject(worm2,413,119);
        Worm worm3 = new Worm();
        addObject(worm3,106,329);
        Worm worm4 = new Worm();
        addObject(worm4,232,380);
        crab.setLocation(225,216);
        crab.setLocation(261,218);
        Worm worm5 = new Worm();
        addObject(worm5,339,369);
        Worm worm6 = new Worm();
        addObject(worm6,401,323);
        Worm worm7 = new Worm();
        addObject(worm7,439,261);
        Worm worm8 = new Worm();
        addObject(worm8,151,374);
        worm3.setLocation(118,336);
        worm3.setLocation(56,304);
        worm8.setLocation(122,405);
        worm4.setLocation(227,431);
        worm5.setLocation(388,415);
        worm6.setLocation(464,340);
        worm7.setLocation(484,270);
        Lobster lobster = new Lobster();
        addObject(lobster,364,231);
        lobster.setLocation(296,37);
    }
}