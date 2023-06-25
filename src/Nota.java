public class Nota {
    private String texto;
    private String titulo;
    private int id; //ID é temporário até eu entender como usar a classe de data.

    public Nota(int id, String titulo, String texto){
        this.texto = texto;
        this.titulo = titulo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

}
