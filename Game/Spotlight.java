import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spotlight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spotlight extends Actor
{
    /**
     * Act - do whatever the Spotlight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        Actor Obstacle = getOneIntersectingObject(Obstacle.class);
        if (Obstacle != null)
        {
            move(-2);
        }
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() -5 )
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
        Actor Robber_Protagonist;
        Robber_Protagonist = getOneObjectAtOffset(0,0, Robber_Protagonist.class);
        if (Robber_Protagonist != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Robber_Protagonist);
            Greenfoot.playSound("Dead.wav");
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    }
}
