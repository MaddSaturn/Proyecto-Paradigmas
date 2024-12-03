import org.example.Constants.Colors;
import org.junit.jupiter.api.Test;

public class ColorsTest {
    /**
     * Test background Color sirve para revisar que los valores no se encuentren nulos
     */
    @Test
    void testBackgroundColor (){
        assert Colors.backgroundColor != null;
    }
}
