import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish1 extends FISH
{
    private int speed;
    public fish1()
    {
        speed=Greenfoot.getRandomNumber(4)+1;
    }
    /**
     * Act - do whatever the fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX() == 0)
        {
            MyWorld.score.add(0);
            getWorld().removeObject(this);
        }
        
    }
}
