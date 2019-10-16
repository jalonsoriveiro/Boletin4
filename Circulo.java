/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;
    
/**
 *
 * @author jalonsoriveiro
 */
public class Circulo {
    private double radio;    
    private final double PI=3.14;

public  Circulo(){ //con void no se puede iniciar en el metodo main
    
}
public   Circulo(double m){
    radio = m;
   
}
public double calcularArea(){
 
    double area =PI*Math.pow(radio,2);
    //PI radio al cuadrado
    return area;
}
public double calcularLonxitude(){
 
    double lonxitude = 2*PI*radio;
    return lonxitude;
}


}
