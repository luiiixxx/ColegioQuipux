/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.edu.semillero.ecuelaQuipux.validacion;

/**
 *
 * @author Gris
 */
public class loginValidacion {
    
    public boolean login(String Usuario, String Clave){
    if(Usuario.equals("")){
        System.out.println("no ingreso usuario");
        return false;
    }
    if(Clave.equals("")){
        System.out.println("no ingreso clave");
        
        return false;
    }
    
    return true;
    }
    
}
