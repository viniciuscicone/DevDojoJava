package injection.cnst;

public class App {
    public static void main(String[] args) {
        Func func = new Func("joao", 24);
        System.out.printf(func.nome + " -- " + func.idade);
    }
}


class Func{

    String nome;
    int idade;

    public Func(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}