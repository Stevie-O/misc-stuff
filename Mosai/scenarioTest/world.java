import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        sprite1 x1 = new sprite1();
        sprite2 x2 = new sprite2();
        addObject(x1, getWidth() / 2, getHeight() / 2);
        addObject(x2, getWidth() / 5, getHeight() / 5);
    }
}
