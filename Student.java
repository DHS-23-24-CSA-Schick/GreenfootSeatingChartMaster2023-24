import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int mySeatX;         // rows start in the front of class (1), and end in the back of class
   public int mySeatY;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   public boolean sitting;   // Is the student sitting or standing (default sitting)                         
   
 //  public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   Classroom clas = (Classroom) getWorld();
   public void setSeatX(int r){
       mySeatX=r;
    }
    
    public void setSeatY(int s){
       mySeatY=s;
    }
    
    public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
 
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetSeatX(){
        return mySeatX;
    }
    
    public int GetSeatY(){
        return mySeatY;
    }
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeatX,mySeatY);
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
    public void assignSeat(){
        mySeatX=getX();
        mySeatY=getY();
    }
    public void setScale(int x, int y)
    {
        //Sets scale of your character (Be sure to call this after setting image)
        //Units in pixels
        GreenfootImage image = getImage();
        image.scale(x, y);
        setImage(image);
    }
 
    public void tableSeven(){
        List<Student> s = ((Classroom) getWorld()).getAllStudents();
        ArrayList<Student> tableSevenStudents = new ArrayList<Student>();
        for (int i = 0; i < s.size(); i++){
            Student student = s.get(i);
            if ((student.mySeatX == 8 && student.mySeatY == 6) || (student.mySeatX == 9 && student.mySeatY == 6) || (student.mySeatX == 8 && student.getY() == 7) || (student.mySeatX == 9 && student.mySeatY == 7)){
                tableSevenStudents.add(student);
            }
        }
        for (int k = 0; k < 2; k++){
            for (int i = 0; i < 4; i++){
                for (Student studentSelect : tableSevenStudents){
                    if (studentSelect.getX() == 8 && studentSelect.getY() == 6){
                        studentSelect.setLocation(9, 6);
                    } else if (studentSelect.getX() == 8 && studentSelect.getY() == 7) {
                        studentSelect.setLocation(8, 6);
                    } else if (studentSelect.getX() == 9 && studentSelect.getY() == 6) {
                        studentSelect.setLocation(9, 7);
                    } else if (studentSelect.getX() == 9 && studentSelect.getY() == 7) {
                        studentSelect.setLocation(8, 7);
                    } 
                }
                Greenfoot.delay(50);
            }

            for (Student studentFinish : tableSevenStudents){
                studentFinish.sitDown();
                studentFinish.getImage().scale(60,65);
            }
        }
    }
}
