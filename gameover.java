import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 535, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        exit exit = new exit();
        addObject(exit,597,420);
        showText("Predator telah memakanmu, kamu kalah!!", 490, 300);
        showText("Score kamu:" +MyWorld.score.getValue()+"point", 490, 320);
        removeObject(exit);
        exit exit2 = new exit();
        addObject(exit2,546,444);
        play play = new play();
        addObject(play,528,367);
        removeObject(exit2);
        removeObject(play);
        addObject(exit2,604,451);
        Greenfoot.playSound("gameOver.wav");
    }
}
