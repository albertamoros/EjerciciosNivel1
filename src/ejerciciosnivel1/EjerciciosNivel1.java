/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1;

/**
 *
 * @author Alberto
 */
public class EjerciciosNivel1 {

    //declaro un array de integers
    int[] listaNumeros = {33, 31, 200, 20, 5, 99};

    public int maximo(int[] lista) {
        int auxiliar = lista[0]; //el maximo va a ser el primer numero del array
        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }

    public static void main(String[] args) {
        EjerciciosNivel1 ejercicio = new EjerciciosNivel1();
        
        System.out.println("el maximo es: " + ejercicio.maximo(ejercicio.listaNumeros));
    }

}
