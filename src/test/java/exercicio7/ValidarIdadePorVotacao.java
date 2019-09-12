package exercicio7;

import votacao.Votacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarIdadePorVotacao {

    @Test
    public void idadeIgual15Anos_NaoPodeVotar(){
        String resultadoObtido = Votacao.podeVotar("Maria", 2004);

    assertEquals("Maria voce nao pode votar", resultadoObtido);
    }

    @Test
    public void idadeIgual16Anos_VotoFacultativo(){
        String resultadoObtido = Votacao.podeVotar("Rodrigo", 2003);

        assertEquals("Rodrigo seu voto e facultativo", resultadoObtido);
    }

    @Test
    public void idadeIgual17Anos_VotoFacultativo(){
        String resultadoObtido = Votacao.podeVotar("Joao", 2002);

        assertEquals("Joao seu voto e facultativo", resultadoObtido);
    }

    @Test
    public void idadeIgual18Anos_VotoObrigatorio(){
        String resultadoObtido = Votacao.podeVotar("Carla", 2001);

        assertEquals("Carla seu voto e obrigatorio", resultadoObtido);
    }

    @Test
    public void idadeIgual25Anos_VotoObrigatorio(){
        String resultadoObtido = Votacao.podeVotar("Jose", 1994);

        assertEquals("Jose seu voto e obrigatorio", resultadoObtido);
    }

    @Test
    public void idadeIgual70Anos_VotoObrigatorio(){
        String resultadoObtido = Votacao.podeVotar("Ana", 1949);

        assertEquals("Ana seu voto e obrigatorio", resultadoObtido);
    }

    @Test
    public void idadeIgual71Anos_VotoFacultativo(){
        String resultadoObtido = Votacao.podeVotar("Pedro", 1948);

        assertEquals("Pedro seu voto e facultativo", resultadoObtido);
    }
}
