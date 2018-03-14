
package rectangle.area.calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Henry
 */
public class RectangleAreaCalculator {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        /*
        This input box asks user to enter the width of the rectangle
        */
        String width;
        width = JOptionPane.showInputDialog("Rectangle Width");
        
         /*
        This input box asks user to enter the height of the rectangle
        */
        String height;
        height = JOptionPane.showInputDialog("Rectangle Height");
        
        /*
        * The height and width inputs (Strings) are converted to doubles to return a product of area of the rectangle
        */
        double area = Double.parseDouble(width) * Double.parseDouble(height);
        
        /*
         * The area of the rectangle is calculated and displayed to the user
        */
        JOptionPane.showMessageDialog(null, "Answer =" + " " + area);
       
        /*
        Closes the program
        */
       System.exit(0);
    }
    
}

