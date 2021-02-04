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

    /**
     * método para quitar los esoacios en blanco 
     */
    private String quitaEspaciosEnBlanco(String cadena){
        // Acaso Hubo buhos aca
        // Acasohubobuhosaca
        String auxiliar = "";
        for (int i=0; i < cadena.length(); i++ ){
            //el comando charAt significa: "si la posicion de lo que tenga en el parentesis"
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
            
            
            
            
            
    
    public boolean esPalindromo( String frase){
        //este progtama devuelve verdadero si la frase tiene los mismos caracteres
        //de izquierda a derecha y de derecha a izquierda
        
        //primera fase: quitar espacios en blanco de la cadena
        String auxiliar2 = quitaEspaciosEnBlanco(frase);
        
        //2º pasamos a minusculas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();
        
        //voy a usar el metodo de los dos indices
        int indiceIzquierdo = 0;
        int indiceDerecho = auxiliar2.length()-1;
        
        while (auxiliar2.charAt(indiceIzquierdo) == auxiliar2.charAt(indiceDerecho)
                && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo < indiceDerecho){ // se ha salido antes de llegar al medio por lo que no es palindromo
            return false; // no es palindromo
        }
        else{
            return true; //si es palindromo porque los indices se han cruzado
        }
 
    }
        public boolean esIsograma( String palabra) {
            //este método devuelve treu si la palabra no 
            //tiene palabras repetidas
            palabra.toUpperCase();
           for (int i=0; i < palabra.length(); i++){
               for (int j=i+1; j<palabra.length(); j++){
                   if(palabra.charAt(i) == palabra.charAt(j)){
                       return false;
                   }
               }
           } 
            //si ha recorrido los dos bucles sin salir return false
            //es porque la palabra no tiene letras repetidas
            
            return true;
        }
       
    
    public static void main(String[] args) {
        EjerciciosNivel1 ejercicio = new EjerciciosNivel1();
        
        
        System.out.println("palindromo: " + ejercicio.esPalindromo("Acaso Hubo buhos aca"));
        System.out.println("palindromo: " + ejercicio.esPalindromo("esto no es"));
        
        System.out.println("el maximo es: " + ejercicio.maximo(ejercicio.listaNumeros));
        //segundo ejercicio: Palindromo
        
        System.out.println("la palabra murcielago " + ejercicio.esIsograma("murcielago"));
        System.out.println("la palabra careta " + ejercicio.esIsograma("careta"));
        
        
    }
}
