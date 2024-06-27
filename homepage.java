import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homepage extends World
{
      //public static GreenfootSound bg = new GreenfootSound("waterAmb1.wav");
    /**
     * Constructor for objects of class homepage.
     * 
     */
    public homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 535, 1); 
        //bg.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,464,380);
        play.setLocation(472,373);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
