import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JoshChoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoshChoi extends Student implements FirstProgrammingLanguage
{
    /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public JoshChoi(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public JoshChoi() {
        firstName="Josh";
        lastName="Choi";
        mySeatX=1;
        mySeatY=1;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
        setScale(50, 50);
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                //setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                firstProgrammingLanguage("My first programming language was C!");
                sayName(soundFile);

            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
                setScale(50,50);
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        setLocation(getX(),getY() + 1);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=6;i++){
            setLocation(getX() + 1,getY());
            Greenfoot.delay(10);
        }
        for (int i=1;i<=2;i++){
            setLocation(getX() + 1,getY());
            Greenfoot.delay(10);
            setLocation(getX() - 1,getY());
            Greenfoot.delay(10);
        }
        for (int i=1;i<=6;i++){
            setLocation(getX() - 1,getY());
            Greenfoot.delay(10);
        }
        for (int i=1;i<=2;i++){
            setLocation(getX() + 1,getY());
            Greenfoot.delay(10);
            setLocation(getX() - 1,getY());
            Greenfoot.delay(10);
        }
        getImage().setTransparency(0);
        Greenfoot.delay(50);
        getImage().setTransparency(255);
        setLocation(6,6);
        for (int i=1;i<=18;i++){
            setScale(300,300);
            Greenfoot.delay(3);
            setScale(400,400);
            Greenfoot.delay(3);
        }
        setScale(50,50);
        Greenfoot.delay(20);
        returnToSeat();
    }
    public void setScale(int x, int y)
    {
        //Sets scale of your character (Be sure to call this after setting image)
        //Units in pixels
        GreenfootImage image = getImage();
        image.scale(x, y);
        setImage(image);
    }
    public void firstProgrammingLanguage(String text)
    {
         System.out.println(text);
    }
}
