 import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.time.Year;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     OOp Example 1 Person2
 * 
 *  Description:    Simple implementation of a Person2 class
 * 
 *************************************************************/

public class Person2 {
    // ** class variables **
    /* a class/static variable is shared by all instances
     * of a class. this is particularly useful for things
     * like unique id numbers.
     * In this case all Person2 objects will share the static constant
     * for the current currentYear.
     */        
    private static final int currentYear = Year.now().getValue();
    private static int nextID = 1000;    // provides a uniqe id number for all person2s
    
    // ** fields ***
    
    private String name;
    private int birthYear;
    private int id;
    
    // ** constructors **
    
    // ** no-arg/default constructor
    public Person2(){
        this.name = "unknown";
        this.birthYear = 1900;
        id = getNextID();
    }// end default
    
    // full-arg constructor
    public Person2(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        id = getNextID();
    }// end full arg
    
    // ** getters **
    
    // getters allow examination of the current state of the object
    public String getName(){
        return this.name;
    }// end get name
    
    public int getBirthYear(){
        return this.birthYear;
    }// end get birthYear
    
    public int getID(){
        return this.id;
    }// end of getid
    
    // ** setters **
    
    // setters allow the state to be changed
    public void setName(String n){
        this.name = n;
    }// end setName
    
    public void setBirthYear(int a){
        this.birthYear = a;
    }// end setAge
    
    // ** other **
    // get the next id and increment nextID
    public int getNextID(){
        return nextID++;
    }//end get id
    
    public int getAge(){
        return currentYear - birthYear;
    }// end get age
    
    @Override
    public String toString(){
        String st = getName() + ": " + getID() + ": " + getAge();
        return st;
    }// end toSTring
    
    
    
} // end FormatTemplate
