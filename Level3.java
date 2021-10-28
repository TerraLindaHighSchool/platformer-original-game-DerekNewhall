  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
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
    public Level3()
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
        door.setLocation(1178,150);

        addObject(new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC), 70, 750);
        Floor floor = new Floor();
        addObject(floor,600,792);
        Gras gras = new Gras();
        addObject(gras,1059,604);
        Gras gras2 = new Gras();
        addObject(gras2,494,600);
        Gras gras3 = new Gras();
        addObject(gras3,768,386);
        Gras gras4 = new Gras();
        addObject(gras4,1061,222);
        Gras gras5 = new Gras();
        addObject(gras5,191,391);
        Gras gras6 = new Gras();
        addObject(gras6,478,202);
        Bomb bomb = new Bomb(0);
        addObject(bomb,329,545);
        Bomb bomb2 = new Bomb(0);
        addObject(bomb2,593,330);
        Bomb bomb3 = new Bomb(0);
        addObject(bomb3,888,328);
        Bomb bomb4 = new Bomb(0);
        addObject(bomb4,624,535);
        Bomb bomb5 = new Bomb(0);
        addObject(bomb5,894,165);
        Bomb bomb6 = new Bomb(0);
        addObject(bomb6,940,167);
        Toilet toilet = new Toilet();
        addObject(toilet,35,745);
        gras6.setLocation(512,280);
        gras6.setLocation(589,224);
        gras6.setLocation(603,269);
        removeObject(bomb2);
        gras6.setLocation(604,290);
        gras6.setLocation(620,280);
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
