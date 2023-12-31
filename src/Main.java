import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BlocoDeNotas Bloco = new BlocoDeNotas();
        BlocoDeNotas.Carregar();
        
        Boolean continua = true;
        String opcao;
        String tit;
        String text;

        while(continua){
            System.out.println("Bloco de Notas\n-----------------\n"+
        "1 - Adicionar Nota\n2 - Ler Nota\n3 - Apagar Nota\n"+
        "4 - Listar Notas\n99 - Sair\nSelecione uma opção\n"
        );
        opcao = input.nextLine();
        switch(opcao){
            case "1":
                System.out.println("Digite o título da nova nota: ");
                tit = input.nextLine();
                System.out.println("Digite o conteúdo da nova nota: ");
                text = input.nextLine();
                Bloco.Anotar(tit, text);
                BlocoDeNotas.Salvar();

            break;
            case "2":
                System.out.println("Digite o título da nota a ser lida: ");
                Bloco.Mostrar();
                tit = input.nextLine();
                Bloco.Ler(tit);
                System.out.println("\nAperte ENTER para voltar.");
                input.nextLine();

            break;
            case "3":
            System.out.println("Digite o título da nota a ser excluída: ");
            Bloco.Mostrar();
            tit = input.nextLine();
            System.out.println("\nApagando...\n");
            Bloco.Apagar(tit);
            BlocoDeNotas.Salvar();
            System.out.println("\nAperte ENTER para voltar.");
            input.nextLine();

            break;
            case "4":
            System.out.println("Notas encontradas:\n\n");
            Bloco.Mostrar();
            System.out.println("\nAperte ENTER para voltar.");
            input.nextLine();

            break;
            case "99":
            continua = false;
            input.close();
            break;
            default:
            break;
        }
        }
    }
}