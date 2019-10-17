/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author jalonsoriveiro
 */
public class Conta {
	private String nombreCliente;
	private String conta;
	private double interese;
	private double saldo;
public Conta(){
saldo =0;
}

public Conta(String m,String x,double i,double y){

	nombreCliente =m;
	conta =x;
	interese = i;
	saldo = y;
}
	//Métodos setters/ getters para asignar e obter os datos da conta.
	public void setCombre (String NuevoNombre){    
    	nombreCliente = NuevoNombre;
    	System.out.println("Nuevo Nombre de cliente "+nombreCliente);    
	}
	public String getCombre (){   	 
    	return nombreCliente;
	}
	public void setConta (String NuevaCuenta){    
    	conta = NuevaCuenta;
    	System.out.println("Nuevo Nombre de cliente "+conta);    
	}
   
    
	public String getConta (){   	 
    	return conta;    
	}
	public void setInterese (double nuevoInteres){    
    	interese = nuevoInteres;
    	System.out.println("Nuevo interese "+interese);    
	}    
	public double getInterese (){
    	return interese;
	}
	public void setSaldo (double nuevoSaldo){    
    	saldo = nuevoSaldo;
    	System.out.println("Nuevo Saldo "+saldo);    
	}	 
 	public void setIngreso (double NuevoIngreso){  
    	//Un ingreso consiste en aumentar o saldo na cantidade que se indique
    	saldo +=Math.abs(NuevoIngreso);   	 
    	System.out.println("Nuevo Saldo despues del ingreso de "+NuevoIngreso+",Actual= "+saldo);    
	}   
	public void setReintegro (double NuevoReintegro){  
    	//Un reintegro consiste en diminuír o saldo nunha cantidade  A cantidade non pode ser negativa.
    	saldo -= Math.abs(NuevoReintegro);
    	System.out.println("Nuevo Saldo despues del reintegro"+NuevoReintegro+",Saldo ="+saldo);             	 
	}  
	public double getSaldo (){
    	return saldo;
	}
	//Transferencia
    
	//public void transferencia (Conta cuenta1 ,Conta cuenta2){  
   	public void transferencia (double cuenta1 ,double cuenta2,float cantidad){  
    	
            cuenta1 -= cantidad;
            cuenta2 += cantidad;
            
            System.out.println("transferencia de la cuenta con saldo"+cuenta1+"<> a la cuenta con saldo"+cuenta2);             	 
   	 
	}
    
    
    
    
	//Método transferencia que permita pasar diñeiro dunha conta a outra  Exemplo de uso do método transferencia:
//cuentaOrigen.transferencia( cuentaDestino, importe); que indica que queremos facer unha transferencia desde cuentaOrigen a cuentaDestino do importe indicado.
//Proba o funcionamento da clase Conta  na clase principal.
    
    
    
    
    
}
