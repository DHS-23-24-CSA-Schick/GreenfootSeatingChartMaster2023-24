import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KaitoSuzuki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KaitoSuzuki extends Student implements SpecialInterestOrHobby
{

    public KaitoSuzuki() {
        firstName="Kaito";
        lastName="Suzuki";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile = firstName.toLowerCase() + lastName.toLowerCase() + "-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
        getImage().scale(60,65);
    }
    
    public void getName(){
        System.out.println("My name is Kaito Suzuki");
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            if (sitting){
                sitting=false;
                setImage(standingFile);
                getImage().scale(70,130);
            }
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
        
            myHobby("I like to do robotics!");
            
            dance();
                
            sitDown();
            getImage().scale(60,65);
            setRotation(0);
        }
        
        if (Greenfoot.isKeyDown("space")){
            tableSeven();
        }
    }
    public void myHobby(String s) {
         System.out.println(s);
    }
    
    public void dance(){
        boolean right = true;
        int angle = 0;
        int location = 0;
        boolean forward = true;
        for (int i = 0; i < 50; i++){
            if (right){
                if (angle >= 30){
                    right = false;
                } else {
                    angle+=4;
                    setRotation(angle);
                }
            } else {
                if (angle <= -30) {
                    right = true;
                } else {
                    angle -= 4;
                    setRotation(angle);
                }
            }
            
            if (forward){
                location += 1;
                if (getX() >= 12){forward = false;}
            } else {
                location -= 1;
                if (getX() <= 0){forward = true;}
            }

            setLocation(location, 5);
            Greenfoot.delay(10);
        }
    }
}
