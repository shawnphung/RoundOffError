/*
 * Shawn Phung
 * Feb 18, 2020
 * Compares the 
 */

package roundingerror.java;
import javax.swing.*;
/**
 *
 * @author shphu0697
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Please enter a number");
         int inputNum = Integer.parseInt(input);
         double root = Math.sqrt(inputNum);
         double finalNum = root * root;
         
         System.out.println("The square of the square: " + finalNum);
         System.out.println("The round-off error: " + (inputNum - finalNum));
    }
    
}
    