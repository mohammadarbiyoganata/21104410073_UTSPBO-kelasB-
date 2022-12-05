/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KineticCalc;

/**
 *
 * @author ASUS
 */
public class Kinetic {
    private double M;
    public double getM(){
        return M;
    }
    public void setM(double M){
        this.M = M;
    }
    private double V;
    public double getV(){
        return V;
    }
    public void setV(double V){
        this.V = V;
    }
    static double kinetic(double M, double V){
        double kinetic;
        kinetic = 0.5 *M*V*V;
    
    
    
        
        
        return kinetic;
    }
}
