/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Jesús Quezada
 */
public class ClaseMain {
    
    public static void main(String[] args) {
        Metodos InstanciaSuma = new ClaseSuma();
        Metodos InstanciaResta = new ClaseResta();
        
        InstanciaSuma.PedirDatos();
        InstanciaSuma.Operaciones();
        InstanciaSuma.MostrarDatos();
        
        InstanciaResta.PedirDatos();
        InstanciaResta.Operaciones();
        InstanciaResta.MostrarDatos();
        
        
        
    }
    
}
