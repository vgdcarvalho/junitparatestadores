package exercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoVerdadeiroFalso {

    @Test
    public void validacaoVerdadeiro_Suceso(){
        boolean campoEstaPresente = true;
        assertTrue(campoEstaPresente);
    }

    @Test
    public void validacaoVerdadeiro_Falha(){
        boolean campoEstaPresente = true;
        assertFalse("Campo está presente.",campoEstaPresente);
    }
}
