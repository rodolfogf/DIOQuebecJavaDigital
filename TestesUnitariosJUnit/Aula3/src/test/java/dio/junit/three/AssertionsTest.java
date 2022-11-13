package dio.junit.three;

import org.junit.jupiter.api.Assertions;

/* Maneiras diferentes de fazer a importação para evitar sempre escrever Assertions.
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
*/

import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

public class AssertionsTest {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void validarLancamentos2(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo(){

        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));

        Assertions.assertNotNull(teste);
    }
}
