import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
/**
 * Julian Martin
 * 5/24/18
 * Final Project
 */
public class MyWorld extends World
{
    int[][] coordinates=new int[14][14];
    private int xPos;
    private int yPos;
    private boolean choose=false;
    public MyWorld()
    {    
        super(700, 700, 1);
        Car car1 = new Car();
        
        xPos=Greenfoot.getRandomNumber(13)+1;
        yPos=Greenfoot.getRandomNumber(13)+1;
        addObject(car1,xPos*50, yPos*50);
        coordinates[xPos][yPos]=1;
        for(int i=0; i<60; i++)
        {
           int xMargin = Greenfoot.getRandomNumber(38)-19;
           int yMargin = Greenfoot.getRandomNumber(38)-19;
          while(coordinates[xPos][yPos]==1)
          {
              xPos=Greenfoot.getRandomNumber(13)+1;
              yPos=Greenfoot.getRandomNumber(13)+1;
          }//end of while(makes sure the barrels do not overlap using the for loop)
          coordinates[xPos][yPos]=1;
          Barrel b = new Barrel(); 
          addObject(b,xPos*50+xMargin, yPos*50+yMargin);
          
        }//end of for loop(makes sure that the barrels do not overlap at their random coordinates)
    }//end of method MyWorld()
}//end of class MyWorld

