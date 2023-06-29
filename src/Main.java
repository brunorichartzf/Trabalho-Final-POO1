import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        BlocoDeNotas Bloco = new BlocoDeNotas();
        System.out.print("Digite o título da primeira nota: ");
        String input = leitor.nextLine();
        String tit = input;
        System.out.print("Digite o conteúdo da primeira nota: ");
        input = leitor.nextLine();
        String tex = input;
        Bloco.Anotar(tit, tex);

        System.out.print("Digite o título da segunda nota: ");
        input = leitor.nextLine();
        tit = input;
        System.out.print("Digite o conteúdo da segunda nota: ");
        input = leitor.nextLine();
        tex = input;
        Bloco.Anotar(tit, tex);

        System.out.print("Digite enter para finalizar:");
        leitor.nextLine();

        BlocoDeNotas.ApagaTudo();
    }
}