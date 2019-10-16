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
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo primero = new Circulo(3);
        double area = primero.calcularArea();
       
        Circulo segundo = new Circulo(2);
        double area2 = segundo.calcularArea();
        System.out.print(area+"-"+area2);
        
        double lonxitude2 = segundo.calcularLonxitude();
        double lonxitude1 = primero.calcularLonxitude();
        System.out.println("\nLoxitude 1 "+lonxitude1+"  Loxitude 2  "+lonxitude2);
        
        
        
        
    }
    
}
