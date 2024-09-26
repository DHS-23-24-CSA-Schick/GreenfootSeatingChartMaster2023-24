import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My newly created student. 
 * 
 * @author Sanjitha Saravanan  
 * @version (a version number or a date)
 */
public class SanjithaSaravanan extends Student
{
    public SanjithaSaravanan(String fname, String lname, int xcor, int ycor) {
        firstName = fname;
        lastName = lname;
        mySeatX = xcor;
        mySeatY = ycor;
        
        portraitFile=fname.toLowerCase()+lname.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=fname.toLowerCase()+lname.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    
    public SanjithaSaravanan(){
        firstName = "Sanjitha";
        lastName = "Saravanan";
        mySeatX = 8;
        mySeatY = 7;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    /**
     * Act - do whatever the SanjithaSaravanan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            sitting = false;
            System.out.println("");
            getName();
            sayName(soundFile);
            myHobby("I like to read murder mysteries!");
            movingClass();
            sitDown();
    }
}

  public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    public void myHobby(String s) {
         System.out.println(s);
}

    public void movingClass(){
        setLocation(8,7);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=5;i++){
            setLocation(i,7);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(10);
        }      
        
           Greenfoot.delay(20);
           returnToSeat();
    }
    
}

//