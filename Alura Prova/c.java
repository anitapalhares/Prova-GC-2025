public class c {
    String nome;
    int quantidade;

    public c(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public c(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        c x = new c("Caderno");
        c y = new c("Caneta", 3);
        System.out.println(x.quantidade + y.quantidade);
    }
}
