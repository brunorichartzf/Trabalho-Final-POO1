import java.util.HashMap;

public class BlocoDeNotas{
    HashMap<Integer,Nota> BlocoDeNotas = new HashMap<>();
    
    public void Anotar(int id, String titulo, String texto){
        Nota nota = new Nota(id, texto, titulo);
        BlocoDeNotas.put(nota.getId(),nota);
    }

    public String getNota(int id){
        return BlocoDeNotas.get(id).getTitulo() + BlocoDeNotas.get(id).getTexto();
    }

}
