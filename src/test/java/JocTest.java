import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JocTest {


    @Test
    void nova_partida_checktorn() {
        Joc joc = new Joc();
        joc.novaPartida();
        Assertions.assertEquals(1, joc.getTorn());
    }

    @Test
    void nova_partida_checktorn2False() {
        Joc joc = new Joc();
        joc.novaPartida();
        Assertions.assertFalse(joc.getTorn() == 2);
    }

    void novaPartida_taullel() {
        Joc joc = new Joc();
        joc.novaPartida();


    }

}