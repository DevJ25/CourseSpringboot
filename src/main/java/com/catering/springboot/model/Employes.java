package com.catering.springboot.model;

public class Employes {
private String name,lastName, direccion, puesto;
private int edad, telefono, salario;

public Employes(String name, String lastName, String direccion, String puesto, int edad, int telefono, int salario) {
    this.name = name;
    this.lastName = lastName;
    this.direccion = direccion;
    this.puesto = puesto;
    this.edad = edad;
    this.telefono = telefono;
    this.salario = salario;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getPuesto() {
    return puesto;
}
public void setPuesto(String puesto) {
    this.puesto = puesto;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public int getTelefono() {
    return telefono;
}
public void setTelefono(int telefono) {
    this.telefono = telefono;
}
public int getSalario() {
    return salario;
}
public void setSalario(int salario) {
    this.salario = salario;
}


}
