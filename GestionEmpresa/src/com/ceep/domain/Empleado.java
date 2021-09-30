package com.ceep.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LORENA
 */
public class Empleado extends Persona {

    static int idEmpleado;
    double sueldo;

    public Empleado(double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.sueldo = sueldo;
        this.idEmpleado = ++idEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //HACE REFERENCIA AL CONSTRUCTOR VACIO
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {
        this.idEmpleado = ++idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //CON EL SUPER HEREDA EL METODO TOSTRING DE LA CLASE PADRE
    @Override
    public String toString() {
        return "\n- idEmpleado : " + idEmpleado + "\n- Sueldo : " + sueldo + super.toString();
    }

}
