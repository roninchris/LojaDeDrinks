import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExibicao {

    static String nomeCliente;

    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Hasagi! \n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠤⠀⠒⠒⠂⠐⠒⢢⡦⠆⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠊⠀⠀⠀⠀⠀⠀⠀⠀⠋⢰⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⢑⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠈⠂⠀⠀⠀⠀⠀⠀⠀⢀⠀⡺⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡠⠲⠛⠈⠙⠹⠳⡆⠂⠀⠀⠂⢒⡩⠓⠈⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢰⠁⢀⡀⢀⣤⣄⡀⢈⡗⠒⠬⠙⠧⠴⠋⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣣⣡⡭⠉⠀⡸⡇⡀⠀⣱⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣿⠣⠌⠁⠈⠄⠌⣷⠠⠅⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠙⢢⡤⡂⡠⠤⣰⡁⡓⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡔⢓⢄⢖⢙⡿⢀⡾⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢰⡫⢑⢥⠖⢣⠗⠁⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠰⣤⣮⣥⠤⣼⣷⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠿⠷⢿⠟⠷⣝⢏⣽⡶⠶⠶⠶⠶⠶⠶⠶⢶⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⠑⢠⠣⠦⣽⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢾⢽⢶⣟⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⢾⢼⢺⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠘⠑⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                "----------  Drinks Do Yasuo ----------");

        System.out.println();
        System.out.println("1 - Fazer pedido");
        System.out.println("0 - Sair");
        System.out.println();
        System.out.println("Escolha uma Opção: ");
        try {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next();
                    pedido(nome);
                case 0:
                    System.out.println("Tenha um ótimo dia! ヽ(♡‿♡)ノ");
                    break;
                default:
                    System.out.println("Erro -> Opção Inválida!");
                    menu();
            }
        }catch(InputMismatchException e){
            System.out.println("Ei! Por favor digite um número! ୧(•̀ᗝ•́)૭");
            menu();
        }
    }
    private static void pedido(String nome) {
        MenuExibicao.nomeCliente = nome;
        Scanner sc = new Scanner(System.in);
        Carrinho pedido = new Carrinho(nome);

        while (true) {
            Cardapio.cardapio();
            try {
                System.out.println("Selecione sua alternativa: ");
                int bebida = sc.nextInt();

                if (bebida == 0) {
                    System.out.println("A taxa é de 10%, caso queira alterar, digite 'sim', caso contrário, digite qualquer coisa.");
                    String res = sc.next();

                    if (res.equals("sim")) {
                        System.out.println("Insira a nova taxa:");
                        int t = sc.nextInt();
                        float taxafinal = (float) (1 + (t * 0.01));
                        pedido.pagamentoValor(taxafinal);
                        pagamento(pedido.pagamentoValor(taxafinal), pedido);
                    } else {
                        pedido.pagamentoValor();
                        pagamento(pedido.pagamentoValor(), pedido);
                    }
                    menu();
                } else {
                    if (bebida >= 1 && bebida <= 8) {
                        String dosagem = selecionarDosagem(sc);
                        adicionarBebida(bebida, dosagem, pedido);
                        continue;
                    } else {
                        System.out.println("Opção Inválida!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor digite um número!");
            }
        }
    }

    private static String selecionarDosagem(Scanner sc) {
        String dosagem = "";
        while (true) {
            System.out.println("Escolha a Dosagem - (200ml/380ml)");
            dosagem = sc.next();
            if (dosagem.equals("200ml") || dosagem.equals("380ml")) {
                break;
            } else {
                System.out.println("Insira uma opção válida!");
            }
        }
        return dosagem;
    }

    private static void adicionarBebida(int bebida, String dosagem, Carrinho pedido) {
        String nomeBebida = "";
        float precoBebida = 0.0f;

        switch (bebida) {
            case 1 -> {
                nomeBebida = "Cosmopolitan";
                precoBebida = (dosagem.equals("380ml")) ? 10.0f : 7.0f;
            }
            case 2 -> {
                nomeBebida = "Soda Italiana";
                precoBebida = (dosagem.equals("380ml")) ? 12.90f : 8.50f;
            }
            case 3 -> {
                nomeBebida = "Manhattan";
                precoBebida = (dosagem.equals("380ml")) ? 18.90f : 14.50f;
            }
            case 4 -> {
                nomeBebida = "Bloody MaRiven";
                precoBebida = (dosagem.equals("380ml")) ? 19.90f : 14.90f;
            }
            case 5 -> {
                nomeBebida = "Monster";
                precoBebida = (dosagem.equals("380ml")) ? 15.00f : 8.00f;
            }
            case 6 -> {
                nomeBebida = "RedBull (Alistar)";
                precoBebida = (dosagem.equals("380ml")) ? 13.00f : 8.50f;
            }
            case 7 -> {
                nomeBebida = "Fusion";
                precoBebida = (dosagem.equals("380ml")) ? 11.50f : 8.50f;
            }
            case 8 -> {
                nomeBebida = "TNT";
                precoBebida = (dosagem.equals("380ml")) ? 12.00f : 7.50f;
            }
        }
        pedido.add(new Energetico(nomeBebida, dosagem, precoBebida));
    }

    private static void pagamento(float valor,Carrinho pedido){
        Scanner sc =new Scanner(System.in);
        System.out.println("Valor Recebido: ");
        float pag =sc.nextFloat();

        float vtotal = pag-valor;
        pedido.recibo();
        System.out.printf("Valor Pago: %.2f Troco: %,.2f\n", pag, vtotal);
        System.out.println("Obrigado," + nomeCliente);
        System.out.println();
        System.out.println("''Seria o único propósito da folha o de cair?''");

    }
}