package org.example.Screens;

import org.example.Constants.Colors;
import org.example.Factory.ComponentFactory;
import org.example.Main;
import org.example.Models.Player;
import org.example.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;

public class GameOverScreen {
    static JFrame frame;
    static JPanel panel = new JPanel();
    static JLabel title = ComponentFactory.getTitle("");

    static JButton tryAgainButton = new JButton("Jugar de nuevo");

    public static void show(Player player, boolean goodEnding) {
        panel.removeAll();
        panel.setBackground(Colors.backgroundColor);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(0, 1));

        tryAgainButton.addActionListener(e->{
            NavigationManager.showSplashScreen();
            dispose();
        });

        if (Main.players.size() > 1) {
            title.setText("Has arrazado " + player.getName());
        } else {
            title.setText(goodEnding ? "¡Correcto!" : "Respuesta incorrecta, ¿quieres intentar otra vez?");
        }
        panel.add(title);
        panel.add(tryAgainButton);
        frame = ComponentFactory.presentInNewFrame(panel);
    }

    public static void dispose() {
        frame.dispose();
    }
}
