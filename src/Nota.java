import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Nota {
    private String texto;
    private String titulo;
    private String path;

    public Nota(String titulo, String texto){
        this.texto = texto;
        this.titulo = titulo;

        try{
            Files.write(Paths.get("resources/"+titulo+".txt"), texto.getBytes());
            this.path = "resources/"+titulo+".txt";
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void Apagar(String path){
        Path p1 = Paths.get(path);
        try{
            Files.delete(p1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPath() {return path;}
}
