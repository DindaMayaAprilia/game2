import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish3 extends FISH
{
    private int speed;
    public fish3()
    {
        speed=Greenfoot.getRandomNumber(3)+1;
    }
    /**
     * Act - do whatever the fish3 wants to do. This method is called whenever
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
