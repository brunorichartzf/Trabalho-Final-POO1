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
        assertTrue(Bloco.vazio(), "Notas sem título não podem ser criadas");

    }


}
