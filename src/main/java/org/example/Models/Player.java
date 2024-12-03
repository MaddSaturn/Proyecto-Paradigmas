/**
* Clase usada para el objeto jugador personalizado como modelo
*En: Nov 15 de 2024
*@autor: Maria Paula Rodriguez Diaz
*@documentador: Giancarlo Ramirez Pulido, David Perez Alvarado
*@QA: Maria Paula Rodriguez Diaz, Giancarlo Ramirez Pulido, David Perez Alvarado
*/
package org.example.Models;

public class Player {
    public int points; //crea el atributo puntaje del jugador
    private String name;//define el atributo del nombre

    public Player(String name) { //inicializa el jugador
        this.name = name;//inicializa el nombre
        this.points = 0;//inicializa el puntaje
    }

    public String getName() {
        return name;
    }//obtiene el nombre

    public void setName(String name) {
        this.name = name;
    }//setea el nombre

    public int getPoints() {
        return points;
    }//obtiene los puntos

    public void setPoints(int points) {
        this.points = points;
    }//setea los puntos
}
