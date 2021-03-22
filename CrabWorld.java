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
        populateWorld();
    }
    
    public void populateWorld(){
        addObject(new Crab(), 150, 100);
        addObject(new Lobster(), 400, 100);
        addObject(new Lobster(), 400, 300);
        addObject(new Lobster(), 400, 500);
        addObject(new Worm(), 300, 50);
        addObject(new Worm(), 300, 100);
        addObject(new Worm(), 300, 150);
        addObject(new Worm(), 300, 200);
        addObject(new Worm(), 300, 250);
        addObject(new Worm(), 300, 300);
        addObject(new Worm(), 300, 350);
        addObject(new Worm(), 300, 400);
        addObject(new Worm(), 300, 450);
        addObject(new Worm(), 300, 500);
    }
}