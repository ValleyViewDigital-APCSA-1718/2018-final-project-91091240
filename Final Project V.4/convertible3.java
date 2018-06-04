import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class convertible3 extends convertible
{
    private int speed = getSpeed();
    private int turnRadius=getTurnRadius();
    public convertible3()
    {
        super(7, 8);
    }//end of constructor convertible3
    public void act() 
    {
        moveAndTurn();
        crash();
    }//end of method act(allows objects to move)
    public void moveAndTurn()
    {
        getWorld().showText(toString(), 350, 350);
        if ((giveTime() > 0)||(getNumBarrels() < 60))
        {
            if(Greenfoot.isKeyDown("up"))
            {
                move(-speed); 
            }//if right key is clicked 
            if(Greenfoot.isKeyDown("down"))
            {
                move(speed); 
            }//if right key is clicked
            if(Greenfoot.isKeyDown("right"))
            {
                turn(-turnRadius);
            }//if right key is clicked
            if(Greenfoot.isKeyDown("left"))
            {
                turn(turnRadius);
            }//if left is clicked
        }//end of conditions(used to determine which keys will move the car)
    }//end of method moveAndTurn
}//end of class convertible3(child class of convertible)
