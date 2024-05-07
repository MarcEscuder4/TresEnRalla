import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JocTest {

    @Test
    void novaPartida() {
        Joc joc =  new Joc();
        joc.novaPartida();

        joc.getTorn();
        joc.getTaulell();
    }
}