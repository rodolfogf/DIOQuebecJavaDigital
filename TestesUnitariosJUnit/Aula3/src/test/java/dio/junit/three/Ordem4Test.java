package dio.junit.three;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class Ordem4Test {

    @DisplayName("C")
    @Test
    void testarA(){
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 12, 0, 0));

        Assertions.assertEquals(22, jessica.getIdade());
    }

    @DisplayName("B")
    @Test
    void testarB(){
        Pessoa tester = new Pessoa("Tester",
                LocalDateTime.of(2004, 11, 12, 0, 0, 1));
        Assertions.assertTrue(tester.verificarMaiorDeIdade());
    }

    @DisplayName("A")
    @Test
    void testarC(){
         Pessoa dev = new Pessoa("Dev",
                LocalDateTime.of(2021, 11, 12, 0, 0, 1));
        Assertions.assertFalse(dev.verificarMaiorDeIdade());
    }
}
