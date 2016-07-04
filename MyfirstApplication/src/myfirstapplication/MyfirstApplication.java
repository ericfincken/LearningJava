/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

/**
 *
 * @author Fincken
 */
public class MyfirstApplication {
    static String output = "Hello World";
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println(output);
        int number1;
        number1 = 3;
        double number2;
        number2 = Math.pow(number1,2);
        System.out.println(number2);
        System.out.print("Enter the number to cube: ");
        double userInput = keyboard.nextDouble();
        double systemOutput = Math.pow(userInput, 3);
        System.out.println(System.lineSeparator()+ userInput + " cubed is " + systemOutput);
                
                
                
                
                
        
        
    }
    
}
