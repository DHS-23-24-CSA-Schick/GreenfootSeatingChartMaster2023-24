import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaigeNothelfer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaigeNothelfer extends Student implements SpecialInterestOrHobby
{
    /**
     * Act - do whatever the PaigeNothelfer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PaigeNothelfer(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    
    public PaigeNothelfer() {
        firstName="Paige";
        lastName="Nothelfer";
        mySeatX=10; //FIXME
        mySeatY=10; //FIXME
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    public void movement() {
        
        setLocation(5,5); 
        for(int i = 0; i < 10; ++i) {
            getImage().mirrorVertically();
            Greenfoot.delay(10);
            //getImage().setTransparency(i);
        }
        for(int i = 0; i < 100; ++i) {
            getImage().mirrorHorizontally();
            Greenfoot.delay(3);
            //getImage().setTransparency(i);
        }
        
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                
                myHobby("I like origami and making jewelry!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                movement();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                Greenfoot.delay(5);
                sitDown();
            }
    }
    
    public void myHobby(String s) {
         System.out.println(s);
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
}
