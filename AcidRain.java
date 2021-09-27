import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AcidRain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AcidRain extends Obstacle
{
    /**
     * Act - do whatever the AcidRain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private float yVelocity;
    private final float GRAVITY;

    public AcidRain(float gravity)
    {
        GRAVITY = gravity;
    }

    protected void fall()
    { 

    }
}
