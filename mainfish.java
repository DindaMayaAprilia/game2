import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainfish extends Actor
{
    /**
     * Act - do whatever the mainfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-6);
        }
         if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+6);
        }
         if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,getY());
        }
         if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());
        }
    }
    private void checkCollision(){
        if(isTouching(fish1.class)){
            removeTouching(fish1.class);
            MyWorld.score.add(2);
            Greenfoot.playSound("bite1.wav");
        
        }
        if(isTouching(fish2.class)){
            removeTouching(fish2.class);
            MyWorld.score.add(4);
             Greenfoot.playSound("bite2.wav");
        }
        if(isTouching(fish2.class)){
            removeTouching(fish3.class);
            MyWorld.score.add(4);
             Greenfoot.playSound("bite3.wav");
        }
    }
}
