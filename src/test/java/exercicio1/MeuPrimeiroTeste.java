package exercicio1;

import org.junit.Test;

public class MeuPrimeiroTeste {

    @Test
    public void teste1(){
        System.out.println("Test1 executado.");
    }

    @Test
    public void teste2(){
        System.out.println("Test2 executado.");
    }

    public void naoEUmTeste(){
        System.out.println("Esta mensagem não deve aparecer!");
    }
}
