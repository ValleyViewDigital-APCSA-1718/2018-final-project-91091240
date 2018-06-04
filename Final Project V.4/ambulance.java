import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class ambulance extends Car
{
    public ambulance()
    {
        super(5, 10);
    }//end of ambulance constructor
    public void act() 
    {
        moveAndTurn();
        crash();
    }//end of method act(allows objects to move)
}//end of class ambulance
