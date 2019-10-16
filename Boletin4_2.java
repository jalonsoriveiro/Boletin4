/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Satelite sate = new Satelite(2,1,1);
       
       System.out.println("Satelite +" +sate);
       sate.verPosicion();
    }
    
}
