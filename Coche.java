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
public class Coche {
    
private int velocidade ;

    public Coche(){
    velocidade =0 ;
}
    //public int getVelocidade() . Este método devolve a velocidade actual
    public int getVelocidade(){
    
        return  velocidade;
    }
//public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor
    public void acelerar (int incremento){
    
        velocidade += incremento;
        System.out.println("Acelerar,Velocidad actual "+velocidade);  
    }
 //public void frenar (int menos).Este método diminue a velocidade na cantidade menos.
    public void frenar (int menos){
    
        velocidade -= menos;
        System.out.println("Disminuir velocidad,Velocidad actual "+velocidade); 

    }
    //
    
    
}
