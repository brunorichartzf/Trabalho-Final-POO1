import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class BlocoDeNotas{
    static HashMap<String,Nota> BlocoDeNotas = new HashMap<>();
    final static String output = "resources/hashmap.txt";

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

    public static void salvar(){
        File file = new File(output);
        BufferedWriter bf = null;

        try{
            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<String, Nota> entry :
                    BlocoDeNotas.entrySet()) {

                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                bf.newLine();
            }
            bf.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {

            try {
                bf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    /*
    public carregar(){
        File file = new File(output);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");

                String titulo = parts[0].trim();
                String texto = parts[1].trim();
                if (!titulo.equals("") && !texto.equals(""))
                    BlocoDeNotas.put(titulo, texto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }

        return BlocoDeNotas;

        }
*/

    public static void mostrar(){
    for (String name : BlocoDeNotas.keySet()) {
        System.out.println(name);
    }
    }

}
