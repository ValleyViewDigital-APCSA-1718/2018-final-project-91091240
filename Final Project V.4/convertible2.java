import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class convertible2 extends convertible
{
    public convertible2()
    {
        super(14, 25);
    }//end of convertible2 constructor
    public void act() 
    {
        moveAndTurn();
        crash();
    }//end of method act
}//end of class convertible2
