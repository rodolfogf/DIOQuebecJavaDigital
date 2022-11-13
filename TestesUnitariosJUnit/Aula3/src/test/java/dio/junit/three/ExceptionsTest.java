package dio.junit.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarExcepcionTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                contaOrigem.transferirEntreContas(contaDestino, -1));
    }

    @Test
    void validarExcepcionTransferencia2(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        Assertions.assertDoesNotThrow(() -> contaOrigem.transferirEntreContas(contaDestino, 10));
    }
}
