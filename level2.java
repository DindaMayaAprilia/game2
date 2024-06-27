import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    public static Counter score = new Counter("Score: ");
    public static Counter hp = new Counter("Hp: ");
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 535, 1); 
        prepare();
    }
    
     public void act()
    {
        if(Greenfoot.getRandomNumber(90) < 3){
            addObject(new fish1(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 3){
            addObject(new fish2(),948, Greenfoot.getRandomNumber(360));
        }
         if(Greenfoot.getRandomNumber(150) < 3){
            addObject(new fish3(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new predator1(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new predator3(),948, Greenfoot.getRandomNumber(360));
        }
        if(MyWorld.score.getValue()>=40){
           Greenfoot.delay(5);
           Greenfoot.setWorld(new levelcompleted());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mainfish mainfish = new mainfish();
        addObject(mainfish,54,281);
        fish3 fish3 = new fish3();
        addObject(fish3,525,107);
        fish2 fish2 = new fish2();
        addObject(fish2,593,342);
        fish1 fish1 = new fish1();
        addObject(fish1,818,73);
        fish1 fish12 = new fish1();
        addObject(fish12,784,241);
        fish1 fish13 = new fish1();
        addObject(fish13,774,396);
        fish1 fish14 = new fish1();
        addObject(fish14,544,457);
        fish2 fish22 = new fish2();
        addObject(fish22,690,73);
        predator1 predator1 = new predator1();
        addObject(predator1,900,11);
        predator3 predator3 = new predator3();
        addObject(predator3,938,477);
        fish2 fish23 = new fish2();
        addObject(fish23,658,185);
        Counter counter = new Counter("Score : ");
        addObject(counter,80,41);
        
        score.setValue(0);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
