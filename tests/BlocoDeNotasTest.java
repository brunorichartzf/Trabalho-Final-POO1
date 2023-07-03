import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlocoDeNotasTest {

    @Test
    public void criarNotasComNomeIgual(){
        BlocoDeNotas.ApagaTudo();
        BlocoDeNotas Bloco = new BlocoDeNotas();
        Bloco.Anotar("abc","original");
        Bloco.Anotar("abc","duplicado");
        assertEquals("original",Bloco.getTexto("abc"),"Notas com nomes iguais não podem ser criadas");
    }

    @Test
    public void criarNotaSemTitulo(){
        BlocoDeNotas.ApagaTudo();
        BlocoDeNotas Bloco = new BlocoDeNotas();
        Bloco.Anotar("","");
        assertTrue(Bloco.Vazio(), "Notas sem título não podem ser criadas");

    }

    @Test
    public void apagarNotaComNomeQueNaoExiste(){
        BlocoDeNotas.ApagaTudo();
        BlocoDeNotas Bloco = new BlocoDeNotas();
        Assertions.assertDoesNotThrow(() -> {
            Bloco.Apagar("nao existe");
        }, "Não pode apagar algo que não existe");

    }

    @Test
    public void lerNotaComNomeQueNaoExiste(){
        BlocoDeNotas.ApagaTudo();
        BlocoDeNotas Bloco = new BlocoDeNotas();
        Assertions.assertDoesNotThrow(() -> {
            Bloco.Ler("nao existe");
        }, "Não pode ler algo que não existe");

    }



}
