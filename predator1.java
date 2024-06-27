import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class predator1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class predator1 extends predator
{
    /**
     * Act - do whatever the predator1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-2, getY());
    
        if(isTouching(mainfish.class)){
            removeTouching(mainfish.class);
            Greenfoot.setWorld(new gameover());
            Greenfoot.playSound("eating.wav");
        }
        
        if(getX()<5)
        getWorld().removeObject(this);
    
    }
}
