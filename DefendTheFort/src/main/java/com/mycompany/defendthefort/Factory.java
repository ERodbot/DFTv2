/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defendthefort;

import java.util.ArrayList;

/**
 *
 * @author em000
 */

public class Factory {
   
 

    static Entity build(Types entityType, EntityDummy base, Grid grid){
    Entity created;
        switch(entityType){
            case ZOMBIEAEREO:
                 created = new ZombieAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case ZOMBIECHOQUE:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case ZOMBIECONTACTO:
                 created = new ZombieContacto(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case ZOMBIEMEDIO:
                 created = new ZombieMedio(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSAAEREO:
                 created = new DefensaAereo(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSABLOQUE:
                 created = new DefensaBloque(base.nombre, base.vida, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSACONTACTO:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSAIMPACTO:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSAMEDIO:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;
            case DEFENSAMULTIPLE:
                 created = new ZombieChoque(base.nombre, base.vida, base.cantidadGolpes, base.nivel, base.campos, base.nivelAparicion, grid, base.moving, base.attacking);
                 break;          
            case default:
                return null;
        }
    created.setRegister(base.register);
    created.setRange(base.range);
    created.setLocation(base.posx, base.posy);
    return created;
    }
    
    
    
    static ArrayList<Entity> convertToRealEntity(ArrayList<EntityDummy> array, Grid grid){
        ArrayList<Entity> res = new ArrayList<Entity>(); 
        for(EntityDummy dummy: array){ 
           res.add(Factory.build(dummy.type, dummy, grid));
       }
        return res;
    }
       
}