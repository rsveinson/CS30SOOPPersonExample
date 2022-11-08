import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     OOp Example 1 Person
 * 
 *  Description:    Simple implementation of a Person class
 * 
 *************************************************************/

public class Person {
    // ** class variables **
    
    // ** fields ***
    
    private String name;
    private int age;
    
    // ** constructors **
    
    // ** no-arg/default constructor
    public Person(){
        this.name = "unknown";
        this.age = 0;
    }// end default
    
    // full-arg constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }// end full arg
    
    // ** getters **
    
    // getters allow examination of the current state of the object
    public String getName(){
        return this.name;
    }// end get name
    
    public int getAge(){
        return this.age;
    }// end get age
    
    // ** setters **
    
    // setters allow the state to be changed
    public void setName(String n){
        this.name = n;
    }// end setName
    
    public void setAge(int a){
        this.age = a;
    }// end setAge
    
    // ** other **
    
    @Override
    public String toString(){
        String st = getName() + ": " + getAge();
        return st;
    }// end toSTring
    
    
    
} // end FormatTemplate
