package exercicio6;


import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MeuPrimeiroTeste.class, ValidacaoVerdadeiroFalso.class,
                    ValidacaoIgualdade.class, PreCondicoesDeTeste.class,
                    PreEPosCondicoesDaClasse.class})
public class SuiteDeTeste {
}
