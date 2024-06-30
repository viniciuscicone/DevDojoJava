package fac;

public class App {

    public static void main(String[] args) {

        new Router().run();

    }
}


class Router {

    FazerAlgo d;

    public void run() {

      
        System.out.println(" INICIO  ");

        System.out.println("nome :  " + new FazerAlgo(new Usuario()).usuario1.getNome() +" ");

        System.out.println(" Fim ");

    }

}


class FazerAlgo {
    
    Usuario usuario1;

    public FazerAlgo(Usuario usuario1) {
        this.usuario1 = usuario1;
    }
}


class Usuario {

    String nome = "vini";

    public String getNome() {
        return this.nome;
    }
}


class Usuario2 {

    String nome = "jorge";

    public String getNome2() {
        return this.nome;
    }
}

