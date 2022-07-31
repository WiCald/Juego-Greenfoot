import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber_Protagonist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber_Protagonist extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            move(-6);
            Greenfoot.playSound("Step.wav");
            Actor Obstacle = getOneIntersectingObject(Obstacle.class);
        if (Obstacle != null)
        {
            move(+6);
        }
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(6);
            Greenfoot.playSound("Step.wav");
            Actor Obstacle = getOneIntersectingObject(Obstacle.class);
        if (Obstacle != null)
        {
            move(-6);
        }
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+6);
            Greenfoot.playSound("Step.wav");
            Actor Obstacle = getOneIntersectingObject(Obstacle.class);
        if (Obstacle != null)
        {
            setLocation(getX(), getY()-6);
        }
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-6);
            Greenfoot.playSound("Step.wav");
            Actor Obstacle = getOneIntersectingObject(Obstacle.class);
        if (Obstacle != null)
        {
            setLocation(getX(), getY()+6);
        }
        }
    }
}
