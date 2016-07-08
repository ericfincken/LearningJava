/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Fincken
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,d,e; 
        a = 6;
        b = 74;
        c = 39;
        d = 105;
        e = 67;
        double[] mainArray = {a, b, c, d, e};
        
        double myAvg = average(mainArray);
        System.out.print(myAvg);
    }
   private static double average(double[] doubleArray){
      double sum = 0.0; 
      for(int i = 0; i < doubleArray.length; i++){
          sum += doubleArray[i];      
      }
      return sum / doubleArray.length;
   } 
}
