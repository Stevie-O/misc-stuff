import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Base class for objects that can move around.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovableObject extends Actor
{
	// distance to move each step
	protected int speed;
	
	/**
	 * Add @dy/@dx to the current velocity.
	 *
	 * @dy Y coordinate of vector to add to the current velocity.
	 * @dx X coordinate of vector to add to the current velocity.
	 */
	public void adjustVelocity(int dx, int dy)
	{
		int rotation = getRotation();
		double rotation_rads = ((double)rotation) * Math.PI / 180.0;
		// Convert polar-form velocity vector (angle and magnitude) to Cartesian (dx and dy)
		double cur_dx = speed * Math.cos(rotation_rads);
		double cur_dy = speed * Math.sin(rotation_rads);
		// Add in the new vector
		cur_dx += dx;
		cur_dy += dy;
		// find the new speed and angle
		double new_speed = Math.sqrt(cur_dx * cur_dx + cur_dy * cur_dy);
		double new_angle = Math.atan2(cur_dy, cur_dx);
		// update
		speed = Math.round(new_speed);
		setRotation( Math.round(new_angle * 180.0 / Math.PI) );
	}
	
    /**
     * Act - do whatever the movementClass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
		self.move(speed);
		if (Greenfoot.mouseDragged(self)) {
			// We are being dragged. Find the distance between us and the mouse and add 1/10th of that distance to our speed.
			// TODO: Tweak the parameters here to find the best behavior.
			double dx = MouseInfo.getX() - getX();
			double dy = MouseInfo.getY() - getY();
			double mag = Math.sqrt(dx * dx + dy * dy);
			double angle = Math.atan2(dy, dx);
			mag *= 0.10;
			dx = mag * Math.cos(angle);
			dy = mag * Math.sin(angle);
			adjustVelocity(Math.round(dx), Math.round(dy));		
		}
    }
}
