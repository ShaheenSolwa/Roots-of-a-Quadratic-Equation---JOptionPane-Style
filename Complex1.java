/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roots.of.quadratic;
import java.util.*;
/**
 *
 * @author shahe
 */
public class Complex1 {
     private final double re;   // the real part
    private final double im;   // the imaginary part

 
    public Complex1(double real, double imag) {
        re = real;
        im = imag;
    }

 
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

 
    public double abs() {
        return Math.hypot(re, im);
    }


 
    public double phase() {
        return Math.atan2(im, re) * (180/Math.PI);
    }
    
    public double Phase(){
        return Math.atan(im/re) * (180/Math.PI);
    }
    
 
    public Complex1 plus(Complex1 b) {
        Complex1 a = this;             // invoking object
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex1(real, imag);
    }

 
    public Complex1 minus(Complex1 b) {
        Complex1 a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex1(real, imag);
    }

 
    public Complex1 times(Complex1 b) {
        Complex1 a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex1(real, imag);
    }

 
    public Complex1 scale(double alpha) {
        return new Complex1(alpha * re, alpha * im);
    }

 
    public Complex1 conjugate() {
        return new Complex1(re, -im);
    }

     public Complex1 reciprocal() {
        double scale = re*re + im*im;
        return new Complex1(re / scale, -im / scale);
    }

 
    public double re() { return re; }
    public double im() { return im; }

 
    public Complex1 divides(Complex1 b) {
        Complex1 a = this;
        return a.times(b.reciprocal());
    }

 
    public Complex1 exp() {
        return new Complex1(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
    }

 
    public Complex1 sin() {
        return new Complex1(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
    }

 
    public Complex1 cos() {
        return new Complex1(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
    }


    public Complex1 tan() {
        return sin().divides(cos());
    }
    
    public static Complex1 fromPolar(double r, double theta) {
    return new Complex1(r*Math.cos(theta), r*Math.sin(theta));
    }

    
    public static Complex1 plus(Complex1 a, Complex1 b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex1 sum = new Complex1(real, imag);
        return sum;
    }

    
    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex1 that = (Complex1) x;
        return (this.re == that.re) && (this.im == that.im);
    }

   
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
