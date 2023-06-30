import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class BlocoDeNotas{
    static HashMap<String,Nota> BlocoDeNotas = new HashMap<>();

    public void Anotar(String titulo, String texto){
        if (BlocoDeNotas.get(titulo) != null) {
            System.out.println("Uma nota já tem esse título");
        }else if(titulo.equals("")){
            System.out.println("A nota deve conter um título");
        }else{
            Nota nota = new Nota(titulo, texto);
            BlocoDeNotas.put(titulo, nota);
        }
    }

    public void Apagar(String titulo){
        BlocoDeNotas.get(titulo).Apagar(BlocoDeNotas.get(titulo).getPath());
        BlocoDeNotas.remove(titulo);
    }

    public String getNota(String titulo){
        return BlocoDeNotas.get(titulo).getTitulo() + BlocoDeNotas.get(titulo).getTexto();
    }

    public String getTexto(String titulo){
        return BlocoDeNotas.get(titulo).getTexto();
    }

    public static void ApagaTudo(){

    for (String name : BlocoDeNotas.keySet()) {
        try{
            Files.delete(Paths.get("resources/"+name+".txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        BlocoDeNotas.clear();
    }

    public static void mostrar() {
        for (String name : BlocoDeNotas.keySet()) {
            System.out.println(name);
        }
    }

    public boolean vazio(){
        return BlocoDeNotas.isEmpty();
    }
}
