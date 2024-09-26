import java.util.*;
import greenfoot.*;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Write a description of class Classroom here.
 * 
 * @author Mr. Kaehms 
 * @version 2.0  Note: updated for new desk layout. Goal is to make setting seats easy
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();

    /**
     * Constructor for objects of class Classroom.
     */
    public Classroom()                                                        
    {    
        // Create a new world with 14x14 cells with a cell size of 60x60 pixels.
        super(14, 14, 60); 

        prepare();
    }


    /**
     * Prepare the classroom desk layout.  This method should not be chanaged!. Refactored from prepare method.
     */

    private void createDeskLayout(){
        StudentDesk studentdesk = new StudentDesk();
        addObject(studentdesk,2,3);
        StudentDesk studentdesk2 = new StudentDesk();
        addObject(studentdesk2,3,3);
        StudentDesk studentdesk3 = new StudentDesk();
        addObject(studentdesk3,2,4);
        StudentDesk studentdesk4 = new StudentDesk();
        addObject(studentdesk4,3,4);
        StudentDesk studentdesk5 = new StudentDesk();
        addObject(studentdesk5,2,6);
        StudentDesk studentdesk6 = new StudentDesk();
        addObject(studentdesk6,3,6);
        StudentDesk studentdesk7 = new StudentDesk();
        addObject(studentdesk7,2,7);
        StudentDesk studentdesk8 = new StudentDesk();
        addObject(studentdesk8,3,7);
        StudentDesk studentdesk9 = new StudentDesk();
        addObject(studentdesk9,5,3);
        StudentDesk studentdesk10 = new StudentDesk();
        addObject(studentdesk10,6,3);
        StudentDesk studentdesk11 = new StudentDesk();
        addObject(studentdesk11,5,4);
        StudentDesk studentdesk12 = new StudentDesk();
        addObject(studentdesk12,6,4);
        StudentDesk studentdesk13 = new StudentDesk();
        addObject(studentdesk13,5,6);
        StudentDesk studentdesk14 = new StudentDesk();
        addObject(studentdesk14,6,6);
        StudentDesk studentdesk15 = new StudentDesk();
        addObject(studentdesk15,5,7);
        StudentDesk studentdesk16 = new StudentDesk();
        addObject(studentdesk16,6,7);
        StudentDesk studentdesk17 = new StudentDesk();
        addObject(studentdesk17,8,3);
        StudentDesk studentdesk18 = new StudentDesk();
        addObject(studentdesk18,9,3);
        StudentDesk studentdesk19 = new StudentDesk();
        addObject(studentdesk19,8,4);
        StudentDesk studentdesk20 = new StudentDesk();
        addObject(studentdesk20,9,4);
        StudentDesk studentdesk21 = new StudentDesk();
        addObject(studentdesk21,8,6);
        StudentDesk studentdesk22 = new StudentDesk();
        
        addObject(studentdesk22,9,6);
        StudentDesk studentdesk23 = new StudentDesk();
        addObject(studentdesk23,8,7);
        StudentDesk studentdesk24 = new StudentDesk();
        addObject(studentdesk24,9,7);
        StudentDesk studentdesk25 = new StudentDesk();
        addObject(studentdesk25,8,9);
        StudentDesk studentdesk26 = new StudentDesk();
        addObject(studentdesk26,9,9);
        StudentDesk studentdesk27 = new StudentDesk();
        addObject(studentdesk27,8,10);
        StudentDesk studentdesk28 = new StudentDesk();
        addObject(studentdesk28,9,10);
        StudentDesk studentdesk29 = new StudentDesk();
        addObject(studentdesk29,5,9);
        StudentDesk studentdesk30 = new StudentDesk();
        addObject(studentdesk30,6,9);
        StudentDesk studentdesk31 = new StudentDesk();
        addObject(studentdesk31,5,10);
        StudentDesk studentdesk32 = new StudentDesk();
        addObject(studentdesk32,6,10);
        TeacherDesk teacherdesk = new TeacherDesk();
        addObject(teacherdesk,2,10);
        studentdesk31.setDeskGroup(1);
        studentdesk29.setDeskGroup(1);
        studentdesk30.setDeskGroup(1);
        studentdesk32.setDeskGroup(1);
        studentdesk25.setDeskGroup(2);
        studentdesk27.setDeskGroup(2);
        studentdesk26.setDeskGroup(2);
        studentdesk28.setDeskGroup(2);
        studentdesk21.setDeskGroup(3);
        studentdesk23.setDeskGroup(3);
        studentdesk22.setDeskGroup(3);
        studentdesk13.setDeskGroup(4);
        studentdesk15.setDeskGroup(4);
        studentdesk14.setDeskGroup(4);
        studentdesk16.setDeskGroup(4);
        studentdesk6.setDeskGroup(5);
        studentdesk8.setDeskGroup(5);
        studentdesk5.setDeskGroup(5);
        studentdesk7.setDeskGroup(5);
        studentdesk.setDeskGroup(6);
        studentdesk3.setDeskGroup(6);
        studentdesk4.setDeskGroup(6);
        studentdesk2.setDeskGroup(6);
        studentdesk9.setDeskGroup(7);
        studentdesk11.setDeskGroup(7);
        studentdesk10.setDeskGroup(7);
        studentdesk12.setDeskGroup(7);
        studentdesk17.setDeskGroup(8);
        studentdesk19.setDeskGroup(8);
        studentdesk18.setDeskGroup(8);
        studentdesk20.setDeskGroup(8);
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
        createDeskLayout();
 // Each student needs to create their specific instance following the PeytonLeonard example.
 // Your current seatX and seatY can be found by right clicking on the corresponding seat in the Classrom.
 // and then clicking on the inspect text
        LeslieFernandes lesliefernandes = new LeslieFernandes();
        addObject(lesliefernandes,3,3);
        lesliefernandes.assignSeat();

        Bardia bardia = new Bardia();
        addObject(bardia, 2, 7);
        bardia.assignSeat();

        PeytonLeonard peytonLeonard = new PeytonLeonard();
        addObject(peytonLeonard,5,6);
        peytonLeonard.assignSeat();
        ArivDesai arivdesai = new ArivDesai();
        addObject(arivdesai,2,3);
        arivdesai.assignSeat();
        KoushikAarnav aarnavkoushik = new KoushikAarnav();
        addObject(aarnavkoushik,6,6);
        KilgoreTrout kilgoretrout = new KilgoreTrout();
        AbhishekParanthanate abhishekparanthanate = new AbhishekParanthanate();
        addObject(kilgoretrout,3,4);
        kilgoretrout.assignSeat();
          
        MatthewLoo matthewloo = new MatthewLoo();
        addObject(matthewloo,6,7);
        matthewloo.assignSeat();
        
        SaiMadapuri saimadapuri = new SaiMadapuri();
        addObject(saimadapuri, 6,9);
        saimadapuri.assignSeat();
        ZuhairRassiwala zuhairrassiwala = new ZuhairRassiwala();
        addObject(zuhairrassiwala,9,9);
        zuhairrassiwala.assignSeat();
        RaghavanSrinivas raghavansrinivas = new RaghavanSrinivas();
        addObject(raghavansrinivas, 9, 7);
        raghavansrinivas.assignSeat();
    
        
        SakethBandi sakethbandi = new SakethBandi();
        addObject(sakethbandi,2,6);
        sakethbandi.assignSeat();
   
        
        //adding sanjitha
        SanjithaSaravanan sanjithasaravanan = new SanjithaSaravanan();
        addObject(sanjithasaravanan,8,7);
        sanjithasaravanan.assignSeat();
        RyanKim ryankim = new RyanKim();
        addObject(ryankim,6,4);
        ryankim.assignSeat();
        addObject(abhishekparanthanate, 8, 10);
        abhishekparanthanate.assignSeat();
        CyrilJoby cyriljoby = new CyrilJoby();
        addObject(cyriljoby,5,3);
        cyriljoby.assignSeat();

        JoshChoi joshchoi = new JoshChoi();
        addObject(joshchoi,2,4);
        joshchoi.assignSeat();
        JasonZhou jasonzhou = new JasonZhou();
        addObject(jasonzhou,9,10);
        EvanTseng evantseng = new EvanTseng();
        addObject(evantseng, 8,4);
        evantseng.assignSeat();
        
        
        IshaanGupta ishaangupta = new IshaanGupta();
        addObject(ishaangupta,9,10);
        ishaangupta.assignSeat();
        
        KaitoSuzuki kaitosuzuki = new KaitoSuzuki();
        addObject(kaitosuzuki, 9, 6);
        kaitosuzuki.assignSeat();
        HariniMurugan harinimurugan = new HariniMurugan();
        addObject(harinimurugan, 5, 10);
        harinimurugan.assignSeat();
        AkshatKhandelwal akshatkhandelwal = new AkshatKhandelwal();
        addObject(akshatkhandelwal,6,3);
        akshatkhandelwal.assignSeat();
        PaigeNothelfer paigenothelfer = new PaigeNothelfer();
        addObject(paigenothelfer,6,10);
        paigenothelfer.assignSeat();
        
        // TODO - Debug StudentDeskGroup
        //      - Bug: When added to the objects
        //             StudentDeskGroup blocks all
        //             other objects from receiving
        //             mouse clicks.
        // Team5 team5 = new Team5(); 
        // addObject(team5, 100, 100);
        
        SanatGupta sanatgupta = new SanatGupta();
        addObject(sanatgupta, 5, 4);
        sanatgupta.assignSeat();
        NithilaSadheesh nithilasadheesh = new NithilaSadheesh();
        addObject(nithilasadheesh, 8, 9);
        
        KevinLi kevinli = new KevinLi();
        addObject(kevinli, 5, 7);
        kevinli.assignSeat();
        
        SudithThota suditht = new SudithThota();
        addObject(suditht, 8, 6);
        suditht.assignSeat();
        
        StudentDeskGroup sdg = new StudentDeskGroup();
        this.addObject(sdg, 100,100);
        sdg.assignSeatsToDeskGroups();
        List<StudentDesk> desks = this.getObjects(StudentDesk.class);
        sdg.getStudents(2, desks);
  
        DeekshaVaidyanathan deekshavaidyanathan = new DeekshaVaidyanathan();
        addObject(deekshavaidyanathan,9,4);
        deekshavaidyanathan.assignSeat();
        
        SatvikMarthi satvikmarthi = new SatvikMarthi();
        addObject(satvikmarthi,5,9);
        satvikmarthi.assignSeat();
    }
    

    public List<Student> getAllStudents(){
       List<Student> s = getObjects(Student.class);  
       return s;
    }
    
  
    /**
     * gets a list of all students, and creates a new file that can be cut/pasted in as a prepare statement.
     * 
     */
    public void createNewSeatingChart(){
        boolean lastWrite;
        String timestamp=DateFormatter.makeDate();
      
        String newChartFile="seatingchart-" + timestamp + ".txt";   
        
        List<Student> students = getObjects(Student.class); 
        
        for (Student s:students){
            String studentClassName=s.getFirstName()+s.getLastName(); 
            
            String studentInstanceVar=studentClassName.toLowerCase();
            String instantiate=studentClassName + " " + studentInstanceVar + " = new " + studentClassName + "(); \n";
            String placeStudent="addObject(" + studentInstanceVar + ","+ s.getX() + "," + s.getY()+"); \n";
            String assignSeat = studentInstanceVar + ".assignSeat();\n\n";
           
            appendFile(newChartFile,instantiate);
            appendFile(newChartFile,placeStudent);  
            appendFile(newChartFile,assignSeat);
            
        }
        Greenfoot.ask("Your file has been saved as: "+newChartFile+"     -Press [Enter] to continue.");
    
    }
    
 
    
    // modified from https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/
    
    
   public  void appendFile(String fname, String s){
   {    
      try{
         
        //Specify the file name and path here
        File file =new File(fname);

        /* This logic is to create the file if the
         * file is not already present
         */
        if(!file.exists()){
           file.createNewFile();
        }

        //Here true is to append the content to file
        FileWriter fw = new FileWriter(file,true);
        //BufferedWriter writer give better performance
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        //Closing BufferedWriter Stream
        bw.close();

    System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
         ioe.printStackTrace();
       }
   }
}
}
