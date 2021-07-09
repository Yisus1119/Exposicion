/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
import java.util.Scanner;
/**
 *
 * @author Jesús Quezada
 */
public abstract class Metodos {
    public int valor1,valor2,resultado;
    Scanner leer = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.println("Ingrese el primer numero: ");
        valor1= leer.nextInt();
        
        System.out.println("Ingrese el segundo valor: ");
        valor2 = leer.nextInt();
    }  
    
    
    public abstract void Operaciones();
    
    public void MostrarDatos(){
        System.out.println("El resultado es: "+resultado);
    }
    
}
