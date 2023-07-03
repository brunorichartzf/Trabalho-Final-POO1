import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        if (BlocoDeNotas.get(titulo) == null) {
            System.out.println("Não há uma nota com esse título");
        }else{
            BlocoDeNotas.get(titulo).Apagar(BlocoDeNotas.get(titulo).getPath());
            BlocoDeNotas.remove(titulo);
        }

    }

    public void Ler(String titulo){
        if (BlocoDeNotas.get(titulo) == null) {
            System.out.println("Não há uma nota com esse título");
        }else{
            System.out.println("\nTítulo: "+ titulo+"\n\nConteúdo:\n"+ BlocoDeNotas.get(titulo).getTexto());
        }

    }

    public static void salvar(){
        try{
            BufferedWriter a = new BufferedWriter(new FileWriter("resources/data/hashmap.txt"));
            Set<String> keys = BlocoDeNotas.keySet();
            for(String key: keys) {
                a.write(key+" "+BlocoDeNotas.get(key).getTexto());
                a.newLine();
            }
            a.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void carregar(){
        try{
            Scanner scan = new Scanner(new File("resources/data/hashmap.txt"));
            while(scan.hasNextLine()) {
                String[] entry = scan.nextLine().split(" ");
                Nota nota = new Nota(entry[0], entry[1]);
                BlocoDeNotas.put(entry[0], nota);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getTitulo(String titulo){
        return BlocoDeNotas.get(titulo).getTitulo();
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

    public void mostrar() {
        for (String name : BlocoDeNotas.keySet()) {
            System.out.println(name);
        }
    }

    public boolean vazio(){
        return BlocoDeNotas.isEmpty();
    }
}
