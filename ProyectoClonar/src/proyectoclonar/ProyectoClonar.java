/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclonar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw103
 */
public class ProyectoClonar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sx = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sv = new Scanner(System.in);

//Recoge el tamaño del array

        System.out.print("Introduzca el tamaño del array: ");
        int TamArray = sc.nextInt();

//Crea el array con el tamaño indicado

        int[] array = new int[TamArray];
        
//Agrega los primeros numeros de forma aleatoria dependiendo del tamaño.        
        
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int NumRandom = rnd.nextInt(100);

            array[i] = NumRandom;
        }

//Muestra el array

        System.out.print("Array: ");
        for (int m = 0; m < TamArray; m++){System.out.print(array[m]+", ");}
        System.out.println("");

//Menu que pregunta al usuario si quiere seguir introduciendo numeros o parar.

        System.out.println();
        System.out.println("1= Introduce otro numero: ");
        System.out.println("Otro numero= Finaliza el programa: ");
        System.out.print("¿Cual eliges? ");
        int Resp = sx.nextInt();

        int NumIntro; 

//Bucle para introducir un numero nuevo depediendo de la respuesta del usuario
//Si la Resp es 1 se introduce un numero nuevo y si es otro numero se finaliza el programa 

        while (Resp==1) {
            System.out.print("¿Que numero deseas introducir?: ");
            NumIntro = sv.nextInt();

//Aqui se crea el array nuevo con distinto tamaño introduciendo los numeros del primer array y luego el numero nuevo. 
            int[] array2 = new int[TamArray + 1];
            TamArray = TamArray + 1;

            for (int j = 0; j < array.length; j++) {
                array2[j] = array[j];
            }
            array2[TamArray - 1] = NumIntro;

//Transforma el array nuevo en el array principal para asi poder introducir otros nuemeros.
            array = array2;

//Aqui se ordena el array            
            int aux;
            for (int q = array.length - 1; q != 0; q--) {
                for (int k = 0; k < q; k++) {
                    if (array[k] > array[k + 1]) {
                        aux = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = aux;
                    }
                }
            }
//Muestra el array ordenado.

            System.out.print("Array: ");
            for (int m = 0; m < TamArray; m++){System.out.print(array[m]+", ");}
            System.out.println("");

//Vuelve a preguntar.

            System.out.println();
            System.out.println("1= Introduce otro numero: ");
            System.out.println("Otro numero= Finaliza el programa: ");
            System.out.print("¿Cual eliges? ");
            Resp = sx.nextInt();

//Muestra el array        
            System.out.print("Array: ");
            for (int m = 0; m < TamArray; m++){System.out.print(array[m]+", ");}
            System.out.println("");
        };
        ;
    }
    
}
