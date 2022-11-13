package dio.junit.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.LocalDateTime;

public class AssumptionsTest {

    @Test
    void validarLogadoUsurioEspecifico(){
        Assumptions.assumeTrue("rodol".equals((System.getenv("USERNAME"))));
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "rodol")
    void validarLogadoUsurioEspecifico2(){
        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));
        Assertions.assertNotNull(teste);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validaSOEspecifico(){
        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));
        Assertions.assertNotNull(teste);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void validaSOsEspecificos(){
        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));
        Assertions.assertNotNull(teste);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void validarJREespecifico() {
        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));
        Assertions.assertNotNull(teste);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    void validarJREsespecificos() {
        Pessoa teste = new Pessoa("Teste",
                LocalDateTime.of(2000, 1, 1, 0, 0, 1));
        Assertions.assertNotNull(teste);
    }
}
