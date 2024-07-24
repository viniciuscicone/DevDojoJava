package sup;

import static java.lang.System.*;

public class Sup {

    public static void main(String[] args) {
        try {
            System.exit(0);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Pessoa aqui = new Pessoa("reinaldo");
        Ser novo = new Ser();
        out.print(novo.getTipo());
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

class mn {
    private String nome;
    public mn(String nome) {

    }
    public String getNome() {
        return nome;
    }
}