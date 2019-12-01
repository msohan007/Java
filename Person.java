/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Person {
    
    // Fields
    String Name;
    int Age;
    String Gender;
    double Height; 
    
    // Methods
    public double getHeightInches(){
        
        // Assuming Height is in centimeters
        return Height/2.54;
        
    }
}
