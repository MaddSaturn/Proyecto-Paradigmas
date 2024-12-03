import org.example.Constants.Labels;
import org.junit.jupiter.api.Test;

public class LabelsTests {
    /**
     * Sirve para revisar que los strings no sean nulos ni vacios
     */
    @Test
    void validateInitLabelIsNotNull() {
        assert Labels.initGame != null && !Labels.initGame.equals("");
    }
    /**
     * Sirve para revisar que los strings no sean nulos ni vacios
     */
    @Test
    void validateGameTitleLabelIsNotNull() {
        assert Labels.gameTitle != null && !Labels.gameTitle.equals("");
    }
    /**
     * Sirve para revisar que los strings no sean nulos ni vacios
     */
    @Test
    void validateOnePlayerLabelIsNotNull() {
        assert Labels.onePlayerText != null && !Labels.onePlayerText.equals("");
    }
    /**
     * Sirve para revisar que los strings no sean nulos ni vacios
     */
    @Test
    void validateTwoPlayerLabelIsNotNull() {
        assert Labels.twoPlayerText != null && !Labels.twoPlayerText.equals("");
    }
}
