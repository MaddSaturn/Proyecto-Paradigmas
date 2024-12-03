import org.example.Factory.ComponentFactory;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Objects;

public class ComponentFactoryTest {
    /**
     * Sirve para revisar que los labels retornen el componente correcto
     */
    @Test
    void validateComponentFactoryJLabel() {
        assert ComponentFactory.getTitle("Buen dia") instanceof JLabel;
    }
    /**
     * Sirve para revisar que los labels retornen el componente correcto cuando tiene null como argumento
     */
    @Test
    void validateTitleComponentDoesntCrash (){
        assert ComponentFactory.getTitle(null) instanceof JLabel;
    }
    /**
     * Sirve para revisar que los labels retornen el valor correcto
     */
    @Test
    void labelTextIsCorrect() {
        assert Objects.equals(ComponentFactory.getTitle("Titulo").getText(), "Titulo");
    }
    /**
     * Sirve para revisar que los labels retornen el componente correcto
     */
    @Test
    void labelDescriptionTypeTest() {
        assert ComponentFactory.getDescription("Descripcion") instanceof JLabel;
    }
    /**
     * Sirve para revisar que los labels retornen el texto correcto
     */
    @Test
    void labelDescriptionTextIsCorrect() {
        assert ComponentFactory.getDescription("Desc").getText().equals("Desc");
    }
    /**
     * Sirve para revisar que los labels retornen el componente correcto cuando tiene null como argumento
     */
    @Test
    void presentInIframeWorks (){
        assert ComponentFactory.presentInNewFrame(null) instanceof  JFrame;
    }

}
