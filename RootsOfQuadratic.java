/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roots.of.quadratic;

import javax.swing.JOptionPane;

/**
 *
 * @author shahe
 */
public class RootsOfQuadratic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int co1 = Integer.parseInt(JOptionPane.showInputDialog("Enter co-efficient of x^2"));
        int co2 = Integer.parseInt(JOptionPane.showInputDialog("Enter co-efficient of x^1"));
        int co3 = Integer.parseInt(JOptionPane.showInputDialog("Enter co-efficient of x^0"));
        
        double sqrt = Math.pow(co2,2) - 4*co1*co3;
        if (sqrt < 0){
            double re = -co2/(2*co1);
            double im = Math.sqrt(-sqrt)/(2*co1);
            
            Complex1 ans1 = new Complex1(re, im);
            Complex1 ans2 = new Complex1(re, im);
            
            JOptionPane.showMessageDialog(null, ans1 +"\n"+ ans2);
        }
        else{
            double ans1 = (-co2+Math.sqrt(Math.pow(co2, 2) - 4*co1*co3))/(2*co1);
            double ans2 = (-co2-Math.sqrt(Math.pow(co2, 2) - 4*co1*co3))/(2*co1);
            
            JOptionPane.showMessageDialog(null, ans1 +"\n"+ ans2);
        }
    }
}
