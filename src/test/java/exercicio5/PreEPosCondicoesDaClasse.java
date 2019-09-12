package exercicio5;

import org.junit.*;

public class PreEPosCondicoesDaClasse {
    @BeforeClass
    public static void preCondicao_AntesClasse(){
        System.out.println("Pré-condição de Classe");
    }

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

    @AfterClass
    public static void posCondicao_DepoisClasse(){
        System.out.println("Pós-condição de Classe");
    }
}
