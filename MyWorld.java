import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score= new Counter("Score : ");
    static Counter hp= new Counter("Hp : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new predator2(),948, Greenfoot.getRandomNumber(360));
        }
        if(MyWorld.score.getValue()>=25){
           Greenfoot.delay(5);
           Greenfoot.setWorld(new level2());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mainfish mainfish = new mainfish();
        addObject(mainfish,58,281);
        fish1 fish1 = new fish1();
        addObject(fish1,548,100);
        fish1 fish12 = new fish1();
        addObject(fish12,825,265);
        fish1 fish13 = new fish1();
        addObject(fish13,496,287);
        fish1 fish14 = new fish1();
        addObject(fish14,394,486);
        fish1 fish15 = new fish1();
        addObject(fish15,846,100);
        fish2 fish2 = new fish2();
        addObject(fish2,828,360);
        fish2 fish22 = new fish2();
        addObject(fish22,941,187);
        fish2 fish23 = new fish2();
        addObject(fish23,604,209);
        fish2 fish24 = new fish2();
        addObject(fish24,681,512);
        fish2 fish25 = new fish2();
        addObject(fish25,480,47);
        predator2 predator2 = new predator2();
        addObject(predator2,740,350);
        predator2 predator22 = new predator2();
        addObject(predator22,901,40);
        predator22.setLocation(841,41);
        Counter2 counter2 = new Counter2();
        addObject(counter2,841,41);
        Counter counter = new Counter();
        addObject(counter,95,38);
        predator22.setLocation(844,44);
        counter.setLocation(94,38);
        Counter counter3 = new Counter("Score : ");
        addObject(counter3,94,38);

        score.setValue(0);
        hp.setValue(1);
        removeObject(counter2);
        removeObject(counter3);
        removeObject(counter);
        Counter counter4 = new Counter("Score : ");
        addObject(counter4,76,36);
        removeObject(predator2);
        addObject(predator2,918,486);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
