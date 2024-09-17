import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HariniMurugan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HariniMurugan extends Student
{
    /**
     * Act - do whatever the HariniMurugan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HariniMurugan(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpeg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public HariniMurugan() {
        firstName="Harini";
        lastName="Murugan";
        mySeatX=2;
        mySeatY=2;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpeg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
        
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
            
                favColor("My favorite color is green!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
               
                turn();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
            }
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void turn(){
        Greenfoot.delay(10);
        for (int i = 0; i < 6; i++){
            turn(180);
            move(10);
            Greenfoot.delay(10);
        }
    }
    public void favColor(String col){
        System.out.println(col);
    }
}
