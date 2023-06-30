import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BlocoDeNotas Bloco = new BlocoDeNotas();
        
        Boolean continua = true;
        String opcao = "";
        String tit = "";
        String text = "";

        while(continua == true){
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
                
            break;
            case "2":
                System.out.println("Digite o título da nota a ser lida: ");
                Bloco.mostrar();
                tit = input.nextLine();
                System.out.println("\nTítulo: "+Bloco.getTitulo(tit)+"\n\nConteúdo:\n"+Bloco.getTexto(tit));
                System.out.println("\nAperte ENTER para voltar.");
                input.nextLine();

            break;
            case "3":
            System.out.println("Digite o título da nota a ser excluída: ");
            Bloco.mostrar();
            tit = input.nextLine();
            System.out.println("\nApagando...\n");
            Bloco.Apagar(tit);
            System.out.println("\nAperte ENTER para voltar.");
            input.nextLine();

            break;
            case "4":
            System.out.println("Notas encontrada:\n\n");
            Bloco.mostrar();
            System.out.println("\nAperte ENTER para voltar.");
            input.nextLine();

            break;
            case "99":
            continua = false;
            Bloco.ApagaTudo();
            break;
            default:
            break;
        }

        }
    }
}