import java.util.HashMap;

public class BlocoDeNotas{
    HashMap<String,Nota> BlocoDeNotas = new HashMap<>();
    
    public void Anotar(String titulo, String texto){
        Nota nota = new Nota(titulo, texto);
        BlocoDeNotas.put(titulo,nota);
    }

    public void Apagar(int id){
        BlocoDeNotas.get(id).Apagar(BlocoDeNotas.get(id).getPath());
        BlocoDeNotas.remove(id);
    }

    public String getNota(String titulo){
        return BlocoDeNotas.get(titulo).getTitulo() + BlocoDeNotas.get(titulo).getTexto();
    }

}
