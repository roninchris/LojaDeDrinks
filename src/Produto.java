public class Produto {

    private final String nome;

    private final float preco;

    private String dosagem;

    public Produto(String nome, float preco, String dosagem) {
        this.nome = nome;
        this.preco = preco;
        this.dosagem = dosagem;
    }



    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
}
