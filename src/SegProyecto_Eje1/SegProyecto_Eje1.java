/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegProyecto_Eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class SegProyecto_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Persona> personas = new ArrayList <Persona>();
      Scanner sc = new Scanner (System.in);
      
        Persona fulanito = new Persona();
        String nom = fulanito.nombre;
        String apell = fulanito.apellido;
        String sexo = fulanito.sexo;
        int edad = fulanito.edad;
        System.out.println("Digite su nombre");
        nom = sc.next();
        System.out.println("Digite su apellido");
        apell = sc.next();
        System.out.println("Digite su edad");
        edad = sc.nextInt();
        System.out.println("Digite su sexo");
        sexo=sc.next();
        
   fulanito.setNombre(nom);
   fulanito.setApellido(apell);
   fulanito.setEdad(edad);
   fulanito.setSexo(sexo);  
    
        System.out.println();
            System.out.println("LOS DATOS INGRESADOS SON:");
        System.out.println();
   
        System.out.println("Nombre: "+fulanito.getNombre());
        System.out.println("Apellido: "+fulanito.getApellido());
        System.out.println("Edad: "+fulanito.getEdad());
        System.out.println("Sexo: "+fulanito.getSexo());
   
   
}
}