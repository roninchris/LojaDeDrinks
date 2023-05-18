import java.util.ArrayList;

public class Carrinho {
    private final ArrayList<Produto> pedido;

    private final float gorjeta;

    public Carrinho(String nome){
        pedido = new ArrayList<>();
        this.gorjeta = 1.10f;
        float valorTotal = 0f;
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
        valor=valor*gorjeta;
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
        System.out.println("Cliente: "+ MenuExibicao.nomeCliente);
        System.out.println("Produtos: ");
        for(Produto p:pedido){
            System.out.printf("%d : %15s  %.2f\n",i,p.getNome(),p.getPreco());
            i+=1;
        }
        System.out.println("Valor Total:  " + pagamentoValor());

    }

}
