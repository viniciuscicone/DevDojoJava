package sup;

public class Sup {

    public static void main(String[] args) {
        Pessoa aqui = new Pessoa("reinaldo");
        Ser novo = new Ser();
        System.out.print(novo.getTipo());
    }
}
class Ser {
    private String tipo = "nao preenchido";

    public Ser(String tipo) {
        this.tipo = tipo;
    }
    public Ser() {}
    public String getTipo() {
        return tipo;
    }
}
class Pessoa extends Ser {
    private String nome;
    public Pessoa(String nome) {
        super("gato");
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}