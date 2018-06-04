import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class convertible1 extends convertible
{
    public convertible1()
    {
        super(7, 8);
    }//end of convertible constructor
    public void act() 
    {
        moveAndTurn();
        crash();
    }
}//end of class convertible1(child class of convertible)
