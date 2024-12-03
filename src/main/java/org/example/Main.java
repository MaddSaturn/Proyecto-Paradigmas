package org.example;

import org.example.Models.Player;
import org.example.Navigation.NavigationManager;

import java.util.ArrayList;

public class Main {
    /**Define una lista de jugadores*/
    public static ArrayList<Player> players;
    /**Identifica el jugador actual*/
    public static int currentPlayer = 0;
    /**
     *Metodo que ejecuta el juego
     */
    public static void main(String[] args) {
        /**Llama al gestor de navegacion e inicia el juego*/
        NavigationManager.showSplashScreen();
    }
}