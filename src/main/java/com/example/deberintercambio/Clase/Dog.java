package com.example.deberintercambio.Clase;


import java.util.Scanner;


public class Dog {
    private String nombre;
    private String Fecha_Nacimiento;
    private String edad;

    public Dog() {

    }

    public Dog(String nombre, String Fecha_Nacimiento, String edad) {
        this.nombre = nombre;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public void NombreDog (){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre del perrito: ");
        nombre = leer.next();

    }



}

   System.out.println("REVISADO POR EDWIN D ");
    System.out.println("REVISADO POR Karina ");
     System.out.println("REVISADO POR segunda vez");
