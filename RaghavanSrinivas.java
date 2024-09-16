import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The RaghavanSrinivas class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class RaghavanSrinivas extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the RaghavanSrinivas class.
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
    /*public RaghavanSrinivas(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }*/
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public RaghavanSrinivas() {
        firstName="Raghavan";
        lastName="Srinivas";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
        getImage().scale(60,60);

    }
    
     /**
     * Act - do whatever the RaghavanSrinivas actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                Basketball basketball1 = new Basketball();
                Basketball basketball2 = new Basketball();
                Basketball basketball3 = new Basketball();
                Basketball basketball4 = new Basketball();
                Basketball basketball5 = new Basketball();
                Basketball basketball6 = new Basketball();
                Basketball basketball7 = new Basketball();
                Basketball basketball8 = new Basketball();
                getWorld().addObject(basketball1, 1, 1);
                getWorld().addObject(basketball2, 5, 1);
                getWorld().addObject(basketball3, 9, 1);
                getWorld().addObject(basketball4, 13, 1);
                getWorld().addObject(basketball5, 1, 55);
                getWorld().addObject(basketball6, 5, 55);
                getWorld().addObject(basketball7, 9, 55);
                getWorld().addObject(basketball8, 13, 55);
                basketball1.setLocation(1, 1);
                basketball2.setLocation(5, 1);
                basketball3.setLocation(9, 1);
                basketball4.setLocation(13, 1);
                basketball5.setLocation(1, 55);
                basketball6.setLocation(5, 55);
                basketball7.setLocation(9, 55);
                basketball8.setLocation(13, 55);
                
                sitting=false;
                getImage().scale(60,60);
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to play basketball and poker!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                SpecialClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
                getImage().scale(50,50);
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
     * This is a local method specific to the RaghavanSrinivas class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void SpecialClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=15;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
            setRotation(getRotation() + 90);
        }
        // move back
        for (int i=1;i<=10;i++){
            setLocation(15,i);
            Greenfoot.delay(10);
            setRotation(getRotation() + 90);
        }      
         // move left
        for (int i=15;i>=0;i--){
            setLocation(i,10);
            Greenfoot.delay(10);
            setRotation(getRotation() + 90);
        }      
              // move Forward
        for (int i=10;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
            setRotation(getRotation() + 90);
        }   
           Greenfoot.delay(20);
           returnToSeat();
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}

