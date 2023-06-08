package com.example.deberintercambio.Clase;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String Fecha_Nacimiento;
    private String Id;

    public Persona() {

    }

    public Persona(String nombre, int edad, String Fecha_Nacimiento, String Id) {
        this.nombre = nombre;
        this.edad = edad;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void NombrePersona (){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre de la persona: ");
        nombre = leer.next();

    }
}

