public class Main {
    public static void main(String[] args) {
        BlocoDeNotas Bloco = new BlocoDeNotas();
        Bloco.Anotar(0, "TITULO", "TEXTO");
        System.out.println(Bloco.getNota(0));
    }
}