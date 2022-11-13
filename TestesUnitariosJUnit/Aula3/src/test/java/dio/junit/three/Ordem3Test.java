package dio.junit.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDateTime;

@TestMethodOrder(MethodOrderer.Random.class)
public class Ordem3Test {

    @Test
    void testarA(){
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 12, 0, 0));

        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void testarB(){
        Pessoa tester = new Pessoa("Tester",
                LocalDateTime.of(2004, 11, 12, 0, 0, 1));
        Assertions.assertTrue(tester.verificarMaiorDeIdade());
    }

    @Test
    void testarC(){
         Pessoa dev = new Pessoa("Dev",
                LocalDateTime.of(2021, 11, 12, 0, 0, 1));
        Assertions.assertFalse(dev.verificarMaiorDeIdade());
    }
}
