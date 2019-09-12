package exercicio4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class PreCondicoesDeTeste {
    @Before
    public void preCondicao(){
        System.out.println("Pré-condição");
    }

    @Test
    public void teste1(){
        System.out.println("Teste 1");
    }

    @Test
    public void teste2(){
        System.out.println("Teste 2");
    }

    @After
    public void posCondicao(){
        System.out.println("Pós-condição");
    }
}
