
package tp5;


public class PruebaArreglo {
    public static void main(String[] args) {
        // Prueba del método sumarLista
        int[] lista = {1, 2, 3, 4, 5};
        Arreglo.sumarLista(lista);
        
        // Prueba del método buscarMayor
        int[][] arreglo = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int mayor = Arreglo.buscarMayor(arreglo);
        System.out.println("El mayor elemento del arreglo es: " + mayor);
        
        // Prueba del método cuentaVocales
        String cadena = "Hola mundo!";
        int cantidadVocales = Arreglo.cuentaVocales(cadena);
        System.out.println("La cadena \"" + cadena + "\" tiene " + cantidadVocales + " vocales.");
        
        // Prueba del método cuentaCaracter
        String cadena2 = "Hola mundo!";
        char caracter = 'o';
        int cantidadCaracter = Arreglo.cuentaCaracter(cadena2, caracter);
        System.out.println("La cadena \"" + cadena2 + "\" tiene " + cantidadCaracter + " veces el caracter '" + caracter + "'.");
    }
}

