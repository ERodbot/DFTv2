/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author em000
 */




public class EntityDummy implements Serializable{
    public Types type;
    public String nombre;
    public int range;
    public int vida;
    public int cantidadGolpes, nivel, campos, nivelAparicion, posx, posy;   
    public Register register = new Register(this.nombre, vida); //una clase registro para guardar los ataques recbidos/propiciados;
    ImageIcon moving; //imagen de la entidad en movimiento
    ImageIcon attacking;  
    
    EntityDummy(Types type, String bombre, int range, int vida, int cantidadGolpes, int nivel, int nivelAparicion, int posx, int posy, Register register){
        
    }
}
