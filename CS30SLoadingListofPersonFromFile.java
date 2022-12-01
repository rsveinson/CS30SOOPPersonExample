import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     OOP load from file example
 * 
 *  Description:    Load an array list of objects from a data file
 * 
 *************************************************************/

public class CS30SLoadingListofPersonFromFile {

    public static void main(String[] args) throws IOException{
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        

        // declare and instantiate an array list for our person2 ojects
        ArrayList<Person2> list = new ArrayList<>();
        String name;                    // name read from file
        int birthYear = 0;              // year of birth read from file

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        
        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("CS30SPersonData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  OOP load from file example" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        // let's load the list form file
        strin = fin.readLine();

        while(strin != null){
            //System.out.println(strin);
            tokens = strin.split(delim);

            list.add(new Person2(tokens[0], Integer.parseInt(tokens[1])));

            strin  = fin.readLine();
        }// end eof   

        // ***** Main Processing *****

        // ***** Print Formatted Output *****

        System.out.println(printList(list, nl));
        
        // ***** Closing Message *****
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

    public static String printList(ArrayList<Person2> l, String nl){
        StringBuilder st = new StringBuilder();

        for(Person2 p : l){
            st.append(p);
            st.append(nl);
        }// end for

        return st.toString();
    }// end print list

} // end FormatTemplate
