import org.example.Constants.Fonts;
import org.junit.jupiter.api.Test;

public class FontsTest {
    /**
     * Sirve para revisar que las fuentes no sean nulas
     */
    @Test
    void validateTitleFontIsNotNull() {
        assert Fonts.title != null;
    }
    /**
     * Sirve para revisar que las fuentes coincidan con el tamaño indicado
     */
    @Test
    void validateTitleFontSize() {
        assert Fonts.title.getSize() == 24;
    }
    /**
     * Sirve para revisar que las fuentes no sean nulas
     */
    @Test
    void validateSubtitleFontIsNotNull() {
        assert Fonts.subTitle != null;
    }
    /**
     * Sirve para revisar que las fuentes coincidan con el tamaño indicado
     */
    @Test
    void validateSubtitleFontSize() {
        assert Fonts.subTitle.getSize() == 20;
    }
    /**
     * Sirve para revisar que las fuentes no sean nulas
     */
    @Test
    void validateDescriptionFontIsNotNull() {
        assert Fonts.description != null;
    }
    /**
     * Sirve para revisar que las fuentes coincidan con el tamaño indicado
     */
    @Test
    void validateDescriptionFontSize() {
        assert Fonts.description.getSize() == 16;
    }
}
