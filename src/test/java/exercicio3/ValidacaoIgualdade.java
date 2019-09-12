package exercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoIgualdade {
    @Test
    public void validacaoIgualdade_Sucesso(){
        String resultadoObtido = "Registro salvo com sucesso!";
        assertEquals("Registro salvo com sucesso!", resultadoObtido);
    }

    @Test
    public void validacaoIgualdade_Falha(){
        String resultadoObtido = "Registro excluído com sucesso!";
        assertEquals("Resultado salvo com sucesso!", resultadoObtido);
    }
}
