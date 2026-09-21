/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guias;

/**
 *
 * @author JBM
 * 02/09/26
 */
import java.io.*;


public class GuiaSerializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivoBinario="profesor_guardado.dat";
        Profesor profEnviado=new Profesor("Marta Gómez","Informática");
    
        //----PARTE A: SERIALIZACIÓN(Escribir Objeto)---------

        System.out.println("1. Guardando objeto en archivo binario...");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(archivoBinario))){

        oos.writeObject(profEnviado); //Guardamos el objeto completo de golpe
        System.out.println("Objeto guardado con éxito.");
        }catch(IOException e){
            System.err.println("Error al guardar: "+e.getMessage());
        }

        //-------PARTE B: DESERIALIZACIÓN (Leer Objeto)--------
        System.out.println("\n2. Recuperando objeto del archivo binario...");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(archivoBinario))){

            //Leemos el objeto y le hacemos un "casting" al tipo de clase correcto
            Profesor profRecuperado=(Profesor)ois.readObject();
            System.out.println("Objeto recuperado con éxito:");
            System.out.println(profRecuperado);//Ejecuta su método toString()
        }catch(IOException|ClassNotFoundException e){
            System.err.println("Error al recuperar: "+e.getMessage());
        }
    }
    
}
