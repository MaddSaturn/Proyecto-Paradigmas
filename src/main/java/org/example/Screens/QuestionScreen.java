/**
 * Clase con las pantallas de preguntas
 * En: Nov 12 de 2024
 *
 * @autor: Maria Paula Rodriguez Diaz
 * @documentador: Giancarlo Ramirez Pulido, David Perez Alvarado
 * @QA: Maria Paula Rodriguez Diaz, Giancarlo Ramirez Pulido, David Perez Alvarado
 */

package org.example.Screens;

import org.example.Constants.Colors;
import org.example.Data.Data;
import org.example.Factory.ComponentFactory;
import org.example.Main;
import org.example.Models.Player;
import org.example.Models.Question;
import org.example.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Muestra la pregunta con los jugadores y los puntos que tienen actualmente
 */

public class QuestionScreen {  //clase para crear os elementos de la pantalla de pregunta
    public static ArrayList<Question> questions = Data.getQuestions();
    static JFrame frame;
    static JPanel panel = new JPanel(); //Contenedor de objetos de interfaz gráfica
    static JLabel title = ComponentFactory.getTitle(null);
    static JLabel currentPlayerName = ComponentFactory.getSubTitle(null);
    static JLabel twoPlayerName = ComponentFactory.getDescription(null);
    static Question question;

    /**
     * Obtiene una pregunta y la presenta en un panel
     */
    public static JPanel showQuestion() {
        getQuestion();//obtiene la pregunta

        panel.setBackground(Colors.backgroundColor);//Setea el color del fondo
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));//Define espacios en blanco
        panel.setLayout(new GridLayout(0, 1));//Define el layout de la vista

        frame = ComponentFactory.presentInNewFrame(panel);//Presenta el panel

        return panel;//retorna el panel

    }

    /**
     * Obtiene una pregunta al azar usando la data de la clase Data
     */
    private static void getQuestion() {
        Player currentPlayer = Main.players.get(Main.currentPlayer);//Guarda en una variable el jugador actual

        panel.setVisible(false);//Esconde el panel mientras se limpia
        panel.removeAll();//Remueve el contenido del panel para evitar duplicidad

        question = questions.get(new Random().nextInt(questions.size()));//Obtiene una pregunta del listado con unnumero randome

        JPanel hud = new JPanel();//Crea el hud de los usuarios y los puntos
        hud.setLayout(new GridLayout(0, 2));//Define el tipo del layout
        hud.setBackground(Colors.backgroundColor);//Define el color de fondo
        hud.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));//Le damos margenes
        currentPlayerName.setText(currentPlayer.getName());//Se pone el nombre del primer jugador
        hud.add(currentPlayerName);// se agrega al hud

        if (Main.players.size() > 1) {//Si es man de un jugador
            Player secondPlayer = Main.players.get(Main.currentPlayer == 0 ? 1 : 0);//se guarda en una variable el jugador 2
            twoPlayerName.setText(secondPlayer.getName());//Se setea el label del jugador 2
            hud.add(twoPlayerName);//Se agrega al hud
        }

        JLabel currentPlayerPoints = ComponentFactory.getDescription("Puntos: " + currentPlayer.getPoints());//Se presentan los puntos del jugador 1
        hud.add(currentPlayerPoints);//Se agrega al hud

        if (Main.players.size() > 1) {//Si es man de un jugador
            Player secondPlayer = Main.players.get(Main.currentPlayer == 0 ? 1 : 0);//se guarda en una variable el jugador 2
            JLabel secondPlayerPoints = ComponentFactory.getDescription("Puntos: " + secondPlayer.getPoints());//Se muestran los puntos del jugador 2
            hud.add(secondPlayerPoints);//Se agrega al hud
        }

        panel.add(hud);//se agrega el hud al panel
        title.setText("<html>" + question.getQuestion() + "</html>");//Se setea la pregunta
        panel.add(title);//se agrega la pregunta

        List<String> answers = question.getAnswers();//Se listan las posibles respuestas
        for (int i = 0; i < answers.size(); i++) {//por cada una de ellas
            String currentAnswer = answers.get(i);//Se obtiene la respuesta
            JButton button = new JButton(currentAnswer);//se crea un boton
            button.addActionListener(e -> {//Se le da accion al boton
                    NavigationManager.submitAnswer(Objects.equals(currentAnswer, question.getRightAnswer()), questions.indexOf(question));//Llamamos al gestor de navegacion y le informamos
            });
            panel.add(button);//Se agrega al panel
        }
        panel.setVisible(true);//se hace visible

        JButton passButton = new JButton("No se, paso");//agregamos el boton de pasar
        passButton.addActionListener(e -> {//le damos accion
            getQuestion();//obtenemos una preugunta nueva
        });
        panel.add(passButton);// agregamos el boton de pasaar
    }

    /**
     * Oculta la vista actual
     */
    public static void dispose() {
        frame.dispose();
    }
}
