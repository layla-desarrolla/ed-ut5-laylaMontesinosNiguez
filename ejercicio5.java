package practica5;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad total de puntos a crear: ");
        int cantidad = sc.nextInt();//guardamos la cantidad de veces que vamos a crear el objeto Punto

        Punto[] arrays = new Punto[cantidad]; //creamos un array en el que decimos que contendrá tantos objetos de la clase Punto como cantidad pongamos anteriormente

        for(int i = 0; i < cantidad; i++){
            Punto punto = new Punto((Math.random()*10), (Math.random()*10));//creamos un Punto con las coordenadas aleatorias
            punto.muestra(); //mostramos dicho punto
            arrays[i] = punto;//almacenamos la informacion en el array
        }
    }
}
