import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * This is a container for methods that could be called from the Classroom.  Possible methods could include the following:
 * public void assignSeatsToDeskGroups();  // iterates through all seats and sets the deskGroup based on position of each seat
 * public void getCurrentStudents(int deskGroup)  // list all students in a current deskGroup  (prints to console)
 * Can you think of others?
 * 
 * methods should be public, so they can be called when the scenario is in pause mode.
 * 
 * @author Kevin, Peyton, Matthew, Arnav 
 * @version 9/1/2023
 */
public class StudentDeskGroup extends Actor
{
    /**
     * Act - do whatever the StudentDeskGroup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }   
    public void displayTableNumber(int studentNumber){
        //Returns the table number based on the seat number. If the seat number exceeds the existing number of desks,
        //it will display that the seat number does not exist in the classroom
        if (studentNumber <= 4){
            System.out.print("This is table numnber 1.");
        }
        else if (studentNumber <= 8) {
            System.out.print("This is table number 2."); 
        }
        else if (studentNumber <= 12) {
            System.out.print("This is table number 3."); 
        }
        else if (studentNumber <= 16) {
            System.out.print("This is table number 4."); 
        }
        else if (studentNumber <= 20) {
            System.out.print("This is table number 5."); 
        }
        else if (studentNumber <= 24) {
            System.out.print("This is table number 6."); 
        }
        else if (studentNumber <= 28) {
            System.out.print("This is table number 7."); 
        }
        else if (studentNumber <= 32) {
            System.out.print("This is table number 8."); 
        }
        else {
            System.out.print("Student desk number " + studentNumber + "is not in this classroom.");
        }
    }
}
