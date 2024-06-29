package fac;

public class App {

    public static void main(String[] args) {

        new Router().run();

    }
}


class Router {

    FazerAlgo d = new FazerAlgo();

    public void run() {

      
        System.out.println(" INICIO  ");

        System.out.println("nome :  " + d.doSome() +" ");

        System.out.println(" Fim ");

    }

}


class FazerAlgo {
    
    Usuario usuario1 = new Usuario();
    
    public String doSome() {

        return usuario1.nome;
        
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

