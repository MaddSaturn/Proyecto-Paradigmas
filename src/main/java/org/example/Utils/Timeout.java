/**
 * Clase Timeout
 * En: Nov 21 de 2024
 *
 * @autor: Maria Paula Rodriguez Diaz
 */
package org.example.Utils;
/**
 *Clase que se encarga de ejecutar un callback despues de un delay
 */
public class Timeout {
    public static void setTimeout(Runnable runnable, int delay) {//recibe el callback y los milisegundos del delay
        new Thread(() -> { //Declara el nuevo hilo
            try {
                Thread.sleep(delay); //Espera el tiempo recibido en el delay
                runnable.run();//corre el callback
            } catch (Exception e) {
                System.err.println(e);//Si falla imprime el error
            }
        }).start();//Corre el hilo
    }
}

