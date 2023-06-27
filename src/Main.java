import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        BlocoDeNotas Bloco = new BlocoDeNotas();
        String input = leitor.nextLine();

        String tit = input;
        input = leitor.nextLine();
        String tex = input;
        Bloco.Anotar(tit, tex);
        System.out.println(Bloco.getNota(tit));
        //int inputao = leitor.nextInt();
        //int id = inputao;
        //Bloco.Apagar(inputao);
        System.out.println(Bloco.BlocoDeNotas.isEmpty());
    }
}