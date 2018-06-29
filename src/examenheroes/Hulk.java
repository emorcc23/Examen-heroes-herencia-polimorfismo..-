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
public class Hulk extends Heroe {

    private double peso = 70.1;

    public Hulk(String nombre, String apodo, int edad, String[] arrayPoderes, double peso) {
        super(nombre, apodo, edad, arrayPoderes);
        this.peso = peso;
    }
    
    @Override
    public int calcularPotencia(int edad) {
        return (int) (super.calcularPotencia(edad) * peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

}
