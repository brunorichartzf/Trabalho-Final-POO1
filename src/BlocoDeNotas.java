import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class BlocoDeNotas{
    static HashMap<String,Nota> BlocoDeNotas = new HashMap<>();
    final static String output = "resources/hashmap.txt";

    public void Anotar(String titulo, String texto){
        Nota nota = new Nota(titulo, texto);
        BlocoDeNotas.put(titulo,nota);
    }

    public void Apagar(String titulo){
        BlocoDeNotas.get(titulo).Apagar(BlocoDeNotas.get(titulo).getPath());
        BlocoDeNotas.remove(titulo);
    }

    public String getNota(String titulo){
        return BlocoDeNotas.get(titulo).getTitulo() + BlocoDeNotas.get(titulo).getTexto();
    }

    public static void ApagaTudo(){

    for (String name : BlocoDeNotas.keySet()) {
        try{
            Files.delete(Paths.get("resources/"+name+".txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    }

}
