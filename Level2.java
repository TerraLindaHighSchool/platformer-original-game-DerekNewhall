import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,455,43);
        door.setLocation(608,51);
        door.setLocation(1178,35);
        Gem gem = new Gem();
        addObject(gem,740,368);
        addObject(new Floor(), 600, 800);
        addObject(new Bomb(GRAVITY), 450, 115);
        addObject(new BrickWall(), 960, 100);
        addObject(new BrickWall(), 380, 500);
        addObject(new Player(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC), 50, 750);
        addObject(new SmBrickWall(), 420, 160);
        addObject(new BrickWall(), 1000, 600);
        addObject(new Bomb(GRAVITY), 1050, 765);
        addObject(new SmBrickWall(), 60, 400);
        addObject(new SmBrickWall(), 220, 200);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                           MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
    }
    
    public void spawn()
    {
        if(Math.random() < 0.025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        
        if(Math.random() < 0.01)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
