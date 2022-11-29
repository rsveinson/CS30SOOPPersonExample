import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     ArrayLIst Example
 * 
 *  Description:    Add an ARraylist to the person example
 * 
 *************************************************************/

public class CS30SPersonExampleDriverWithArrayList {

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
        
        ArrayList<Person2> list = new ArrayList<>();
    
    // ***** objects *****
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  ArrayList Example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // ***** Object examples *****
    
        list.add(new Person2("Ronaldo", 1995));
        list.add(new Person2("Messi", 1993));
        
        Person2 player = new Person2("Pele", 1950);
        list.add(player);
        
        System.out.println("" + list.size() + list);
        
        for(Person2 p : list){
            System.out.println(p.getID());
            System.out.println(p.getName());
            System.out.println(p.getBirthYear());
            System.out.println(p.getAge());
            //System.out.println(p);
            System.out.println("----------------" + nl);
        }// end for each
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getID());
        }// end for
        
        
        int age = list.get(0).getAge();
        System.out.println(age);
        //System.out.println(list.size());
        

        
    // ***** Print Formatted Output *****
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
