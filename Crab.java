import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       checkKeyPress();
       move();
       lookForWorm();
    }
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
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
    
    public void lookForWorm()
    {
        if(canSee(Worm.class))
        {
            eat(Worm.class);
        }
    }
    }

    

