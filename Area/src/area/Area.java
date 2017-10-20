// Java application program to calculate the area of a triangle, rectangle or circle

package area;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Austine
 */
public class Area {
//    declare static variables

    static double area;
    static int shape;
    static String circle, rectangle, Triangle;

    public static void main(String[] args) {
//        input the shape of the cbject

        try {
            shape = Integer.parseInt(JOptionPane.showInputDialog(null, "Select: \n 1 for \t triangle\n 2 for \t rectange \n 3 for \t circle"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Invalid input!!","Error!!Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        switch (shape) {
            case 1:
//                area of a triangle
                try {
                    double h = Double.parseDouble(JOptionPane.showInputDialog(null, "enter the height of a Triangle."));
                double b = Double.parseDouble(JOptionPane.showInputDialog(null, "enter the base of a Triangle."));
                JOptionPane.showMessageDialog(null, "Area = "+String.format("%.2f",  (0.5 * b * h)), "Area of Triangle", JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Invalid input!!","Error!!Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
                }
                
                 

                break;

            case 3:
//            area of circle
                try {
                    double diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "enter the diameter of a circle."));

                double radius = diameter / 2;

                JOptionPane.showMessageDialog(null, "Area = "+String.format("%.2f",  Math.PI * Math.pow(radius, 2)), "Area of circle", JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException | NumberFormatException e) {
                   JOptionPane.showMessageDialog(null,"Invalid input!!","Error!!Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0); 
                }
                break;
            case 2:
//            are of rectangle
               
                try { 
                    double length = Double.parseDouble(JOptionPane.showInputDialog(null, "enter the length of a rectangle."));
                double w = Double.parseDouble(JOptionPane.showInputDialog(null, "enter the width of a rectangle."));
                
                JOptionPane.showMessageDialog(null, "Area = "+String.format("%.2f",  (length * w)), "Area of Rectangle", JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Invalid input!!","Error!!Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0); 
                }
                break;

            default:
                break;

        }
        System.out.println(area);
    }
}
