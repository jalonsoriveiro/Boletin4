/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche M2 = new Coche();
        int velocidad = M2.getVelocidade();        
        System.out.println("Velocidad Actual "+velocidad);  
        //
        M2.acelerar(20);
        M2.frenar(10);
        
    }
    
}
