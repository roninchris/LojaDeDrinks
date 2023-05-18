import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String nome;

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
            int opcao = sc.nextInt();
            switch (opcao) {
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
    private static void pedido(String nome){
        Main.nome = nome;
        Scanner sc =new Scanner(System.in);
        Carrinho pedido = new Carrinho();

        while (true){
            Cardapio.cardapio();
            try {
                System.out.println("Escolha sua Opção: ");
                int bebida = sc.nextInt();

                switch (bebida) {
                    case 1:
                        String dos="";
                        try{
                            while (true){
                                System.out.println("Escolha a Dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Drink("Cosmopolitan",dos,(dos.equals("380ml"))?10.0f:7.0f));
                        continue;
                    case 2:
                        String dos2="";
                        try{
                            while (true){
                                System.out.println("Escolha a Dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos2 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Ops! - Valor inválido!");
                        }

                        pedido.add(new Drink("Soda Italiana",dos2,(dos2.equals("380ml"))?12.90f:8.50f));
                        continue;
                    case 3:
                        String dos3="";
                        try{
                            while (true){
                                System.out.println("Escolha a Dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos3 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Drink("Manhattan",dos3,(dos3.equals("380ml"))?18.90f:14.50f));
                        continue;
                    case 4:
                        String dos4="";
                        try{
                            while (true){
                                System.out.println("Escolha a dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos4 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Drink("Bloody MaRiven",dos4,(dos4.equals("380ml"))?19.90f:14.90f));
                        continue;
                    case 5:
                        String dos5="";
                        try{
                            while (true){
                                System.out.println("Escolha a dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos5 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Energetico("Monster",dos5,(dos5.equals("380ml"))?15.00f:8.00f));
                        continue;
                    case 6:
                        String dos6="";
                        try{
                            while (true){
                                System.out.println("Escolha a dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos6 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Energetico("RedBull (Alistar)",dos6,(dos6.equals("380ml"))?13.00f:8.50f));
                        continue;
                    case 7:
                        String dos7="";
                        try{
                            while (true){
                                System.out.println("Escolha a Dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos7 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Energetico("Fusion",dos7,(dos7.equals("380ml"))?11.50f:8.50f));
                        continue;
                    case 8:
                        String dos8="";
                        try{
                            while (true){
                                System.out.println("Escolha a Dosagem: (200ml/380ml)");
                                String dosagem = sc.next();
                                if (dosagem.equals("200ml") | dosagem.equals("380ml")){
                                    dos8 = dosagem;
                                    break;
                                }else{
                                    System.out.println("Insira uma opção válida!");
                                }
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Valor inválido!");
                        }
                        pedido.add(new Energetico("TNT",dos8,(dos8.equals("380ml"))?12.00f:7.50f));
                        continue;
                    case 0:
                        System.out.println("A taxa padrão é 10% deseja alterar? (S/N) ");
                        String res= sc.next();
                        if(res.equals("S")){
                            System.out.println("Digite a nova taxa: ");
                            int t = sc.nextInt();
                            float taxafinal=1+(t/100);
                            pedido.pagamentoValor(taxafinal);
                            pagamento(pedido.pagamentoValor(taxafinal),pedido);
                        }else{
                            pedido.pagamentoValor();
                            pagamento(pedido.pagamentoValor(),pedido);
                        }
                        menu();
                    default:
                        System.out.println("Opção Inválida!");

                }


            }catch(InputMismatchException e){
                System.out.println("Por favor digite um número!");
            }
        }
    }
    private static void pagamento(float valor,Carrinho pedido){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor Recebido: ");
        float pag =sc.nextFloat();

        float vtotal = pag-valor;
        pedido.recibo();
        System.out.printf("Valor Pago: " + pag + " Troco: %.2f\n",vtotal);
        System.out.println("Obrigado," + nome);
        System.out.println();
        System.out.println("''Seria o único propósito da folha o de cair?''");

    }
}
