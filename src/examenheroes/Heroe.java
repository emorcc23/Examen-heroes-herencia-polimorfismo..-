/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenheroes;

/**
 *
 * @author alu520994162
 */
public class Heroe {
    private String nombre = "alvaro";
    private String apodo = "novato";
    private int edad = 2;
    String arrayPoderes [] = {"fuerza","velocidad","volar","destruir"};


    public Heroe() {}

    public Heroe(String nombre, String apodo, int edad, String[] arrayPoderes) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.arrayPoderes = arrayPoderes;
    }

    
    public void showPoderes() {
        for (String mostrar : arrayPoderes) {
            System.out.println("Los poderes son: "+mostrar);
        }
    }
   
    public void borrarPoderes() {
        for (int i = 0; i < arrayPoderes.length; i++) {
            arrayPoderes[i] = "";
        }
    }
    
    public int calcularPotencia(int edad) {
        return edad * 30;
    }
    
    
    public void setPoder(String poder, int posicion) {
        arrayPoderes[posicion] = poder;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getArrayPoderes() {
        return arrayPoderes;
    }

    public void setArrayPoderes(String[] arrayPoderes) {
        this.arrayPoderes = arrayPoderes;
    }
    
    
}
