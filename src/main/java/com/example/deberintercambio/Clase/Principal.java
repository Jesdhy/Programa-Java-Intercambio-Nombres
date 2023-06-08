package com.example.deberintercambio.Clase;

public class Principal {

    public static void main(String[] args) {

        //creacion objetos
        Persona sr = new Persona();
        Dog an = new Dog();
        Guardar r = new Guardar();

        //ingresar nombres
        sr.NombrePersona();
        an.NombreDog();


        System.out.println("Nombre De la persona: "+sr.getNombre()+"\n");
        System.out.println("Nombre del perrito: "+an.getNombre()+"\n");

        // Se guarda el nombre de la persona para que este luego no cambie
        r.setAux(sr.getNombre());

        //Intercambio de nombres
        sr.setNombre(an.getNombre());
        an.setNombre(r.getAux());

        System.out.println("---------------- INTERCAMBIO ---------------------");
        System.out.println("Nuevo nombre De la persona: "+sr.getNombre()+"\n");
        System.out.println("Nuevo nombre del perrito: "+an.getNombre()+"\n");

    }
}
