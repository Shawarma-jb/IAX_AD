/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guias;

/**
 *
 * @author JBM
 * 20/09/26
 */

import java.io.Serializable;

/**
 * 
 * @author JBM
 * Componente JavaBean para la gestión de Profesores de FP.
 * Cumple los 4 requisitos para ser un JavaBean:
 * Atributos privados, Constructor vacío, Getter/Setter y Serializable
 */
public class Profesor implements Serializable {
    
    /**
     * 
     * @JBM 20/09/26
     * Requisito 1: Atributos privados
     */
    
    private String nombre;
    private String especialidad;
    
    /**
     * 
     * @JBM 20/09/26
     * Requisito 2 Constructor vacío obligatorio
     */
    
    public Profesor(){
    }
    
    /**
     * 
     * @param nombre
     * @param especialidad
     * @JBM 20/09/26
     * Constructor parametrizado (opcional, pero útil)
     */
    
    public Profesor (String nombre, String especialidad){
        this.nombre=nombre;
        this.especialidad=especialidad;
    }
    
    /**
     * 
     * @return 
     * @JBM 20/09/26
     * Requisito 3: Métodos de acceso públicos (Getters y Setters
     */
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }

    /**
     * @return 
     * @JBM 20/09/26
     * Sobreescritura opcional para mostrar los datos de forma limpia
     */
    
    @Override
    public String toString(){
        return "Profesor: "+ nombre + "|Especialidad: " + especialidad;
    }
}
