import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class CS30SPersonExampleDriver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // ***** Objecy examples *****
    
        Person p1 = new Person();       // invoke the no-arg constructor
        
        System.out.println(p1);
        //System.out.println(p1.name);
        System.out.println(p1.getName());
        
        Person p2 = new Person("Jim", 34);
        System.out.println(p2);
        System.out.print(p2.getName() + ": ");
        System.out.println(p2.getAge());
        
        // getters return a valuer
        strout = p2.getName();
        System.out.println(strout);
        
        if(p2.getAge() > 18)
            System.out.println("adult");
            
        // using setters
        p1.setName("ArthurDent");
        p1.setAge(23);
        System.out.println(p1.getName() + ": " + p1.getAge());
        
        // *** person2 stuff ***
        System.out.println(nl + nl + "-----------Now for Person2------------");
        System.out.println("a field called birthYear and a static final field");
        System.out.println("for the current year so that the age can be calculated on demand.");
        System.out.println(nl);
        
        
        Person2 p21 = new Person2("RichardIII", 2000);
        System.out.println("Name: " + p21.getName());
        System.out.println("Birth Year: " + p21.getBirthYear());
        System.out.println("Age: " + p21.getAge());
        
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
