import greenfoot.*;

/**
 * Write a description of class Basketball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basketball extends Actor
{
    private int fallingSpeed = 2; // Adjust this value for the desired falling speed
    private boolean onBottom = false;

    public Basketball()
    {
        GreenfootImage image = new GreenfootImage("basketball.jpg");
        image.scale(50, 50);
        setImage(image);
    }

    /**
     * Act - do whatever the Basketball wants to do.
     */
    public void act()
    {
        fall();
    }

    /**
     * Make the basketball fall vertically.
     */
    public void fall(){
        if (!onBottom){
            setLocation(getX(), getY() + fallingSpeed); // Move the basketball downwards
            onBottom = checkBottom();
        }

        if (onBottom){
            getWorld().removeObject(this); // Remove the basketball when it reaches the bottom
        }
    }

    /**
     * Check if the basketball has reached the bottom of the world.
     */
    public boolean checkBottom(){
        int worldHeight = getWorld().getHeight();
        return (getY() >= worldHeight - 1);
    }
}
