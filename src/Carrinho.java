import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> pedido;
    private String nome;

    private float taxaServico;
    private float valorTotal;

    public Carrinho(){
        pedido = new ArrayList<>();
        this.taxaServico = 1.10f;
        this.valorTotal =0f;
    }
    public void add(Produto produto){
        pedido.add(produto);
        System.out.println("Seu " + produto.getNome() + " foi adicionado ao carrinho! ");
    }
    public float pagamentoValor(){
        float valor =0f;
        for (Produto p:pedido){
            valor+=p.getPreco();
        }
        valor=valor*taxaServico;
        return valor;
    }
    public float pagamentoValor(float tax){
        float valor =0f;
        for (Produto p:pedido){
            valor+=p.getPreco();
        }
        valor=valor*tax;
        return valor;
    }
    public void recibo(){
        int i=0;
        System.out.println("------------RECIBO---------------");
        System.out.println("Cliente: "+ Main.nome);
        System.out.println("Produtos: ");
        for(Produto p:pedido){
            System.out.printf("%d : %15s  %.2f\n",i,p.getNome(),p.getPreco());
            i+=1;
        }
        System.out.println("Valor Total:  " + pagamentoValor());

    }

}
