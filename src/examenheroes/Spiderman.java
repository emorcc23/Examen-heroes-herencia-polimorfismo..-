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
public class Spiderman extends Heroe{
    
    public Spiderman(String nombre, String apodo, int edad, String[] arrayPoderes) {
        super(nombre, apodo, edad, arrayPoderes);
    }
    
    private boolean poderAracnido = false;
    
    public int calcularPoderAracnido(boolean poderAracnido) {
        int fin;
        if (poderAracnido == true) {
            fin = 10;
        } else {
            fin = 2;
        }
        return fin;
    }

    
    
    @Override
    public int calcularPotencia(int edad) {
        int poderA = calcularPoderAracnido(poderAracnido);
        return super.calcularPotencia(edad) * poderA; 
    }

    public boolean isPoderAracnido() {
        return poderAracnido;
    }

    public void setPoderAracnido(boolean poderAracnido) {
        this.poderAracnido = poderAracnido;
    }
    
    
    
    
    
}
