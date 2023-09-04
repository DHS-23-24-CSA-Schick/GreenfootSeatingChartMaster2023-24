import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animation for Kaito Suzuki +
 * Animation for table seven executed
 * 
 * @author Kaito Suzuki 
 * @version 9/3/2023
**/ 
public class KaitoSuzuki extends Student implements SpecialInterestOrHobby
{

    public KaitoSuzuki() {
        firstName="Kaito";
        lastName="Suzuki";
        mySeatX=1;
        mySeatY=1;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+lastName.toLowerCase() + "-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
        getImage().scale(60,60);
    }
    
    public void getName(){
        System.out.println("My name is Kaito Suzuki");
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
           //  if (sitting){
                //sitting=false;
                //setImage(standingFile);
            sitting=false;
            setImage(standingFile);
            getImage().scale(80,160);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I like to do robotics!");
            
            dance();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
            sitDown();
            setRotation(0);
            getImage().scale(60,60);
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
        for (int i = 0; i < 42; i++){
            if (right){
                if (angle >= 45){
                    right = false;
                } else {
                    angle+=4;
                    setRotation(angle);
                }
            } else {
                if (angle <= -45) {
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


