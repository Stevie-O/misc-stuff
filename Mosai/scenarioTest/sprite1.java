import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sprite1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sprite1 extends movementClass
{
    /**
     * Act - do whatever the sprite1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void keyboardMove() 
    {
      if (Greenfoot.isKeyDown ("d")){
        move(1);
    }    
      if (Greenfoot.isKeyDown ("a")){
        move(-1);
    }  
      if (Greenfoot.isKeyDown ("w")){
        setRotation(-90);
        move(1);
        setRotation(0);
    }  
      if (Greenfoot.isKeyDown ("s")){
        setRotation(90);
        move(1);
        setRotation(0);
    }  

}
}
