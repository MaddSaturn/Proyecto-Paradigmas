/**
 * Clase que se encarga de administrar los componentes mediante getter de las constantes
 * En: Nov 14 de 2024
 *
 * @autor: Maria Paula Rodriguez Diaz
 * @documentador: Giancarlo Ramirez Pulido, David Perez Alvarado
 * @QA: Maria Paula Rodriguez Diaz, Giancarlo Ramirez Pulido, David Perez Alvarado
 * Desc: En esta clase se almacenan los componentes a ser usados en la interfaz del juego
 */

package org.example.Factory;

import org.example.Constants.Fonts;
import org.example.Constants.Labels;

import javax.swing.*;
import java.awt.*;

/**
 * Define la clase que se encarga de crear componentes custom
 */

public class ComponentFactory {
    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Título
     * @param titleText el texto que se va a renderizar
     * @return JLabel
     */
    public static JLabel getTitle(String titleText) {
        JLabel title = new JLabel(titleText);
        title.setFont(Fonts.title);
        title.setForeground(Color.white);
        return title;
    }

    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de subtítulo
     * @param subTitleText el texto que se va a renderizar
     * @return JLabel
     */
    public static JLabel getSubTitle(String subTitleText) {
        JLabel title = new JLabel(subTitleText);
        title.setFont(Fonts.subTitle);
        title.setForeground(Color.white);
        return title;
    }

    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Descripción
     * @param descriptionText el texto que se va a renderizar
     * @return JLabel
     */
    public static JLabel getDescription(String descriptionText) {
        JLabel title = new JLabel(descriptionText);
        title.setFont(Fonts.description);
        title.setForeground(Color.white);
        return title;
    }

    /**
     * Gestiona todos los componentes de tipo Etiqueta para ser usado en las demás clases de Panel
     * @param panel panel a presentar
     * @return JPanel
     */
    public static JFrame presentInNewFrame(JPanel panel) {
        JFrame frame = new JFrame();
        if (panel != null) {
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle(Labels.gameTitle);
            frame.getContentPane().setBackground(new Color(112, 177, 181));
            frame.pack();
            frame.setVisible(true);
        }
        return frame;
    }
}
