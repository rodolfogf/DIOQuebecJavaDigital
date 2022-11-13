package dio.junit.three;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTest {

    @Order(3)
    @Test
    void testarA(){
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 12, 0, 0));

        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Order(2)
    @Test
    void testarB(){
        Pessoa tester = new Pessoa("Tester",
                LocalDateTime.of(2004, 11, 12, 0, 0, 1));
        Assertions.assertTrue(tester.verificarMaiorDeIdade());
    }

    @Order(1)
    @Test
    void testarC(){
         Pessoa dev = new Pessoa("Dev",
                LocalDateTime.of(2021, 11, 12, 0, 0, 1));
        Assertions.assertFalse(dev.verificarMaiorDeIdade());
    }

}
