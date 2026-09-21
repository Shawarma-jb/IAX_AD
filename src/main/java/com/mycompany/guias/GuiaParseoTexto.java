/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guias;

/**
 *
 * @author JBM
 * 20/09/26
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class GuiaParseoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imaginemos una línea de texto: "Sistemas Informáticos,6.5"
        
        String rutaFichero="modulos.txt";
        
        try(BufferedReader br=new BufferedReader(new FileReader(rutaFichero))){
            String linea;
            
            while((linea=br.readLine())!=null){
                //El método split divide la cadena usando la coma como separador
                String[]partes=linea.split(",");
                
                if(partes.length==2){
                String nombreModulo=partes[0].trim();
                
                //IMPORTANTE: Convertir el texto a tipo numérico
                
                double horas = Double.parseDouble(partes[1].trim());
                System.out.println("Módulo: " + nombreModulo + " necesita " + horas + " horas.");
                }
            }
        }catch(IOException e){
            System.err.println("Error de lectura: "+e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Error: Uno de los datos numéricos del fichero no es válido.");
        }
    }
    
}
