import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Obstacle obstacle = new Obstacle();
        addObject(obstacle,250,840);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2,271,66);
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3,1183,682);
        Obstacle obstacle4 = new Obstacle();
        addObject(obstacle4,251,714);
        Obstacle obstacle5 = new Obstacle();
        addObject(obstacle5,251,584);
        obstacle2.setLocation(290,76);
        obstacle2.setLocation(212,83);
        obstacle2.setLocation(261,76);
        Obstacle obstacle6 = new Obstacle();
        addObject(obstacle6,253,203);
        obstacle5.setLocation(242,577);
        obstacle5.setLocation(1176,217);
        Obstacle obstacle7 = new Obstacle();
        addObject(obstacle7,656,452);
        Robber_Protagonist robber_Protagonist = new Robber_Protagonist();
        addObject(robber_Protagonist,1356,438);
        Cop_Enemy cop_Enemy = new Cop_Enemy();
        addObject(cop_Enemy,91,147);
        Spotlight spotlight = new Spotlight();
        addObject(spotlight,210,471);
        obstacle6.setLocation(897,104);
        obstacle2.setLocation(657,781);
        obstacle7.setLocation(403,142);
        obstacle3.setLocation(1064,588);
        obstacle4.setLocation(743,391);
        removeObject(obstacle4);
        removeObject(obstacle6);
        obstacle3.setLocation(1102,789);
        obstacle5.setLocation(845,328);
    }
}
