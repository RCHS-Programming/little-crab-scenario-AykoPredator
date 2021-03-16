import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act()
    {
       turnAtEdge();
       randomTurn();
       move();
       lookForCrab();
    }
    
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn (17); 
        }
    }
    
    public void randomTurn()
    {
     if(Greenfoot.getRandomNumber(100)<10)
     {
         turn(Greenfoot.getRandomNumber(91)-54);
     }
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }

    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0,clss);
        if(actor != null)  {
            getWorld().removeObject(actor);
        }
    }
    
    public void move( )
    {
        move(5);
    }
    
    public void lookForCrab()
    {
        if(canSee(Crab.class))
        {
            eat(Crab.class);
            Greenfoot.stop();
        }
    }   
}
