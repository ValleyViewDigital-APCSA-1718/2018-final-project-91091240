import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class convertible extends Car
{
    private int speed, turnRadius;
    private int time = getTime();
    public convertible(int speed, int turnRadius)
    {
        super(speed, turnRadius);
        this.speed=speed;
        this.turnRadius=turnRadius;
    }//end of convertible constructor
    public int getSpeed()
    {
        return speed;
    }//end of get method for the speed
    public int getTurnRadius()
    {
        return turnRadius;
    }//end of get method for the turn radius
    public double giveTime()
    {
        return time;
    }//end of method giveTime()
}//end of class convertible
