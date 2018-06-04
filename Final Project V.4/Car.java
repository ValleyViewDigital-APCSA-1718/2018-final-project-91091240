import greenfoot.*;
import java.util.ArrayList;
/**
 * Julian Martin
 * 05/21/18
 * Final Project Game
 */
public class Car extends Actor
{
    private int numBarrels=0;
    private int count=0;
    private int time=40;
    private int speed=0;
    private int turnRadius=0;
    private int score;
    //ArrayList highScore = new ArrayList(1);
    //int highScores[]=new arrayList;
    private boolean choose = false;
    public Car()
    {
        count++;
    }//end of car constructor
    public Car(int speed, int turnRadius)
    {
        this.speed=speed;
        this.turnRadius=turnRadius;
    }//end of two-arg constructor
    public void act()
    {
        World myWorld = getWorld();
        Car car=new ambulance();
        while(choose==false)
        {
            if(Greenfoot.isKeyDown("4"))
            {
                car = new convertible3(); 
                choose=true;
            }//choose convertible
            if(Greenfoot.isKeyDown("3"))
            {
                car = new convertible2(); 
                choose=true;
            }//choose convertible
            if(Greenfoot.isKeyDown("2"))
            {
                car = new convertible1(); 
                choose=true;
            }//choose convertible
            if(Greenfoot.isKeyDown("1"))
            {
                car = new ambulance(); 
                choose=true;
            }//if right key is clicked
        }//end of while(allows user to choose the car they like)
        myWorld.addObject(car, getX(), getY());
        myWorld.removeObject(this);
    }//end of act method(allows the user to choose the car they like: 4 choices)
    public void moveAndTurn()
    {
        getWorld().showText(toString(), 350, 350);
        if ((time > 0)||(numBarrels < 60))
        {
            if(Greenfoot.isKeyDown("up"))
            {
                move(speed); 
            }//if right key is clicked 
            if(Greenfoot.isKeyDown("down"))
            {
                move(-speed); 
            }//if right key is clicked
            if(Greenfoot.isKeyDown("right"))
            {
                turn(turnRadius);
            }//if right key is clicked
            if(Greenfoot.isKeyDown("left"))
            {
                turn(-turnRadius);
            }//if left is clicked
        }//end of conditions(used to determine which keys will move the car)
    }//end of method moveAndTurn
    public int getCount()
    {
        return count++;
    }//end of method getCount()
    public void crash()
    {
       Actor eatBarrel;
       eatBarrel = getOneObjectAtOffset(0, 0, Barrel.class);
       if(eatBarrel!=null)
        {
           World myWorld;
           myWorld = getWorld();
           myWorld.removeObject(eatBarrel);
           numBarrels++;
        }//end of if eatBarrel
    }//end of method crash
    public int timer()
    {
        time = 40-(int)(getCount()/60);
        if(time<=0)
        {
            time=0;
        }//end of if statement
        return time;
    }//end of timer(times the game using 40 seconds)
    public String toString()
    {
        String output = new String();
        output=null;
        score=60-numBarrels;
        //if(timer()>highScore)
        if(numBarrels==60&&time>0)
        {
          output = "VICTORY, YOU WIN!!!";
          speed=0;
          turnRadius=0;
          return output;
        }//if all barrels are gone, you win
        else if(numBarrels<60&&time==0)
        {
           output = "Sorry, TIME IS UP!!!";
           speed=0;
           turnRadius=0;
           return output;
        }//if you run out of time, Sorry, time is up
        else
        {
           output = "Number of Barrels taken out: "+numBarrels+"\n Goal: 60 Barrels"+
                     "\n Time Remaining: "+timer()+"\nBarrels Left: "+score;
           return output;
        }//end of else(if anything else happens, shows the menu)
    }//end of method toString
    public int getTime()
    {
        return time;
    }//end of get method for the time
    public int getNumBarrels()
    {
        return numBarrels;
    }//end of get method for the barrels
}//end of class Car
