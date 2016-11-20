/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

/**
 *
 * @author manjiltamang
 * Engine code
 * Respective methods created for calculation.
 * Nov 2, 2016
 */
public class CalcEngine {
    private double num1,num2;
    
    /**
     * default constructor
     */
    
    public CalcEngine(){
    }
    
     /**
     * Overloaded Constructor
     *
     * @param num1
     * @param num2
     */
    public CalcEngine(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1 + num2;
    }
    
    public double sub(){
        return num1 - num2;
    }
    
    public double mul() {
        return num1 * num2;
    }
    public double div(){
        return num1 / num2;
    }
}
